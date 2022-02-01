import { Component } from '@angular/core';
<<<<<<< HEAD
=======

>>>>>>> 60a8e78babacd6f78192fb69750c948a891d2c6c
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
<<<<<<< HEAD
 

 Time:any
   helloMsg:any
  ngOnInit(): void {

    if(localStorage.getItem('cus')== null){
     
    }
    var today = new Date();
    var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
    this.Time=time;
    if(today.getHours()<5 || today.getHours()>21){
      this.helloMsg="Good Night!!"
    }
    else if(today.getHours()< 11 || today.getHours()>=5){
      this.helloMsg="Good Morning!!"
    }
    else if(today.getHours()<17 || today.getHours()>=11){
      this.helloMsg="Good Afternoon!!"
    }
    else if(today.getHours()<= 23 || today.getHours()>=17){
      this.helloMsg="Good Evening!!"
    }
    else{
      
    }
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
  title = 'BankOfRevature';
=======
  title = 'FrontEnd';
>>>>>>> 60a8e78babacd6f78192fb69750c948a891d2c6c
}
