package br.com.alura.alquimistas.repositories;

import br.com.alura.alquimistas.models.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme,Long>{

}
