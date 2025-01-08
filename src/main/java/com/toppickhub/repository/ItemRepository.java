package com.toppickhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<main.java.com.toppickhub.model.Item, Long> {
}

