import { Historico } from './../moldelos/historico';
import { Component } from '@angular/core';


@Component({
  selector: 'app-historico',
  templateUrl: './historico.component.html',
  styleUrls: ['./historico.component.scss']
})
export class HistoricoComponent {
  hitorico: Historico[]  = [
    {_id: '1',cliente:'ABBAS INDUSTRIA E COMERCIO LTD',produto: 'ferro',data: '2/2/2023',quantidade:"1000"}  //coloca os dados para preencher a tabelas
  ];
  displayedColumns = ['cliente', 'produto', 'data', 'quantidade']; // os indices das tabelas
  }
