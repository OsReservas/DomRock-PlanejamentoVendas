import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AplicacaoModule } from '../import/aplicacao/aplicacao.module';
import { SharedModule } from './../shared/shared.module';
import { MeusClientesComponent } from './meus-clientes-b/meus-clientes-b.component';
import { MeusClientesRoutingModule } from './meus-clientes-b.routing.module';


@NgModule({
  declarations: [
    MeusClientesComponent
  ],
  imports: [
    CommonModule,
    MeusClientesRoutingModule,
    AplicacaoModule,
    SharedModule
  ]
})
export class MeusClientesModule { }
