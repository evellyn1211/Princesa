package com.seduc2.princesas.repository;

import com.seduc2.princesas.entity.Princesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincesaRepository extends JpaRepository<Princesa, Integer> {
}
