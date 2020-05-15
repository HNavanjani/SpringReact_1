package com.example.springextwo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "products")
public class Product {

@Id
@NotNull
    private int id;
@NotNull
    private String name;
@NotNull
    private String description;


    public int getId() {
        return id;
    }


    @Override
    public String toString(){
        return "Product{"+
                "id="+id+
                ", name="+name +'\''+
                ", description="+description+'\''+
                "}";
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
