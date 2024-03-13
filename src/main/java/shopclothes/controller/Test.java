package shopclothes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    @GetMapping("/part-01")
    public ResponseEntity<String> test01() {

        return new ResponseEntity<>("Done", HttpStatus.OK);
    }
}
