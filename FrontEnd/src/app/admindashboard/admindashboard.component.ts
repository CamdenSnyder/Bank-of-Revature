import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {
  showDiv:any
  constructor() { }

  ngOnInit(): void {
  this.showDiv='profile'
  }
  clickOnDiv(divname:any){
    this.showDiv=divname
  }

}
