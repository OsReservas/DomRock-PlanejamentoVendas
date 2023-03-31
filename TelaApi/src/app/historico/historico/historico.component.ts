import { Component } from '@angular/core';
import { catchError, Observable, of } from 'rxjs';

import { HistoricoService } from '../servico/historico.service';
import { ErrosDialogoComponent } from './../../shared/erros-dialogo/erros-dialogo.component';
import { Historico } from './../moldelos/historico';
import {MatDialog} from '@angular/material/dialog';


@Component({
  selector: 'app-historico',
  templateUrl: './historico.component.html',
  styleUrls: ['./historico.component.scss']
})
export class HistoricoComponent {

  historico$: Observable<Historico[]>;
  displayedColumns = ['cliente', 'produto', 'data', 'quantidade']; // os indices das tabelas


  constructor(private historicoService: HistoricoService,
              public dialog: MatDialog)
  {

   this.historico$ = this.historicoService.list()
   .pipe(

      catchError(error => {
        this.onError("Erro ao carregar histórico de vendas.");
        return of([])
      })
   );

  }

  onError(errorMsg: String) {
    this.dialog.open(ErrosDialogoComponent, {
      data: errorMsg,
      });
    }
}
