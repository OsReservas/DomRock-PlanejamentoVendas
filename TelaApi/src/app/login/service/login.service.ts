import { HttpClient } from "@angular/common/http";
import { EventEmitter, Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class LoginService{
    private apiUrl:string = 'http://localhost:8080/'

    public isLoggedIn:boolean = false;

    public loggedEvent: EventEmitter<boolean> = new EventEmitter<boolean>();

    private users = [
        {username:'admin', password: 'admin'},
        {username:'vendedor', password: 'vendedor'},
        {username:'user', password: 'user'},
    ]

    constructor(private http: HttpClient){

    }

    public login(userName: string, password: string){
        var user = this.users.filter(x => x.username == userName && x.password == password);
        this.loggedEvent.emit(true);
    }

    public logout(){
        this.loggedEvent.emit(false);
        this.isLoggedIn = false;
    }
}