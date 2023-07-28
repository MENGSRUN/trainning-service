package com.hacknovation.trainning1service.models.respositories;

import com.hacknovation.trainning1service.models.entities.BlogTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogTypeRP extends JpaRepository<BlogTypeEntity, Long> {
}