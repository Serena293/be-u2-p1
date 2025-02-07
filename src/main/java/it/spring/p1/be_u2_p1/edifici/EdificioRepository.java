package it.spring.p1.be_u2_p1.edifici;

import it.spring.p1.be_u2_p1.postazioni.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
    List<Edificio> findByPostazioni(Postazione postazione);
    List<Edificio> findByCitta(String citta);
    List<Edificio> findByPostazioniAndCitta(Postazione postazione, String citta);
}
