package com.jsalazar.justcrud.common.dbmodel

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
class Product {

    @Id
    Long id
    String name
}