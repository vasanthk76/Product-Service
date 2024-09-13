package com.example.productservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModelClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
