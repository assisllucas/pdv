package br.com.pdv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidade.ItemEntidade;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntidade, Long>{

}
