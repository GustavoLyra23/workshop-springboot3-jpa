package com.educandoweb.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class UserT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    @Setter(AccessLevel.NONE)
    private List<OrderT> orderTS = new ArrayList<>();


    public UserT() {
    }

    public UserT(Long id, String name, String email, String phone, String password) {
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.id = id;
    }

}

