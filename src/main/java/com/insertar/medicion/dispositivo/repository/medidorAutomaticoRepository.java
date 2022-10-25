package com.insertar.medicion.dispositivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insertar.medicion.dispositivo.entities.MedicionAutomatica;

@Repository
public interface medidorAutomaticoRepository extends JpaRepository<MedicionAutomatica, Long>{

}
