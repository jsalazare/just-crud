package com.jsalazar.justcrud.repository

import com.jsalazar.justcrud.common.dbmodel.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository extends MongoRepository<User, Long> {

}
