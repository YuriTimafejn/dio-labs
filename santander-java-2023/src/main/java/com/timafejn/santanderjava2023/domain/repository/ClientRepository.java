package com.timafejn.santanderjava2023.domain.repository;

import com.timafejn.santanderjava2023.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>
{
}
