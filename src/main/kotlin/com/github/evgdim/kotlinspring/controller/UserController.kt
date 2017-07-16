package com.github.evgdim.kotlinspring.controller

import com.github.evgdim.kotlinspring.domain.User
import com.github.evgdim.kotlinspring.repository.UserRepository
import org.springframework.web.bind.annotation.*

/**
 * Created by evgen on 7/16/2017.
 */
@RestController
@RequestMapping("user")
class UserController(val userRepo: UserRepository) {

    @GetMapping
    fun usersByAge(@RequestParam(required = false) age: Integer?): List<User>? {
        return if (age != null) {
            userRepo.findByAge(age)
        } else {
            userRepo.findAll();
        }
    }

    @PostMapping
    fun addUser(@RequestBody user: User): User? {
        return userRepo.insert(user);
    }
}