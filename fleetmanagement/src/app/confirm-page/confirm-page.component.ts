import { Component, OnInit } from '@angular/core';
import {IRegisteruser} from '../Interfaces/iregisteruser';
import { RegisteruserdataService } from '../Services/registeruserdata.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-confirm-page',
  templateUrl: './confirm-page.component.html',
  styleUrls: ['./confirm-page.component.css']
})
export class ConfirmPageComponent implements OnInit {
  users:IRegisteruser;
  public CarType:string;
  public AddOn:string;
 rentLocation=localStorage.getItem('rentLocation');
  returnLocation=localStorage.getItem('returnLocation');
  item1=localStorage.getItem('item1');
  item2=localStorage.getItem('item2');
  item3=localStorage.getItem('item3');;

  
  constructor(private _userserv:RegisteruserdataService,private _userCode: ActivatedRoute,
    private router:Router) { }
   
   
  ngOnInit() {
    this._userCode.queryParams.subscribe(x => {this.CarType = x.cartype; this.AddOn = x.amenities});
    let reguser:string=this._userCode.snapshot.params['code'];
    let code1:number=parseInt(reguser);
    this._userserv.getUsers(code1).subscribe(data=>this.users=data);
  }

}
