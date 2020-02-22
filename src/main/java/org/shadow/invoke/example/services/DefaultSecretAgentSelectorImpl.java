package org.shadow.invoke.example.services;

import org.shadow.invoke.example.model.SecretAgentProximity;
import org.shadow.invoke.example.model.SecretAgent;
import org.shadow.invoke.example.model.SecretAgentAssignment;
import org.shadow.invoke.example.model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultSecretAgentSelectorImpl implements SecretAgentSelector {
    @Autowired
    SecretAgentDistance secretAgentDistance;
    @Autowired
    SecretAgentDetails secretAgentDetails;

    @Override
    public SecretAgentAssignment chooseAgent(int zipCode, Specialty requiredSpecialty) {
        SecretAgentAssignment assignment = null;
        List<SecretAgentProximity> proximities = this.secretAgentDistance.findSecretAgentsNear(zipCode);
        double minDistance = Double.MAX_VALUE;
        for(SecretAgentProximity proximity : proximities) {
            if(proximity.getAgentDistance() < minDistance) {
                SecretAgent agent = this.secretAgentDetails.getSecretAgentDetails(proximity.getAgentId());
                if(agent.getSpecialty() == requiredSpecialty) {
                    assignment = new SecretAgentAssignment(proximity.getAgentDistance(), agent.getEmail());
                }
            }
        }
        return assignment;
    }
}
