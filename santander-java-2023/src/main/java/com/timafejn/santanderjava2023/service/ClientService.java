package com.timafejn.santanderjava2023.service;

import com.timafejn.santanderjava2023.domain.model.Client;

public interface ClientService {
    Client findById(Long id);
    Client create(Client clientToCreate);
}
