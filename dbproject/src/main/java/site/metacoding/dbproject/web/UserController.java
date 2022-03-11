package site.metacoding.dbproject.web;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.dbproject.domain.user.User;
import site.metacoding.dbproject.domain.user.UserRepository;

@RequiredArgsConstructor
@Controller
public class UserController {

    private UserRepository userRepository;

    // joinForm, writeForm
    // insertForm, insertForm

    // 회원가입 페이지(정적)
    @GetMapping("/user/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    // 회원가입 페이지(동적)
    @PostMapping("/join")
    public String join(User user) {
        System.out.println("User : " + user);
        userRepository.save(user);
        return "redirect:/loginForm"; // 로그인페이지 이동해주는 컨트롤러 메서드를 재활용
    }

    // 로그인 페이지 (정적)
    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    // SELECT * FROm user WHERE username=? AND password=?
    // 원래 SELECT 는 무조건 get 요청
    // 그런데 login 만 예외(POST)
    // 이유 : 주소에 비밀번호를 남기면 안돼!
    // 로그인 페이지
    @PostMapping("/login")
    public String login(HttpServletRequest request, User user) {
        HttpSession session = request.getSession();
        User userEntity = userRepository.mLogin(user.getUsername(), user.getPassword());
        return "메인페이지를 돌려주면 됨"; // PostController 만들고 수정하자.
    }

    // 유저 정보 보는 페이지
    @GetMapping("/user/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        User principal = (User) session.getAttribute("principal");

        // 1. 인증 체크
        if (principal == null) {
            return "redirect:/loginForm";
        }

        // 2. 권한체크
        if (principal.getId() != id) {
            return "redirect:/loginForm";
        }

        // 3. 핵심로직
        Optional<User> userOp = userRepository.findById(id);

        if (userOp.isPresent()) {
            User userEntity = userOp.get();
            model.addAttribute("user", userEntity);
            return "user/detail";
        } else {
            return "redirect:/";
        }
    }

    // 유저 수정
    @PutMapping("/user/{id}")
    public String update(@PathVariable Integer id) {
        return "redirect:/user" + id;
    }

    @GetMapping("/logout")
    public String logout() {
        return "메인페이지를 돌려주면 됨"; // PostController 만들고 수정하자.
    }

}
