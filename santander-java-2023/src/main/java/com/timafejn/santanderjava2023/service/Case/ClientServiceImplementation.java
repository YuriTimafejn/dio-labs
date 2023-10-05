package com.timafejn.santanderjava2023.service.Case;

import com.timafejn.santanderjava2023.domain.model.Client;
import com.timafejn.santanderjava2023.domain.repository.ClientRepository;
import com.timafejn.santanderjava2023.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClientServiceImplementation implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Client create(Client clientToCreate) {
        if(clientToCreate.getId() != null && clientRepository.existsByAccountNumber(clientToCreate.getAccount().getNumber()))
            throw new IllegalArgumentException("This account number is already taken by another client");

        return clientRepository.save(clientToCreate);
    }
}
