package br.com.pdv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidade.LojaEntidade;

@Repository
public interface LojaRepository extends JpaRepository<LojaEntidade, Long>{

}
