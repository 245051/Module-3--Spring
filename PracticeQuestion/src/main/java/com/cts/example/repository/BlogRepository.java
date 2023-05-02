package com.cts.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.example.entity.EntityElement;
@Repository
public interface BlogRepository extends JpaRepository<EntityElement,Long> {

}
