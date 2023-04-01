import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {
    path:'',
    pathMatch:'full',
    redirectTo: 'CadastroVendas'
  },

  { path:'CadastroVendas',
    component: HomeComponent,
    loadChildren: () => import('./home/home.module').then(m => m.HomeModule)
  },

  {path:'historico',
  loadChildren: () => import('./historico/historico.module').then(m => m.HistoricoModule)}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
