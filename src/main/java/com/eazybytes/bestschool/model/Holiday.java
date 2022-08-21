package com.eazybytes.bestschool.model;

import lombok.Data;

// classes ehich are essentially data carriers containing only constructors and getter methods are converted into records
@Data
public final class Holiday {
    private final String day;
    private final String reason;
    private final Type type;
    public enum Type {
        FESTIVAL, FEDERAL
    }
}
