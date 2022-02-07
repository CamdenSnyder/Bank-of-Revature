import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-enteremail',
  templateUrl: './enteremail.component.html',
  styleUrls: ['./enteremail.component.css']
})
export class EnteremailComponent implements OnInit {

  error:any
  constructor(private _auth:AuthService,private router:Router) { }

  ngOnInit(): void {
  }
  AddUser(user_email:any)
  {
        
          user_email = user_email.toString()
          console.log(user_email)
          
          //let errors = [];
          

          if(user_email != ""  ){

                this._auth.Sendemail(user_email).subscribe(res => {
  
                if (res==true) {
                  this.router.navigate(['/login'])
                }
                else {
                  this.error="Something wrong with Server try again later"
                 }
              })
            
          }else {
            this.error="Please fill all details"
          }
  }

}
