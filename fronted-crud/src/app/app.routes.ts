import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegistroFormComponent } from './registro-form/registro-form.component';

export const routes: Routes = [
    {
        path:'',
        component:HomeComponent,
        title: "Pagina de inicio"
    },
    {
        path:'registro-form/:id',
        component:RegistroFormComponent,
        title: "Registro de usuarios"
    },
    {
        path:'**',
        redirectTo:'',
        pathMatch:'full'
    },
];
