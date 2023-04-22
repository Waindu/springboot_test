package org.mycompany.springboot.app.repositories;

import org.mycompany.springboot.app.models.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

// A los repositorios les basta con extender JpaRepository para registrarlo dentro del contenedor de Spring
public interface BancoRepository extends JpaRepository<Banco, Long> {
//    List<Banco> findAll();
//    Banco findById(Long id);
//    void update(Banco banco);

}
