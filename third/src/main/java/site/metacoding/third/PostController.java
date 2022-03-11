package site.metacoding.third;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * PostController
 */
@Controller
public class PostController {

    @GetMapping("/post/writeForm")
    public String writeForm() {
        return "post/writeForm";// 파일 경로 - 뷰 리졸버 설정이 되어 있다 mustach 라이브러리

    }

}