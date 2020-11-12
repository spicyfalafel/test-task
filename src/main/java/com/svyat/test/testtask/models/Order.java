package com.svyat.test.testtask.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor
@Table(name= "orders")
@Entity
public class Order {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "target_url")
    private String targetUrl;
    private double price;
    @ManyToOne
    //@JoinColumn(name="user_id", referencedColumnName = "id")
    @JsonBackReference
    private User user;
}
