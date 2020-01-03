package org.sambasoft.repositories;

import org.sambasoft.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository  extends JpaRepository<Employe, Long>{

}
