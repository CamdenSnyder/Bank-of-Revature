import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css']
})
export class TransactionsComponent implements OnInit {

  transactions:any
  _trans_id=localStorage.getItem('cus');
  contentmsg: any;
  constructor(private _auth:AuthService) { }

  ngOnInit(): void {
    this._auth.TranInfo().subscribe(data => {
      this.transactions=data.slice(0,4)
    console.log(data)})
    this.contentmsg='see all transactions'
  }
  isShow():void{
    if(this.contentmsg=='see all transactions')
    {
      this._auth.TranInfo().subscribe(data => {
        this.transactions=data
      console.log(data)})
      this.contentmsg='hide old transactions'
    }
    else{
      this.ngOnInit()
    }
}
}
