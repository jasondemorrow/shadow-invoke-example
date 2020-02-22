package org.shadow.invoke.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SecretAgent {
    private int id;
    private Specialty specialty;
    private String email;
    private String firstName;
    private String lastName;
}
