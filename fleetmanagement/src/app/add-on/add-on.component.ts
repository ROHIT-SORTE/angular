import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-add-on',
  templateUrl: './add-on.component.html',
  styleUrls: ['./add-on.component.css']
})
export class AddOnComponent implements OnInit {
  public obj:any = {};
  private car_type:string;
  private amenities:string = "";
  constructor(private activateRouter:ActivatedRoute,private router:Router) { }

  ngOnInit() {
    this.activateRouter.queryParams.subscribe(x => this.car_type = x.type);
  }

  proceed()
  {
    for(var key of  Object.keys(this.obj))
    {
      this.amenities = this.amenities + (this.obj[key] ? key+",":"");
    }
    this.router.navigate(['confirmPage/301'],{queryParams:{cartype:this.car_type,amenities:this.amenities}});
  }
}
