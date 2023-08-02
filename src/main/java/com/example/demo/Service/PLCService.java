package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.PLC;
import com.example.demo.Repository.PLCRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class PLCService {

    private final PLCRepository plcRepository;

    @Autowired
    public PLCService(PLCRepository plcRepository) {
        this.plcRepository = plcRepository;
    }

    // Service method to get all PLCs
    public List<PLC> getAllPLCs() {
        return plcRepository.findAll();
    }

    // Service method to get a PLC by ID
    public PLC getPLCById(Integer id) {
        return plcRepository.findById(id).orElse(null);
    }

    public PLC getPLCByToken(String token) {
        return plcRepository.findByToken(token);
    }

    // Service method to create a new PLC
    @Transactional
    public PLC createPLC(PLC plc) {
        for(Address addresses : plc.getAddresses() ){
            addresses.setPlc(plc);
        }
        return plcRepository.save(plc);
    }

    // Service method to update an existing PLC
    @Transactional
    public PLC updatePLC(PLC plc) {
        //
          for(Address addresses : plc.getAddresses() ){
            addresses.setPlc(plc);
        }

        return plcRepository.save(plc);
    }

    // Service method to delete a PLC by ID
    public void deletePLC(Integer id) {
        plcRepository.deleteById(id);
    }
}
