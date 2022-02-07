import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

  error:any
  constructor(private _auth:AuthService,private router:Router,private activerouter: ActivatedRoute) { }

  ngOnInit(): void {
  }
  AddUser(password:any,user_password2:any)
  {
        
          password = password.toString()
          user_password2 = user_password2.toString()
          const UserData={password}
          console.log(UserData)
          
          //let errors = [];
          

          if(password != ""   ){
            if(password === user_password2){
              const id = Number(this.activerouter.snapshot.paramMap.get('id'));
                this._auth.UpdatePass(UserData,id).subscribe(res => {
  
                if (res==true) {
                  this.router.navigate(['/login'])
                }
                else {
                  this.error="Something wrong with Server try again later"
                 }
              })
            }else {
             this.error="Password doesnot match"
            }
          }else {
            this.error="Please fill all details"
          }
  }

}
