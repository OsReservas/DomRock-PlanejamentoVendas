import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first, tap } from 'rxjs';

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
        tap(histotico => console.log(histotico))
      );
    }
}
