package site.metacoding.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/writeForm")
    public String writeFrom() {
        return "writeForm";
    }

    @GetMapping("/updateForm")
    public String updateForm() {
        return "updateForm";
    }

}
