package com.github.evgdim.kotlinspring.repository

import com.github.evgdim.kotlinspring.domain.User
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by evgen on 7/16/2017.
 */
interface UserRepository : MongoRepository<User, String> {

}