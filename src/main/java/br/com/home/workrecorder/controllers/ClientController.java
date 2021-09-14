package br.com.home.workrecorder.controllers;

import br.com.home.workrecorder.models.Client;
import br.com.home.workrecorder.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping( value = "/insertClient", method = RequestMethod.GET)
    public String form(){

        return "events/formClient";
    }

    @RequestMapping( value = "/insertClient", method = RequestMethod.POST)
    public String form(Client client){

        clientRepository.save(client);
        return "redirect:/insertClient";
    }

    @RequestMapping(value = "/consultClients")
    public ModelAndView listClients(){
        ModelAndView modelAndView = new ModelAndView("events/formConsult");
        Iterable<Client> clients = clientRepository.findAll();
        modelAndView.addObject("clients", clients);
        return modelAndView;
    }

//    @RequestMapping(value = "consultClient", method = RequestMethod.GET)
//    public ModelAndView singleClient(String name){
//        Client clients = clientRepository.findByName(name);
//        ModelAndView modelAndView = new ModelAndView("events/formSingleClient");
//        modelAndView.addObject("client", clients);
//        return modelAndView;
//    }

    @RequestMapping(value = "/{code}")
    public ModelAndView detailsClient(@PathVariable("code") long code){
        Optional<Client> client = clientRepository.findById(code);
        ModelAndView modelAndView = new ModelAndView("events/formDetails");
        modelAndView.addObject("client", client);
        return modelAndView;
    }

}
