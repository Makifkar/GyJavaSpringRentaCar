package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.dataAccess.abstracts.FuelRepository;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FuelManager implements FuelService {
    private FuelRepository fuelRepository;
    @Override
    public Fuel add(Fuel fuel) {
        return fuelRepository.save(fuel);
    }

    @Override
    public Fuel getById(int id) {
        return null;
    }

    @Override
    public List<Fuel> getAll() {
        return fuelRepository.findAll();
    }
//karıştı. sakin kafa ile tekrar bak.
    @Override
    public Fuel update(int id, Fuel fuel) {
        return null;
    }

    @Override
    public void delete(int id) {

    }


}
