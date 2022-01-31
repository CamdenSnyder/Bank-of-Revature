import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-create-bank-account',
  templateUrl: './create-bank-account.component.html',
  styleUrls: ['./create-bank-account.component.css']
})
export class CreateBankAccountComponent implements OnInit {

  error:boolean | undefined
  constructor(private _auth:AuthService,private router:Router) {

   }

  ngOnInit(): void {

    this.error = false;
  }

  CreateAccount (user_id:any, acc_type:any, opening_date:any, acc_balance:any, branch_id:any) {
    user_id = parseInt(user_id)
    acc_type = acc_type.toString()
    opening_date = opening_date.toString()
    acc_balance=parseInt(acc_balance)
    branch_id=parseInt(branch_id)


    if(user_id != "" && acc_type != "" && opening_date != "" && acc_balance != "" &&
    branch_id != "" ){

    const accountData={acc_type,opening_date,acc_balance,branch_id,user_id};
    console.log(accountData);
    this._auth.CreateBankAccount(accountData).subscribe(res => {
  
      })
      
    }else{
      this.error = true
      this.router.navigate(['/create-bank-account']);
    }
  }
}
