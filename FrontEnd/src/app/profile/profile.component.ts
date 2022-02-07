import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  @Input()profile:any
  error: boolean | undefined;
  contentmsg:any
  constructor(private _auth:AuthService, private router:Router) { }

  ngOnInit(): void {
    this._auth.UserInfo().subscribe(data => {
      this.profile=data
    console.log(data)})
    this.contentmsg="see more details"
  }
  isShow():void{
      if(this.contentmsg=='see more details')
      {
        this.contentmsg='hide details'
      }
      else{
        this.ngOnInit()
      }
  }
  logout():void{
    localStorage.clear()
    this.router.navigate(['/login'])
  }
  UpdateUser(user_phone:any,user_email:any)
  {
          const user_id = parseInt(this.profile.user_id)
          const  user_first_name = this.profile.user_first_name
          const  user_last_name = this.profile.user_last_name
          const user_address = this.profile.user_address
          const  user_city = this.profile.user_city
          const  user_state = this.profile.user_state
          user_phone = user_phone.toString()
          user_email = user_email.toString()
          const user_password = this.profile.user_password
          const  user_dob = this.profile.user_dob
          const  user_role = this.profile.user_role
          const UserData={user_id, user_first_name, user_last_name,user_address,
                        user_city, user_state,  user_phone,user_email, user_password, user_dob, user_role}
          console.log(UserData)
          
          if(user_phone != "" && user_email != ""){

              console.log(UserData)
              this._auth.UpdateInfoMethod(UserData).subscribe(res => {
                if (res==true) {
                  this.router.navigate(['/dashboard'])
                }
              })
          }else {
            this.error = true 
          }
}}
