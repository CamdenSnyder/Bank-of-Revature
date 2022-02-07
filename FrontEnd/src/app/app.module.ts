import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SignUpComponent } from './sign-up/sign-up.component';
import { CreateBankAccountComponent } from './create-bank-account/create-bank-account.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountsComponent } from './accounts/accounts.component';
import { TransactionsComponent } from './transactions/transactions.component';
import { NewaccountComponent } from './newaccount/newaccount.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { ProfileComponent } from './profile/profile.component';
import { CreatetransactionComponent } from './createtransaction/createtransaction.component';
import { EnteremailComponent } from './enteremail/enteremail.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    AccountsComponent,
    TransactionsComponent,
    NewaccountComponent,
    AdmindashboardComponent,
    ForgotpasswordComponent,
    ProfileComponent,AppComponent,
    LoginComponent,
    DashboardComponent,
    SignUpComponent,
    CreateBankAccountComponent,
    CreatetransactionComponent,
    EnteremailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
