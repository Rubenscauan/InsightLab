package com.insight.desafio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insight.desafio.model.Fornecedor;

@Repository
public interface FornecedorDao extends JpaRepository<Fornecedor, Long> {
    
}
