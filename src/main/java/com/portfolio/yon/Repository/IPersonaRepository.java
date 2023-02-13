package com.portfolio.yon.Repository;

import com.portfolio.yon.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long>{

   /* public Object findId(Long id);*/
    
}
