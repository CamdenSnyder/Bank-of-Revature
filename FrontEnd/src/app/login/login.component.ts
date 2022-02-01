import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
=======

>>>>>>> 60a8e78babacd6f78192fb69750c948a891d2c6c
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

<<<<<<< HEAD
  constructor(private _auth:AuthService , private router:Router) { }

  ngOnInit(): void {
    localStorage.setItem('cus','Noitem');
  }

  Login(email :any,pass :any)
  {
        const UserData={email,pass};
        this._auth.LoginMethod(UserData).subscribe(res => {
          if(parseInt(res)==0)
          {
            console.log("Invalid Data")
          }
          if(parseInt(res)==-1)
          {
            console.log("Something Wrong with Server Try Again Please")
          }
          if(parseInt(res)>0)
          {
            console.log(res)
            localStorage.setItem('user_id',res);
            this.router.navigate(['/dashboard'])
          }
    });

  }
=======
  constructor() { }

  ngOnInit(): void {
  }

>>>>>>> 60a8e78babacd6f78192fb69750c948a891d2c6c
}
