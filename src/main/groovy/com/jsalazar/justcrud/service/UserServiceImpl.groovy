package com.jsalazar.justcrud.service

import com.jsalazar.justcrud.Exceptions.UserNotFoundException
import com.jsalazar.justcrud.common.dbmodel.User
import com.jsalazar.justcrud.repository.UserRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class UserServiceImpl implements UserService{

    UserRepository userRepository

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository
    }

    @Override
    List<User> findAll() {
        userRepository.findAll(Sort.by("id"))
    }

    @Override
    User findById(Long id) {
        userRepository.findById(id).orElseThrow({ -> new UserNotFoundException(id) })
    }

    @Override
    User save(User user) {
        userRepository.save(user)
    }

    @Override
    void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
