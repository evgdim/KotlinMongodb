package com.github.evgdim.kotlinspring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by evgen on 7/10/2017.
 */
@RestController
@RequestMapping("/home")
class HomeController {
    @GetMapping
    fun index() : String {
        return "aaaa"
    }
}