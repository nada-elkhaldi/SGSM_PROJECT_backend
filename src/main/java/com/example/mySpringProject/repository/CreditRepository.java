package com.example.mySpringProject.repository;

import com.example.mySpringProject.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Integer> {
}
