import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroVendaComponent } from './cadastro-vendas/cadastro-vendas.component';


const routes: Routes = [
  {
    path:'',
    pathMatch:'full',
    redirectTo: 'CadastroVendas'
  },

  
  { path:'cadastroVendas',
    component: CadastroVendaComponent,
    loadChildren: () => import('./cadastro-vendas/cadastro-vendas.module').then(m => m.CadastroVendaModule)
  },

  {path:'historico',
  loadChildren: () => import('./historico/historico.module').then(m => m.HistoricoModule)},

  {path:'meus-clientes',
  loadChildren: () => import('./meus-clientes-b/meus-clientes-b.module').then(m => m.MeusClientesModule)}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
