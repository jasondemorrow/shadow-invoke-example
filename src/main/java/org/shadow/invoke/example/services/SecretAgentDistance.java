package org.shadow.invoke.example.services;

import org.shadow.invoke.example.model.SecretAgentProximity;

import java.util.List;

public interface SecretAgentDistance {
    public List<SecretAgentProximity> findSecretAgentsNear(int zipCode);
}
