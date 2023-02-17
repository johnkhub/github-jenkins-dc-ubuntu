package csxddocker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/app")
@Slf4j
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> create() {
        log.info("Hi ho ha");

            return new ResponseEntity<>("CINEooooo", new HttpHeaders(), HttpStatus.CREATED);

    }
}
