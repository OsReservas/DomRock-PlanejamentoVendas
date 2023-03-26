import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit{
  cadastroVenda : FormGroup;

  ngOnInit(): void {
    this.cadastroVenda = new FormGroup({
      cliente : new FormControl(null),
      produto : new FormControl(null),
      data : new FormControl(null),
      quantidade : new FormControl(null)
    }); 
  }

}
