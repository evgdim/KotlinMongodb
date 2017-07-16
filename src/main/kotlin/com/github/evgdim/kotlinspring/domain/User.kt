package com.github.evgdim.kotlinspring.domain

import org.springframework.data.annotation.Id

/**
 * Created by evgen on 7/16/2017.
 */
data class User(@Id val id: String? = null, val name: String? = null, val age: Integer? = null){
}