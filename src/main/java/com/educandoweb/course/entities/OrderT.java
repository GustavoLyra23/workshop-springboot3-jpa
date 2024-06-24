package com.educandoweb.course.entities;

import com.educandoweb.course.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Setter;


import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Entity
public class OrderT implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;


    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private UserT client;


    public OrderT() {
    }

    public OrderT(Long id, Instant moment, OrderStatus orderStatus, UserT client) {
        this.moment = moment;
        this.client = client;
        this.id = id;
        setOrderStatus(orderStatus);
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public UserT getClient() {
        return client;
    }

    public void setClient(UserT client) {
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }
}

