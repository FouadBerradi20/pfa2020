package org.sambasoft.repositories;


import org.sambasoft.entities.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, Long>{

}
