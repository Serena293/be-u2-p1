package it.spring.p1.be_u2_p1.prenotazioni;

import it.spring.p1.be_u2_p1.postazioni.Postazione;
import it.spring.p1.be_u2_p1.utenti.Utente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prenotazioni")
public class Prenotazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPrenotazione;
    @Column(nullable = false)
    private LocalDate dataPrenotazione;
    @ManyToOne
    @JoinColumn(name = "codice_univoco")//Ogni prenotazione ha una sola postazione
    private Postazione postazione;
    @ManyToOne
    @JoinColumn(name = "id_utente")//Ogni prenotazione ha un utente
    private Utente utente;
}

//TODo: controlla join column
