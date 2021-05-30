package com.milko.elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "productindex")
public class Product {
    @Id
    private String id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

//    @Field(type = FieldType.Double, name = "price")
//    private Double price;
//
//    @Field(type = FieldType.Integer, name = "quantity")
//    private Integer quantity;
//
//    @Field(type = FieldType.Keyword, name = "category")
//    private String category;

    @Field(type = FieldType.Text, name = "desc")
    private String description;

    @Field(type = FieldType.Keyword, name = "manufacturer")
    private String manufacturer;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Double getPrice() {
//        return this.price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public Integer getQuantity() {
//        return this.quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public String getCategory() {
//        return this.category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
