package br.com.pdv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidade.VendaEntidade;

@Repository
public interface VendaRepository extends JpaRepository<VendaEntidade, Long>{

}
