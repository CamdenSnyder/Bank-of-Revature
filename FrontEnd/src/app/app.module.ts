import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HttpClientModule } from '@angular/common/http';
import { SignUpComponent } from './sign-up/sign-up.component';
import { CreateBankAccountComponent } from './create-bank-account/create-bank-account.component';

@NgModule({
  declarations: [
    
    AppComponent,
    LoginComponent,
    DashboardComponent,
    SignUpComponent,
    CreateBankAccountComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule
=======

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountsComponent } from './accounts/accounts.component';
import { TransactionsComponent } from './transactions/transactions.component';
import { NewaccountComponent } from './newaccount/newaccount.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { ProfileComponent } from './profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    DashboardComponent,
    AccountsComponent,
    TransactionsComponent,
    NewaccountComponent,
    AdmindashboardComponent,
    ForgotpasswordComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
>>>>>>> 60a8e78babacd6f78192fb69750c948a891d2c6c
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
