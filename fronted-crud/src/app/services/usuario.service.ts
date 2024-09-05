import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { usuarios } from '../models/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private apiUrl ='http://localhost:8080/usuario';

  constructor(private httpClient: HttpClient) { }

  getUsuario(): Observable <usuarios[]>{
    return this.httpClient.get <usuarios[]>(this.apiUrl);
  }



}
