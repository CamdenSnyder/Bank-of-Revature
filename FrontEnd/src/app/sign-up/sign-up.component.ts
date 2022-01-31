import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnyCatcher } from 'rxjs/internal/AnyCatcher';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  
  error:boolean | undefined
  constructor(private _auth:AuthService,private router:Router) { }

  ngOnInit(): void {

  this.error = false;
  }
  AddUser(user_id:any, user_first_name:any, user_last_name:any,user_add:any,
    user_city:any,user_state:any,user_phone:any,user_email:any,user_password:any,user_password2:any, user_dob:any, user_role:any)
  {
          user_id = parseInt(user_id)
          user_first_name = user_first_name.toString()
          user_last_name = user_last_name.toString()
          user_add = user_add.toString()
          user_city = user_city.toString()
          user_state = user_state.toString()
          user_phone = user_phone.toString()
          user_email = user_email.toString()
          user_password = user_password.toString()
          user_password2 = user_password2.toString()
          user_dob = user_dob.toString()
          user_role = user_role.toString()
          const UserData={user_id, user_first_name, user_last_name, user_add,
                        user_city, user_state,  user_phone,user_email, user_password, user_dob, user_role}
          console.log(UserData)
          
          //let errors = [];
          

          if(user_id != "" && user_first_name != "" && user_last_name != "" && user_add != "" &&
            user_city != "" && user_state != "" && user_phone != "" && user_email != "" && user_password != "" && 
            user_dob != "" && user_role != ""){
            if(user_password === user_password2){

                this._auth.SignInMethod(UserData).subscribe(res => {
  
                if (res==true) {
                  localStorage.setItem('user',user_email);
                  this.router.navigate(['/dashboard'])
                }
              })
            }else {
              //errors.push({ message: "Passwords do not match"});
              //console.error("Passwords do not match");
            }
          }else {
            this.error = true
            this.router.navigate(['/newuser']);
            //errors.push({message: "Please fill in all fields"});
            //console.log("Please fill in all fields");
          }

          //if(error == true){
            //this.router.navigate(['/newuser']);
          //}
  }

}
