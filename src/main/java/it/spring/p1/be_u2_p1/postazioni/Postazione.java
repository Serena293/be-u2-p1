package it.spring.p1.be_u2_p1.postazioni;


import it.spring.p1.be_u2_p1.edifici.Edificio;
import it.spring.p1.be_u2_p1.prenotazioni.Prenotazioni;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "postazioni")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codiceUnivoco;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    private int numeroMassimoDiOccupanti;

    @OneToMany(mappedBy = "postazione", fetch = FetchType.LAZY)
    private List<Prenotazioni> prenotazioni;

    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;


    //TOdo: controlla fetch
}
