package org.shadow.invoke.example.services;

import org.shadow.invoke.example.model.SecretAgent;
import org.shadow.invoke.example.model.Specialty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DefaultSecretAgentDetailsImpl implements SecretAgentDetails {
    private static final Map<Integer, SecretAgent> AGENTS_BY_ID = new HashMap<>(5);
    static {
        AGENTS_BY_ID.put(
                1,
                new SecretAgent(
                        1,
                        Specialty.EXPLOSIVES,
                        "exploder@secretagents.com",
                        "Explodey",
                        "McSplodeface"
                )
        );
        AGENTS_BY_ID.put(
                2,
                new SecretAgent(
                        2,
                        Specialty.INFILTRATION,
                        "infiltrator@secretagents.com",
                        "James",
                        "Bond"
                )
        );
        AGENTS_BY_ID.put(
                3,
                new SecretAgent(
                        3,
                        Specialty.INVESTIGATION,
                        "investigator@secretagents.com",
                        "Sherlock",
                        "Holmes"
                )
        );
        AGENTS_BY_ID.put(
                4,
                new SecretAgent(
                        4,
                        Specialty.SURVEILLANCE,
                        "watcher@secretagents.com",
                        "Ethan",
                        "Hunt"
                )
        );
        AGENTS_BY_ID.put(
                5,
                new SecretAgent(
                        5,
                        Specialty.MARKSMANSHIP,
                        "shooter@secretagents.com",
                        "Natasha",
                        "Romanoff"
                )
        );
    }

    @Override
    public SecretAgent getSecretAgentDetails(int secretAgentId) {
        return AGENTS_BY_ID.get(secretAgentId);
    }

    @Override
    public List<SecretAgent> getAllSecretAgentDetails() {
        return AGENTS_BY_ID.values().stream().collect(Collectors.toList());
    }
}
