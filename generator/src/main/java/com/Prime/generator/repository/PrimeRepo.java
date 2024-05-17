package com.Prime.generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Prime.generator.entity.PrimeEntity;

@Repository
public interface PrimeRepo extends JpaRepository<PrimeEntity,Long> {

}
