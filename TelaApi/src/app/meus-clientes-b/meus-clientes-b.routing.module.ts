import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MeusClientesComponent } from './meus-clientes-b/meus-clientes-b.component';


const routes: Routes = [
  {path: '', component: MeusClientesComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MeusClientesRoutingModule { }
