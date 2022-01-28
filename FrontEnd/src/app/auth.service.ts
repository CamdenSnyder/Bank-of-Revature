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
  private updateInfoUrl= `http://localhost:8081/user/profile_update/${localStorage.getItem('cus')}`;
  UpdateInfoMethod(user:any)
  {
      return this.http.put<any>(`http://localhost:8081/user/profile_update/${localStorage.getItem('cus')}`,user)
  }
  private userUrl = `http://localhost:8081/user/profile/${localStorage.getItem('cus')}`;
  UserInfo()
  {
      return this.http.get<any>(`http://localhost:8081/user/profile/${localStorage.getItem('cus')}`);
  }
  private accUrl = `http://localhost:8081/account/accountByCustomer/${localStorage.getItem('cus')}`;
  AccInfo()
  {
      return this.http.get<any>(`http://localhost:8081/account/accountByCustomer/${localStorage.getItem('cus')}`);
  }

  private tranUrl = `http://localhost:8081/transaction/Customer/${localStorage.getItem('cus')}`;
  TranInfo()
  {
      return this.http.get<any>(`http://localhost:8081/transaction/Customer/${localStorage.getItem('cus')}`);
  }

}
