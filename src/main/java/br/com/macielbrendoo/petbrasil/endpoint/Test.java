package br.com.macielbrendoo.petbrasil.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("hello")
public class Test {

    @GetMapping("/")
    public ResponseEntity<?> HelloWorld () {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
