package com.timafejn.diopadroesprojetos.service;

import com.timafejn.diopadroesprojetos.model.Pessoa;

public interface PessoaService {
    Iterable<Pessoa> buscarTodos();

    Pessoa buscarPorId(Long id);

    void inserir(Pessoa pessoa);

    void atualizar(Long id, Pessoa pessoa);

    void deletar(Long id);
}
