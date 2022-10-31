import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NeweducacacionComponent } from './neweducacacion.component';

describe('NeweducacacionComponent', () => {
  let component: NeweducacacionComponent;
  let fixture: ComponentFixture<NeweducacacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NeweducacacionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NeweducacacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
