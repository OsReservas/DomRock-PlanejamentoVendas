import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';
import { CadastroVendaComponent } from './cadastro-vendas.component';

@NgModule({
  declarations: [CadastroVendaComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatToolbarModule,
    MatCardModule,
    CommonModule,
    FormsModule,
    MatSelectModule,
    MatFormFieldModule,
  ],
  exports:[CadastroVendaComponent]
})
export class CadastroVendaModule { }

