package com.jsalazar.justcrud.common.dbmodel

import groovy.transform.ToString
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@ToString
@Document
class User {

    @Id
    Long id
    String name
    List<Product> products

    User(Long id, String name, List<Product> products) {
        this.id = id
        this.name = name
        this.products = products
    }

    User(Long id, String name) {
        this.id = id
        this.name = name
    }

    User() {
    }
}
