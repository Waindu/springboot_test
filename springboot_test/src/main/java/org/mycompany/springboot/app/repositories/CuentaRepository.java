package org.mycompany.springboot.app.repositories;

import org.mycompany.springboot.app.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

// A los repositorios les basta con extender JpaRepository para registrarlo dentro del contenedor de Spring
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    @Query("select c from Cuenta c where c.persona=?1") // Query JPQL
    Optional<Cuenta> findByPersona(String persona);

//    estos methodos ya existen en JpaRepository:
//    List<Cuenta> findAll();
//    Cuenta findById(Long id);
}
