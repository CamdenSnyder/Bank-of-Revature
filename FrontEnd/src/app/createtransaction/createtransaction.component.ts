import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-createtransaction',
  templateUrl: './createtransaction.component.html',
  styleUrls: ['./createtransaction.component.css']
})
export class CreatetransactionComponent implements OnInit {

  msg:any
  Time: string;
  constructor(private _auth:AuthService,private router:Router) {
    var today = new Date();
    console.log(today.getMonth()+'/'+today.getDate()+'/'+today.getFullYear())
    this.Time=today.getMonth()+'/'+today.getDate()+'/'+today.getFullYear();
   }

  ngOnInit(): void {
  }

  CreateTransaction (account_id:any, amount:any, form: any) {
    account_id = parseInt(account_id)
    const trans_type = form.type
    
    const trans_date = this.Time;
    amount=parseFloat(amount)

    if(account_id != NaN && trans_type != "" && trans_date != "" && amount != NaN){

    const accountData={account_id,trans_type ,trans_date,amount};
    console.log(accountData);
    this._auth.CreateTransaction(accountData).subscribe(res => {
        if(res==true)
        {
          this.msg="Transaction Done"
        }
        else{
          this.msg="Something wrong with happends try again later"
        }
      })
      
    }else{
      this.msg="Please fill out all details"
    }
  }

}
