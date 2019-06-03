package com.FulfilmentCenter.FulfilmentCenter1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Pojos.FulfilmentCenter1;

@Repository
public interface FCDataRepository extends JpaRepository<FulfilmentCenter1, Integer>{

}
