package br.com.home.main.controller;

import br.com.home.main.models.Clientes;
import br.com.home.main.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/start")
public class ClientController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Clientes> list(){
        return clienteRepository.findAll();
    }
}
