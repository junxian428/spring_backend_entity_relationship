package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.PLC;
import com.example.demo.Repository.PLCRepository;

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

    // Service method to create a new PLC
    public PLC createPLC(PLC plc) {
        return plcRepository.save(plc);
    }

    // Service method to update an existing PLC
    public PLC updatePLC(PLC plc) {
        return plcRepository.save(plc);
    }

    // Service method to delete a PLC by ID
    public void deletePLC(Integer id) {
        plcRepository.deleteById(id);
    }
}
