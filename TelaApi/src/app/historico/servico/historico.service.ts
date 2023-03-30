import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { delay, first, tap } from 'rxjs';

import { Historico } from '../moldelos/historico';

@Injectable({
  providedIn: 'root'
})
export class HistoricoService {

  private readonly API = 'assets/historico.json'

  constructor(public httpClient: HttpClient) { }

  list() {
      return this.httpClient.get<Historico[]>(this.API)
      .pipe(
        first(),
        delay(5000),
        tap(histotico => console.log(histotico))
      );
    }
}
