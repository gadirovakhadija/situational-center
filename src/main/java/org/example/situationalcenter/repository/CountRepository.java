package org.example.situationalcenter.repository;

import org.example.situationalcenter.entity.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountRepository extends JpaRepository<Count, Long> {

    List<Count> findAll();

}
