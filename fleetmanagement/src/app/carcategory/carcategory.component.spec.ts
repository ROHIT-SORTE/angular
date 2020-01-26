import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarcategoryComponent } from './carcategory.component';

describe('CarcategoryComponent', () => {
  let component: CarcategoryComponent;
  let fixture: ComponentFixture<CarcategoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarcategoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarcategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
