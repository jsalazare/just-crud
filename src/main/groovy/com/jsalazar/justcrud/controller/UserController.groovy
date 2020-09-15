package com.jsalazar.justcrud.controller

import com.jsalazar.justcrud.Exceptions.UserNotFoundException
import com.jsalazar.justcrud.common.dbmodel.User
import com.jsalazar.justcrud.repository.UserRepository
import com.jsalazar.justcrud.service.UserService
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

    UserService userService

    UserController(UserService userService) {
        this.userService = userService
    }

    @GetMapping(value="**")
    List<User> getAllUsers (){
        userService.findAll()
    }

    @GetMapping(value="/{id}")
    User getUserById (@PathVariable Long id) {
        userService.findById(id)
    }

    @PostMapping(value="**")
    User postUser (@RequestBody User user){
        userService.save(user)
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id) {
        userService.deleteById(id)
    }
}
