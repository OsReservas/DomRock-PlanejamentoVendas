import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AplicacaoModule } from '../import/aplicacao/aplicacao.module';
import { ErrosDialogoComponent } from './erros-dialogo/erros-dialogo.component';
import { SidebarComponent } from './sidebar/sidebar.component';



@NgModule({
  declarations: [ SidebarComponent, ErrosDialogoComponent ],
  imports: [
    CommonModule,
    AplicacaoModule
  ],
  exports: [SidebarComponent,ErrosDialogoComponent]
})
export class SharedModule { }
