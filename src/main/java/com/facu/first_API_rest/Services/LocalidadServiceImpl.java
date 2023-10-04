package com.facu.first_API_rest.Services;

import com.facu.first_API_rest.Entities.Localidad;
import com.facu.first_API_rest.Repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {

        super(baseRepository);
    }
}