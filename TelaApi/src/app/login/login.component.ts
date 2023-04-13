import { Component } from '@angular/core';
import { LoginService } from './service/login.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
    
    constructor(private loginService: LoginService, private router:Router) {
    }

    public login(){
      this.loginService.login("admin","admin");
      this.router.navigate(['cadastroVendas'])
    }
}
