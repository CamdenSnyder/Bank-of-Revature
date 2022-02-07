import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
 Time:any
   helloMsg:any
  ngOnInit(): void {

  }
  
  is_selected!: String;
  onselect(slected:String)
 {

    this.is_selected=slected
 }
 myFunction() {
   console.log(localStorage.getItem('cus'));
  localStorage.getItem('cus');
}
  title = 'FrontEnd';
}
