import { Component } from '@angular/core';

import { Historico } from './../moldelos/historico';
import { HistoricoService } from '../servico/historico.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-historico',
  templateUrl: './historico.component.html',
  styleUrls: ['./historico.component.scss']
})
export class HistoricoComponent {

  historico: Observable<Historico[]>;
  displayedColumns = ['cliente', 'produto', 'data', 'quantidade']; // os indices das tabelas


  constructor(private historicoService: HistoricoService){

   this.historico = this.historicoService.list();
  }
  }

