package org.example.situationalcenter.repository;

import org.example.situationalcenter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User,Long> {



}
