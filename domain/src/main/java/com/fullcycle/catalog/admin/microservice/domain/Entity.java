package com.fullcycle.catalog.admin.microservice.domain;
import java.util.Objects;

// passar o tipo do ID por parametro
public abstract class Entity<ID extends Identifier> {

    //protected para que somente as subclasses possam acessar esse atributo
    protected final ID id;


    protected Entity(final ID id) {
        Objects.requireNonNull(id,"'id' should not be null");
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       final Entity<?> entity = (Entity<?>) o;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
