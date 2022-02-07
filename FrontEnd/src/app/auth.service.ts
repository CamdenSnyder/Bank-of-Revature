import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }
  private loginUrl= "http://localhost:8081/user/login";
  LoginMethod(user:any)
  {
      return this.http.post<any>(this.loginUrl,user)
  }
  private signupUrl= "http://localhost:8081/user/new_user";
  SignInMethod(user:any)
  {
      return this.http.post<any>(this.signupUrl,user)
  }
  private updateInfoUrl= `http://localhost:8081/user/profile_update/${localStorage.getItem('user_id')}`;
  UpdateInfoMethod(user:any)
  {
      return this.http.put<any>(`http://localhost:8081/user/profile_update/${localStorage.getItem('user_id')}`,user)
  }
  private userUrl = `http://localhost:8081/user/profile/${localStorage.getItem('user_id')}`;
  UserInfo()
  {
      return this.http.get<any>(`http://localhost:8081/user/profile/${localStorage.getItem('user_id')}`);
  }
  private accUrl = `http://localhost:8081/account/accountByCustomer/${localStorage.getItem('user_id')}`;
  AccInfo()
  {
      return this.http.get<any>(`http://localhost:8081/account/accountByCustomer/${localStorage.getItem('user_id')}`);
  }

  private tranUrl = `http://localhost:8081/transaction/Customer/${localStorage.getItem('user_id')}`;
  TranInfo()
  {
      return this.http.get<any>(`http://localhost:8081/transaction/Customer/${localStorage.getItem('user_id')}`);
  }
  CreateBankAccount(accountData:any)
  {
    return this.http.post<any>('http://localhost:8081/account/create_new_account', accountData);
  }
  CreateTransaction(transData:any)
  {
    return this.http.post<any>('http://localhost:8081/transaction/new_transaction', transData);
  }
  Sendemail(use_email:any)
  {
    return this.http.get<any>(`http://localhost:8081/user/send_email/password_update/${use_email}`);
  }
  UpdatePass(user:any,user_id:any)
  {
      return this.http.put<any>(`http://localhost:8081/user/password_update/${user_id}`,user)
  }


}
