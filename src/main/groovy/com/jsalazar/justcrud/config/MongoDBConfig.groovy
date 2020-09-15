package com.jsalazar.justcrud.config

import com.jsalazar.justcrud.common.dbmodel.User
import com.jsalazar.justcrud.repository.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories(basePackages = "com.jsalazar.justcrud.repository")
@Configuration
class MongoDBConfig {

    @Bean
    CommandLineRunner lineRunner(UserRepository userRepository) {
        { strings -> userRepository.save(new User(1, "jhon")) }
    }

}
