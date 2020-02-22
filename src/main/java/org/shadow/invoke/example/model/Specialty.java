package org.shadow.invoke.example.model;

import org.springframework.core.convert.converter.Converter;

public enum Specialty {
    EXPLOSIVES,
    MARKSMANSHIP,
    SURVEILLANCE,
    INFILTRATION,
    INVESTIGATION;

    public static class StringConverter implements Converter<String, Specialty> {
        @Override
        public Specialty convert(String source) {
            return Specialty.valueOf(source.toUpperCase());
        }
    }
}
