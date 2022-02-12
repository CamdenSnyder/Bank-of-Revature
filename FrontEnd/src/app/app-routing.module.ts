import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EnteremailComponent } from './enteremail/enteremail.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const routes: Routes = [

  {path: '', redirectTo: '/login', pathMatch: 'full' },
 {path: 'enteremail', component:EnteremailComponent},
  {path: 'forgotpassword/:id', component:ForgotpasswordComponent},
 {path: 'admindashboard', component:AdmindashboardComponent },
  {path: 'dashboard', component: DashboardComponent },
  {path: 'login', component: LoginComponent},
  {path: 'newuser', component:SignUpComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
