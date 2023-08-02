package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.PLC;
import com.example.demo.Service.PLCService;

import java.util.List;

@RestController
@RequestMapping("/plc")
@CrossOrigin("*")
public class PLCController {

    private final PLCService plcService;

    @Autowired
    public PLCController(PLCService plcService) {
        this.plcService = plcService;
    }

    // Endpoint to get all PLCs
    @GetMapping
    public ResponseEntity<List<PLC>> getAllPLCs() {
        List<PLC> plcList = plcService.getAllPLCs();
        return new ResponseEntity<>(plcList, HttpStatus.OK);
    }

    // Endpoint to get a PLC by ID
    @GetMapping("/{id}")
    public ResponseEntity<PLC> getPLCById(@PathVariable Integer id) {
        PLC plc = plcService.getPLCById(id);
        if (plc != null) {
            return new ResponseEntity<>(plc, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to create a new PLC
    @PostMapping
    public ResponseEntity<PLC> createPLC(@RequestBody PLC plc) {
        PLC createdPLC = plcService.createPLC(plc);
        return new ResponseEntity<>(createdPLC, HttpStatus.CREATED);
    }

    // Endpoint to update an existing PLC
    @PutMapping("/{id}")
    public ResponseEntity<PLC> updatePLC(@PathVariable Integer id, @RequestBody PLC updatedPLC) {
        PLC existingPLC = plcService.getPLCById(id);
        if (existingPLC != null) {
            existingPLC.setName(updatedPLC.getName());
            existingPLC.setToken(updatedPLC.getToken());
            existingPLC.setUserid(updatedPLC.getUserid());
            existingPLC.setAddresses(updatedPLC.getAddresses());
            // You can update other fields as needed
            PLC updatedPLCData = plcService.updatePLC(existingPLC);
            return new ResponseEntity<>(updatedPLCData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("updateToken/{id}")
    public ResponseEntity<PLC> updateToken(@PathVariable Integer id, @RequestBody PLC updatedPLC) {
        PLC existingPLC = plcService.getPLCById(id);
        if (existingPLC != null) {
            existingPLC.setName(updatedPLC.getName());
            existingPLC.setToken(updatedPLC.getToken());
            existingPLC.setUserid(updatedPLC.getUserid());
            //existingPLC.setAddresses(updatedPLC.getAddresses());
            // You can update other fields as needed
            //PLC updatedPLCData = plcService.updatePLC(existingPLC);
            return new ResponseEntity<>(existingPLC, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete a PLC by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePLC(@PathVariable Integer id) {
        PLC plc = plcService.getPLCById(id);
        if (plc != null) {
            plcService.deletePLC(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
