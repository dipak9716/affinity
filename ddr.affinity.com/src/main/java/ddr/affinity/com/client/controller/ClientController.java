package ddr.affinity.com.client.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ddr.affinity.com.client.entity.Client;
import ddr.affinity.com.client.repository.ClientRepository;

@RestController
@RequestMapping("/client")

public class ClientController {
	
	@Autowired
	ClientRepository clientRepository;
	
	@RequestMapping("/add")
	 public void addClient(Client client) {
		clientRepository.getConnection();
	 }

}
