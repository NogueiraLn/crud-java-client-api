package com.nogueira.ClientCRUD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nogueira.ClientCRUD.dto.ClientDTO;
import com.nogueira.ClientCRUD.entities.Client;
import com.nogueira.ClientCRUD.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).get();
		ClientDTO dto = new ClientDTO(client);
		return dto;
	}
	
}