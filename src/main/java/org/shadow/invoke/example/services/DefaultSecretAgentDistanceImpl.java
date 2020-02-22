package org.shadow.invoke.example.services;

import org.shadow.invoke.example.model.SecretAgentProximity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class DefaultSecretAgentDistanceImpl implements SecretAgentDistance {
    @Autowired
    private SecretAgentDetails detailsService;

    @Override
    public List<SecretAgentProximity> findSecretAgentsNear(int zipCode) {
        return detailsService
                .getAllSecretAgentDetails()
                .stream()
                .map(s -> new SecretAgentProximity(s.getId(), 10.0 * ThreadLocalRandom.current().nextDouble()))
                .collect(Collectors.toList());
    }
}
