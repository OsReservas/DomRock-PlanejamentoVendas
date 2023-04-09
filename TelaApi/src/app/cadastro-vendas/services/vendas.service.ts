import { HttpClient } from "@angular/common/http";
import { VendasDto } from "../models/vendasDto";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: 'root'
})
export class VendasService{
    private apiUrl:string = 'http://localhost:8080/'

    constructor(private http: HttpClient){

    }

    public criarVenda(venda : VendasDto){
        const url = this.apiUrl + 'vendas';
        return this.http.post(url, venda);
    }
}