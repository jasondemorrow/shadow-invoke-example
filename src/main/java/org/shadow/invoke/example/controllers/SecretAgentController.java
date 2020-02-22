package org.shadow.invoke.example.controllers;

import org.shadow.invoke.example.model.SecretAgentAssignment;
import org.shadow.invoke.example.services.SecretAgentSelector;
import org.shadow.invoke.example.model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretAgentController {
    @Autowired
    SecretAgentSelector secretAgentSelector;

    @GetMapping(path="/agent/assign/{zip}/{specialty}")
    public SecretAgentAssignment assign(@PathVariable int zip, @PathVariable Specialty specialty) {
        return this.secretAgentSelector.chooseAgent(zip, specialty);
    }
}
