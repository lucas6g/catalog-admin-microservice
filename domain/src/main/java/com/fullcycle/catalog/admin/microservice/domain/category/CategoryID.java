package com.fullcycle.catalog.admin.microservice.domain.category;

import com.fullcycle.catalog.admin.microservice.domain.Identifier;

import java.util.Objects;
import java.util.UUID;


// é um value obeject
public class CategoryID extends Identifier {

    private final String value;

    private CategoryID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;

    }

    public static CategoryID unique() {
        return new CategoryID(UUID.randomUUID().toString().toLowerCase());
    }

    public static CategoryID from (final String anId) {
        return new CategoryID(anId);
    }

    public static CategoryID from (final UUID anId) {
        return new CategoryID(anId.toString().toLowerCase());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       final CategoryID that = (CategoryID) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
