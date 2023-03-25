import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AplicaçãoModule } from '../import/aplicação/aplicação.module';

import { HistoricoRoutingModule } from './historico-routing.module';
import { HistoricoComponent } from './historico/historico.component';


@NgModule({
  declarations: [
    HistoricoComponent
  ],
  imports: [
    CommonModule,
    HistoricoRoutingModule,
    AplicaçãoModule
  ]
})
export class HistoricoModule { }
