import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { VendasService } from './services/vendas.service';
import { VendasDto } from './models/vendasDto';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit{
  cadastroVenda : FormGroup = new FormGroup({});

  constructor(private vendaService: VendasService){

  }

  ngOnInit(): void {
    this.cadastroVenda = new FormGroup({
      cliente : new FormControl(null),
      produto : new FormControl(null),
      data : new FormControl(Validators.required),
      quantidade : new FormControl(Validators.required)
    }); 
  }

  salvarVenda() : void {
    if(this.cadastroVenda.invalid){
      alert('Formulario invalido')
      return;
    }

    let vendasDto = {
      id: 0,
      data: this.cadastroVenda.get('data')?.value,
      quantidade: this.cadastroVenda.get('quantidade')?.value,
      produtos: [ this.cadastroVenda.get('produto')?.value ]
    } as VendasDto

    this.vendaService.criarVenda(vendasDto)
      .subscribe();
  }

  limpar() : void {
    this.cadastroVenda.reset();
  }
}
