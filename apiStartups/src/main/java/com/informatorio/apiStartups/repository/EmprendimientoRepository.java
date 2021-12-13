package com.informatorio.apiStartups.repository;

import com.informatorio.apiStartups.entity.Emprendimiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //FindOne FindBy FindAll Save Delete 
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {
    
}
