package com.informatorio.apiStartups.controller;


import javax.validation.Valid;

import com.informatorio.apiStartups.entity.Emprendimiento;
import com.informatorio.apiStartups.repository.EmprendimientoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emprendimiento")
public class EmprendimientoController {
    private final EmprendimientoRepository emprendimientoRepository;

    @Autowired
    public EmprendimientoController(EmprendimientoRepository emprendimientoRepository) {
        this.emprendimientoRepository = emprendimientoRepository;
    }

    @PostMapping
    public ResponseEntity<?> createCarrito(@Valid @RequestBody Emprendimiento emprendimiento) {
        return new ResponseEntity<>(emprendimientoRepository.save(emprendimiento), HttpStatus.CREATED);
    }


    
}
