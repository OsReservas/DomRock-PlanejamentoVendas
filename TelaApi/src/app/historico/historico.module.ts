import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AplicacaoModule } from '../import/aplicacao/aplicacao.module';

import { HistoricoRoutingModule } from './historico-routing.module';
import { HistoricoComponent } from './historico/historico.component';


@NgModule({
  declarations: [
    HistoricoComponent
  ],
  imports: [
    CommonModule,
    HistoricoRoutingModule,
    AplicacaoModule
  ]
})
export class HistoricoModule { }
