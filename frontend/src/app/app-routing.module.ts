import { CreateEmployeeComponent } from './components/create-employee/create-employee.component';
import { EditEmployeeComponent } from './components/edit-employee/edit-employee.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { RouteGuardService } from './service/route-guard.service';
import { LogoutComponent } from './components/logout/logout.component';
import { LoginComponent } from './components/login/login.component';

import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { EmployeeComponent } from "./components/employee/employee.component";
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';

const routes: Routes = [
  {path:'', component: LoginComponent},
  {path:'login', component: LoginComponent},
  {path:'logout', component: LogoutComponent, canActivate:[RouteGuardService]},
  {path:'welcome/:username', component: WelcomeComponent, canActivate:[RouteGuardService]},
  {path:'employees', component: EmployeeComponent, canActivate:[RouteGuardService]},
  {path:'employees/:id', component: EditEmployeeComponent, canActivate:[RouteGuardService]},
  {path:'**', component: PagenotfoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
