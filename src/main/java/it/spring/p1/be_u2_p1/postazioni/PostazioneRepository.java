package it.spring.p1.be_u2_p1.postazioni;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
   // Postazione findByTipoPostazione(TipoPostazione tipoPostazione);
   // Postazione findBycitta(String citta);
}
