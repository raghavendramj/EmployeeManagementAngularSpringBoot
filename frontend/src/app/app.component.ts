import { HardcodedAuthenticationService } from './service/hardcoded-authentication.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'covid19ui';

  constructor(private hardcodedAuthenticationService: HardcodedAuthenticationService) { }


    isUserLoggedIn = false;
    ngOnInit() {
      this.isUserLoggedIn = this.hardcodedAuthenticationService.isUerLoggedIn();
    }
}
