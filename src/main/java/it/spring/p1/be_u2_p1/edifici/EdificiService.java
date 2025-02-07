package it.spring.p1.be_u2_p1.edifici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificiService {

    @Autowired
    EdificioRepository edificioRepository;


}
