import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
// For dynamic progressbar demo
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';




@NgModule({
  exports: [
   MatCardModule,
   MatTableModule,
   MatToolbarModule,
   MatProgressSpinnerModule
  ]
})
export class AplicacaoModule { }
