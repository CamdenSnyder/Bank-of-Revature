import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _auth:AuthService , private router:Router,private http: HttpClient) { }
  userMsg:any
  ngOnInit(): void {
    localStorage.clear()
    
  }

  Login(email :any,pass :any)
  {
    if(pass.toString() != "" && email.toString() != "")
    {

    
        const UserData={email,pass};
        this._auth.LoginMethod(UserData).subscribe(res => {
          console.log(res)
          if(parseInt(res)==0)
          {
            this.userMsg="Invalid Data"
          }
          if(parseInt(res)==-1)
          {
            this.userMsg="Something Wrong with Server Try Again Please"
          }
          if(parseInt(res)>0)
          {
            console.log(res)
            localStorage.setItem('user_id',res);
            this.http.get<any>(`http://localhost:8081/user/profile/${res}`).subscribe(data => {
  
              localStorage.setItem('name',data.user_first_name + data.user_last_name)
              if(data.user_role=="customer")
              {
                console.log('customer')
                this.router.navigate(['/dashboard'])
              }
  
              else if(data.user_role=='admin')
              {
                console.log('admin')
                console.log(true)
  
                this.router.navigate(['/admindashboard'])
              }
              else{
                this.userMsg='Something happend wrong'
                console.log(false)
              }
            
            
            })
            
          }
    });

  }
  else{
    this.userMsg="Pleases fill all details"
  }
}
}
