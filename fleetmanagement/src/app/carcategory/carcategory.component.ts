import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-carcategory',
  templateUrl: './carcategory.component.html',
  styleUrls: ['./carcategory.component.css']
})
export class CarcategoryComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }

  selectCar(cartype:string)
  {
    this.router.navigate(['addOn'],{queryParams:{type:cartype}});
  }
}
