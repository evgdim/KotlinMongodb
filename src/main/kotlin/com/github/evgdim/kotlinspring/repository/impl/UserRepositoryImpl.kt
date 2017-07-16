package com.github.evgdim.kotlinspring.repository.impl

import com.github.evgdim.kotlinspring.domain.User
import com.github.evgdim.kotlinspring.repository.CustomUserRepository
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Repository

/**
 * Created by evgen on 7/16/2017.
 */
@Repository
class UserRepositoryImpl(val mongo: MongoOperations) : CustomUserRepository{
    override fun findByAge(age: Integer): List<User> {
        val query = Query(Criteria.where("age").`is`(age))
        return mongo.find(query, User::class.java)
    }

}