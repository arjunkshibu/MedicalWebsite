package com.example.medicalwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.medicalwebsite.entity.DoctorEntity;
import com.example.medicalwebsite.service.DoctorService;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService ds;

    @GetMapping("/doctor")
    public List<DoctorEntity> getDoctor() {
        return ds.getDoctor();
    }

    @PutMapping("/UpdateDoctor")
    public String updateDoctor(@RequestBody DoctorEntity pe, @RequestParam int id) {
        pe.setId(id);
        ds.updateDoctor(pe);
        return "id : " + id + " is updated";
    }

    @PostMapping("/AddDoctor")
    public DoctorEntity addDoctor(@RequestBody DoctorEntity de) {
        return ds.addDoctor(de);
    }

    @DeleteMapping("/DeleteDoctor")
    public String deleteDoctor(@RequestParam int id) {
        ds.deleteDoctor(id);
        return "id : " + id + " is deleted";
    }
}
