import { Component } from '@angular/core';
import { LoginService } from './login/service/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'TelaApi';
  isAuthorized: boolean = false;

  constructor(private loginService: LoginService) {
    this.loginService.loggedEvent.subscribe(x => {
      this.isAuthorized = x
    });
  }
}
