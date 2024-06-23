package com.educandoweb.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Data
@Entity
public class OrderT implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "clientId")
    private UserT client;


    public OrderT() {
    }

    public OrderT(Long id, Instant moment, UserT client) {
        this.moment = moment;
        this.client = client;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderT orderT = (OrderT) o;
        return Objects.equals(id, orderT.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

