package ru.mike.diploma.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractNamedEntity extends AbstractBaseEntity {
    @Column(name = "name")
    protected String name;

    public AbstractNamedEntity() {
    }

    public AbstractNamedEntity(String name, Integer id) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
