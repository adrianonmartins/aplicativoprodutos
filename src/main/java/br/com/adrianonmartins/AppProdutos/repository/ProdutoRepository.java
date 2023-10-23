package br.com.adrianonmartins.AppProdutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adrianonmartins.AppProdutos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}