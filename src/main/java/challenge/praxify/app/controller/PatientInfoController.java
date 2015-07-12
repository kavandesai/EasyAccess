package challenge.praxify.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import challenge.praxify.app.bo.Patient;
import challenge.praxify.app.repository.PatientRepository;
import challenge.praxify.app.service.PatientService;

@Controller
public class PatientInfoController {
@Autowired
private PatientRepository repo;
private PatientService service;

@RequestMapping(value = "/", method = RequestMethod.GET)
public String findAll(Model model) {
    List<Patient> models = service.getList();
    model.addAttribute("Patient", models);
    return "patient/list";
}
}
