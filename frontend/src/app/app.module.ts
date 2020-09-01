import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { HttpClientModule } from '@angular/common/http';
import { MenuComponent } from './components/menu/menu.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { EditEmployeeComponent } from './components/edit-employee/edit-employee.component';
import { FooterComponent } from './components/footer/footer.component';
import { CreateEmployeeComponent } from './components/create-employee/create-employee.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    PagenotfoundComponent,
    MenuComponent,
    LoginComponent,
    LogoutComponent,
    WelcomeComponent,
    EditEmployeeComponent,
    FooterComponent,
    CreateEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
