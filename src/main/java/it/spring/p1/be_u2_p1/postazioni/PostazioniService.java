package it.spring.p1.be_u2_p1.postazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioniService {
    @Autowired
    PostazioneRepository postazioneRepository;
}
