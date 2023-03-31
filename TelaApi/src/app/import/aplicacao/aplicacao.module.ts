import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { AvatarModule } from 'primeng/avatar';
import { ProgressBarModule } from 'primeng/progressbar';
// For dynamic progressbar demo
import { ToastModule } from 'primeng/toast';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import { DialogModule } from 'primeng/dialog';




@NgModule({
  exports: [
   MatCardModule,
   MatTableModule,
   MatToolbarModule,
   AvatarModule,
   ProgressBarModule,
   ToastModule,
   MatProgressSpinnerModule,
   DialogModule
  ]
})
export class AplicacaoModule { }
