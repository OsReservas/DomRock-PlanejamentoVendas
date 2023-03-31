import { Component, Inject } from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';


@Component({
  selector: 'app-erros-dialogo',
  templateUrl: './erros-dialogo.component.html',
  styleUrls: ['./erros-dialogo.component.scss']
})
export class ErrosDialogoComponent {

  constructor(@Inject(MAT_DIALOG_DATA) public data: String) {}


}
