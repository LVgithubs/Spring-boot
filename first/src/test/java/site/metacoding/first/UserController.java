package site.metacoding.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    Dog dog;

    public UserController(Dog dog, HttpServletRequest request) {
        System.out.println("생성자 실행");
        this.dog = dog;
    }

    @GetMapping("/home")
    public void home() {
        System.out.println("HOME~~~~~~~~~~~~~~~~~");
    }

    @GetMapping("/bye")
    public void bye() {
        System.out.println("BYE~~~~~~~~~~~~~~~~");
    }

    @GetMapping("/data")
    public String data() {
        return "<h1>data<h1>"; // printWriter- > write - > flush
    }

}
