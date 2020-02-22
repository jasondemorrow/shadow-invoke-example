package org.shadow.invoke.example.services;

import org.shadow.invoke.example.model.SecretAgentAssignment;
import org.shadow.invoke.example.model.Specialty;

public interface SecretAgentSelector {
    public SecretAgentAssignment chooseAgent(int zipCode, Specialty requiredSpecialty);
}
