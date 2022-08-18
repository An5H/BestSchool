package com.eazybytes.bestschool.model;

// classes ehich are essentially data carriers containing only constructors and getter methods are converted into records
public record Holiday(String day, String reason, com.eazybytes.bestschool.model.Holiday.Type type) {
    public enum Type {
        FESTIVAL, FEDERAL
    }

}
