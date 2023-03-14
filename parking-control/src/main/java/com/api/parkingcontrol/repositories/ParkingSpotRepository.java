package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

/*Foi extendido de JpaRepository porque já existe vários métodos prontos
 para serem utilizado para transações com o Banco de Dados, com isso economiza, 
 tempo, linhas de código e dor de cabeça, */

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{

}
