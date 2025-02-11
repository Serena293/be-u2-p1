package it.spring.p1.be_u2_p1.utenti;

import it.spring.p1.be_u2_p1.prenotazioni.Prenotazioni;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUtente;
    private String nome;
    private String cognome;
    @OneToMany(mappedBy = "utente", cascade = CascadeType.ALL) //un utente può avere più prenotazioni
    private List<Prenotazioni> prenotazioni;
}
