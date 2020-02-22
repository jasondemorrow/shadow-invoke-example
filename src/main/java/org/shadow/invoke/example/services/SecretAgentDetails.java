package org.shadow.invoke.example.services;

import org.shadow.invoke.example.model.SecretAgent;

import java.util.List;

public interface SecretAgentDetails {
    public SecretAgent getSecretAgentDetails(int secretAgentId);
    public List<SecretAgent> getAllSecretAgentDetails();
}
