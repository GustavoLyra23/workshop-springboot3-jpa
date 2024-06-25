package com.educandoweb.course.entities.pk;

import com.educandoweb.course.entities.OrderT;
import com.educandoweb.course.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPk implements Serializable {


    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderT orderT;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderT getOrderT() {
        return orderT;
    }

    public void setOrderT(OrderT orderT) {
        this.orderT = orderT;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPk that = (OrderItemPk) o;
        return Objects.equals(orderT, that.orderT) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderT, product);
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
