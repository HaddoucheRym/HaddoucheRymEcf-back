package com.example.LocalibSpringBoot.location;

import com.example.LocalibSpringBoot.vehicule.VehiculeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class LocationServiceImpl implements LocationService{

    private static final Logger logger = LoggerFactory.getLogger(LocationServiceImpl.class);

    private final LocationRepository locationRepository;


    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return this.locationRepository.findAll();
    }



    @Override
    public Location  save(Location entity) {

        return this.locationRepository.save(entity);
    }



    @Override
    public Location findById(String id) {
        return this.locationRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });

    }



    @Override
    public void deleteById(String id) {
        this.locationRepository.deleteById(id);
    }
}
