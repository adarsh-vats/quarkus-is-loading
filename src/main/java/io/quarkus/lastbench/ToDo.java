package io.quarkus.lastbench;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class ToDo extends PanacheEntity {

    @NotBlank
    public String title;
    public String url;
    public boolean completed;
    @Column(name = "ordering")
    public int order;


}
