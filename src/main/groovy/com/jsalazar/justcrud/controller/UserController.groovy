package com.jsalazar.justcrud.controller

import com.jsalazar.justcrud.common.dbmodel.User
import com.jsalazar.justcrud.repository.UserRepository
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController {

    UserRepository userRepository

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository
    }

    @GetMapping(value="/")
    List<User> getAllUsers (){
        userRepository.findAll(Sort.by("id"))
    }

    @GetMapping(value="/{id}")
    User getUserById (@PathVariable Long id) {
        userRepository.findById(id).orElse(null)
    }

    @PostMapping(value="/")
    User postUser (@RequestBody User user){
        userRepository.save(user)
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
