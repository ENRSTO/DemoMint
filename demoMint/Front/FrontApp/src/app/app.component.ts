import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PersonaComponent } from './persona/persona.component';
import { CommonModule } from '@angular/common'; // Importa CommonModule per funzionalità di base di Angular
import { FormsModule } from '@angular/forms'; // Importa FormsModule

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,PersonaComponent,FormsModule,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',

})
export class AppComponent {
  title = 'FrontApp+Spring';
}
