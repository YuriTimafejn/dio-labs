package com.timafejn.diopadroesprojetos.service.padroes;

import com.timafejn.diopadroesprojetos.model.Endereco;
import com.timafejn.diopadroesprojetos.model.EnderecoRepository;
import com.timafejn.diopadroesprojetos.model.Pessoa;
import com.timafejn.diopadroesprojetos.model.PessoaRepository;
import com.timafejn.diopadroesprojetos.service.PessoaService;
import com.timafejn.diopadroesprojetos.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaServicePadroesAplicados implements PessoaService
{
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    private void salvarPessoaComCep(Pessoa pessoa) {
        String cep = pessoa.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        pessoa.setEndereco(endereco);
        pessoaRepository.save(pessoa);
    }
    @Override
    public Iterable<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }
    @Override
    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id).get();
    }
    @Override
    public void inserir(Pessoa pessoa) {
        salvarPessoaComCep(pessoa);
    }
    @Override
    public void atualizar(Long id, Pessoa pessoa) {
        Optional<Pessoa> pessoaBd = pessoaRepository.findById(id);
        if (pessoaBd.isPresent()) {
            salvarPessoaComCep(pessoa);
        }
    }
    @Override
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
}
