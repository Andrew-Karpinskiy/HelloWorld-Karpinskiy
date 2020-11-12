package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public String getMainPage() {
        return "Main";
    }

    @GetMapping("/new")
    public String addNewPerson(Model model) {
        Person person = new Person();
        model.addAttribute("person",person);
        return "NewPersonForm";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("person") Person person) {
        personRepository.save(person);
        return "Main";
    }

    @GetMapping("/showall")
    public String showAllPersons(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "PersonList";
    }


    @GetMapping("/delperson")
    public String deletePerson(Model model) {
        Person person = new Person();
        model.addAttribute("person",person);
        return "DeleteForm";
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public String delete(@ModelAttribute("person") Person person) {
        personRepository.delete(person);
        return "Main";
    }

}
