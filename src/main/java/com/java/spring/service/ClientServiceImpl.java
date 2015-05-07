package com.java.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.model.Client;
import com.java.spring.repository.ClientRepository;
import com.java.spring.repository.ClientRepositoryImpl;


@Service
public class ClientServiceImpl  implements ClientService{
	@Autowired
	private ClientRepository clientRepository;



	public void create(Client client) {
		// TODO Auto-generated method stub

	}

	public Client getClient(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> listClient() {
		return clientRepository.listClient();
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public void update(Integer id, String name) {
		// TODO Auto-generated method stub

	}

	public void insert() {

		clientRepository.insert();

	}


}
