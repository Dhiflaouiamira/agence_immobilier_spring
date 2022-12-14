package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

}
