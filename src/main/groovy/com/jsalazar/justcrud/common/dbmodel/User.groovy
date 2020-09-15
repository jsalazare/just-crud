package com.jsalazar.justcrud.common.dbmodel

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@groovy.transform.ToString
@Document
class User {

    @Id
    Long id
    String name

    User(Long id, String name) {
        this.id = id
        this.name = name
    }

    User() {
    }
}
