import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-create-bank-account',
  templateUrl: './create-bank-account.component.html',
  styleUrls: ['./create-bank-account.component.css']
})
export class CreateBankAccountComponent implements OnInit {
  Time:any
  error:boolean | undefined
  msg:any
  constructor(private _auth:AuthService,private router:Router) {
    var today = new Date();
    console.log(today.getMonth()+'/'+today.getDate()+'/'+today.getFullYear())
    this.Time=today.getMonth()+'/'+today.getDate()+'/'+today.getFullYear();
   }

  ngOnInit(): void {

    this.error = false;
    
  }

  CreateAccount (user_id:any, acc_type:any, acc_balance:any, branch_id:any) {
    user_id = parseInt(user_id)
    acc_type = acc_type.toString()
   var  opening_date = this.Time.toString()
    acc_balance=parseInt(acc_balance)
    branch_id=parseInt(branch_id)


    if(user_id != "" && acc_type != "" && opening_date != "" && acc_balance != NaN &&
    branch_id != NaN ){

    const accountData={acc_type,opening_date,acc_balance,branch_id,user_id};
    console.log(accountData);
    this._auth.CreateBankAccount(accountData).subscribe(res => {
        if(res>0)
        {
          this.msg=`Account Created With Account ID: ${res}`
        }
      })
      
    }else{
      this.error = true
     
    }
  }
}
