package it.spring.p1.be_u2_p1.edifici;

import it.spring.p1.be_u2_p1.postazioni.Postazione;
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
@Table(name = "edifici")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idEdificio;
    private String nome;
    private String indirizzo;
    private String citta;


    @OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL)
    private List<Postazione> postazioni;
}
