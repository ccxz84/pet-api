package com.animal.house.was.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*

@RestController
@RequestMapping("/member")
public class JoinController {

    @GetMapping("/join")
    public fun signUp(): ResponseEntity<Int> {
        return ResponseEntity.of(Optional.of(3));
    }

}