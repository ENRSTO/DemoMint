import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Importa HttpClient
import { FormsModule } from '@angular/forms'; // Importa FormsModule
import { CommonModule } from '@angular/common'; // Importa CommonModule
import { HttpClientModule } from '@angular/common/http'; // Importa HttpClientModule
import { Persona } from './Persona';
import { provideHttpClient, withFetch } from '@angular/common/http'; 

@Component({
  selector: 'app-persona',
  standalone: true,  // Indica che il componente è standalone
  imports: [FormsModule, CommonModule, HttpClientModule],  // Importa i moduli necessari, inclusi FormsModule e HttpClientModule
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css'],
  providers: []
})
export class PersonaComponent {

  nome = '';
  cognome = '';
  persone: Persona[] = [];

  constructor(private http: HttpClient) {}  // Usa HttpClient nel costruttore

  aggiungiPersona() {
    const nuovaPersona: Persona = { nome: this.nome, cognome: this.cognome };

    this.http.post<Persona>('http://localhost:8080/api/persone', nuovaPersona)
      .subscribe((persona: Persona) => {
        this.persone.push(persona);
        this.nome = '';
        this.cognome = '';
      });
  }

  ngOnInit() {
    this.http.get<Persona[]>('http://localhost:8080/api/persone')
      .subscribe((persone: Persona[]) => {
        this.persone = persone;
      });
  }
}
