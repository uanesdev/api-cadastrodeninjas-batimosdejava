package dev.uanes.cadastroDeNinja.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Busca todos os ninjas
    public List<NinjaModel> findAllNinjas() {
        return ninjaRepository.findAll();
    }

}
