package com.svyat.test.testtask.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name= "users")
@Entity
@ToString(exclude = "orders")
public class User {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Order> orders;
}
