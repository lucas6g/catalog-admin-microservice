package com.fullcycle.catalog.admin.microservice.domain.category;

import com.fullcycle.catalog.admin.microservice.domain.AggregateRoot;

import java.time.Instant;


public class Category extends AggregateRoot<CategoryID> {

    private String name;
    private String description;
    private boolean ative;
    // usar o instante para timestamp um marco no tempo sempre utc
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(
            final CategoryID anId,
            final String aName,
            final String aDescription,
            final boolean isActive,
            final Instant aCreationDate,
            final Instant aUpdateDate,
            final Instant aDeletedDate
    ) {
        super(anId);
        this.name = aName;
        this.description = aDescription;
        this.ative = isActive;
        this.createdAt = aCreationDate;
        this.updatedAt = aUpdateDate;
        this.deletedAt = aDeletedDate;
    }

    public static Category newCategory(
            final String aCategoryName,
            final String aCategoryDescription,
            final boolean isActive
    ) {
        final var id = CategoryID.unique();
        final var now = Instant.now();
        return new Category(id, aCategoryName, aCategoryDescription, isActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAtive() {
        return ative;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
