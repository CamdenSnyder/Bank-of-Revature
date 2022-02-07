import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {
  accounts: any;

  constructor(private _auth:AuthService) { }

  ngOnInit(): void {  this._auth.AccInfo().subscribe(data => {
    this.accounts=data
    console.log(this.accounts[1])
  console.log(data)})
  }

}
