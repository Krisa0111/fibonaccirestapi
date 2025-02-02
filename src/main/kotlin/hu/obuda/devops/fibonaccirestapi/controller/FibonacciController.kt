package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class FibonacciController {

    @Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    fun fibonacci(@RequestParam n: Int): ResponseEntity<Any> {
        if (n > 46) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("n is too large, must be <= 46")
        }

        val result = fibonacciService?.fibonacci(n)
        return ResponseEntity.ok(result)
    }
}