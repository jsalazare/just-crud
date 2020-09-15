package com.jsalazar.justcrud.service

import com.jsalazar.justcrud.common.dbmodel.User

interface UserService {

    List<User> findAll ()

    User findById(Long id)

    User save (User user)

    void deleteById(Long id);

}
