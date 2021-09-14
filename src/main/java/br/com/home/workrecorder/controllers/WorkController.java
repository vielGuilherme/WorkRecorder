package br.com.home.workrecorder.controllers;

import br.com.home.workrecorder.models.Client;
import br.com.home.workrecorder.models.Work;
import br.com.home.workrecorder.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class WorkController {

    @Autowired
    private WorkRepository workRepository;

    @RequestMapping( value = "/insertWork", method = RequestMethod.GET)
    public String form(){
        return "events/formWork";
    }

    @RequestMapping(value = "/insertWork", method = RequestMethod.POST)
    public String form(Work work){
        workRepository.save(work);
        return "redirect:/insertWork";

    }

    @RequestMapping(value = "/consultWork")
    public ModelAndView listClients(@PathVariable("code") long code){
        Optional<Work> work = workRepository.findById(code);
        ModelAndView modelAndView = new ModelAndView("events/formDetails");
        modelAndView.addObject("work", work);
        return modelAndView;
    }

}
