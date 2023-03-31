import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AplicacaoModule } from '../import/aplicacao/aplicacao.module';
import { SharedModule } from './../shared/shared.module';
import { HistoricoRoutingModule } from './historico-routing.module';
import { HistoricoComponent } from './historico/historico.component';


@NgModule({
  declarations: [
    HistoricoComponent
  ],
  imports: [
    CommonModule,
    HistoricoRoutingModule,
    AplicacaoModule,
    SharedModule
  ]
})
export class HistoricoModule { }
