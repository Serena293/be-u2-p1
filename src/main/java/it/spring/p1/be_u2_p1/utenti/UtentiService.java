package it.spring.p1.be_u2_p1.utenti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtentiService {
    @Autowired
    private UtenteRepository utenteRepository;
}
