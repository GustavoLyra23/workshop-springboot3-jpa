package com.educandoweb.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
public class OrderT implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private UserT client;


    public OrderT() {
    }

    public OrderT(Instant moment, UserT client) {
        this.moment = moment;
        this.client = client;
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

