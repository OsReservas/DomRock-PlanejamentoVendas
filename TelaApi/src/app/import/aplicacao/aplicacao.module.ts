import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
// For dynamic progressbar demo
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatDialogModule} from '@angular/material/dialog';





@NgModule({
  exports: [
   MatCardModule,
   MatTableModule,
   MatToolbarModule,
   MatProgressSpinnerModule,
   MatDialogModule
  ]
})
export class AplicacaoModule { }
