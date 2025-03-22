package com.master.project.repository;

import com.master.project.entity.MasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterRepository extends JpaRepository<MasterEntity, Long> {

    long count();
    List<MasterEntity> findByNameContaining(String name);
}
