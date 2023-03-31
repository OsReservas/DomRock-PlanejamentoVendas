import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ErrosDialogoComponent } from './erros-dialogo.component';

describe('ErrosDialogoComponent', () => {
  let component: ErrosDialogoComponent;
  let fixture: ComponentFixture<ErrosDialogoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ErrosDialogoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ErrosDialogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
