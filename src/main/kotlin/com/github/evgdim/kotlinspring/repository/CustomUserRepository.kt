package com.github.evgdim.kotlinspring.repository

import com.github.evgdim.kotlinspring.domain.User

/**
 * Created by evgen on 7/16/2017.
 */
interface CustomUserRepository {
    fun findByAge(age: Integer): List<User>;
}