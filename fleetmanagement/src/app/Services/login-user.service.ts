import { Injectable } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { IloginUser } from '../Interfaces/iloginUser';
import { Observable, Subject } from 'rxjs';
import { IRegisteruser } from '../Interfaces/iregisteruser';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class LoginUserService {

  Url= "http://localhost:8080/fleetmngmnt/";
  public loginEvent = new Subject<string>();

  getLoginEvent()
  {
    return this.loginEvent;
  }
  setLoginEvent(val:string)
  {
    this.loginEvent.next(val);
  }

  constructor(private router: Router,private http : HttpClient) { }

  //Observable<IRegisteruser>
  Login(user : IloginUser):Promise<any>
  {
        return  this.http.post<any>(this.Url+'Login/validate',user).toPromise();                
      }

  Form = new FormGroup(
    {
      // Add Multiple validation
      Email: new FormControl('', [Validators.email,Validators.required]),
      Password: new FormControl('', [Validators.required])
      
    }
  )
  
}
