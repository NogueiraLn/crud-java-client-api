package com.nogueira.ClientCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nogueira.ClientCRUD.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
