package com.artillis.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artillis.bookstore.domain.Livro;

public interface livroRepository extends JpaRepository<Livro, Integer> {

}
