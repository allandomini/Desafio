import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prospect } from '../Models/Prospect';

@Injectable({
  providedIn: 'root',
})
export class ProspectService {
  private url: string = 'http://localhost:8080'; // Corrected URL
  constructor(private http: HttpClient) {}

  // Method to select all Prospects
  selecionar(): Observable<Prospect[]> {
    return this.http.get<Prospect[]>(this.url);
  }
  //Method to SingUp Prospects
  cadastrar(obj: Prospect): Observable<Prospect> {
    return this.http.post<Prospect>(this.url, obj);
  }
  //Method to EDIT prospects
  editar(obj: Prospect): Observable<Prospect> {
    return this.http.put<Prospect>(this.url, obj);
  }
  remover(codigo: number): Observable<void> {
    return this.http.delete<void>(this.url + '/' + codigo);
  }
}
