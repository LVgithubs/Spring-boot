package site.metacoding.dbproject.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.dbproject.domain.user.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    // 서비스는 이름이 명확한게 좋기 때문에 이름을 한글로 하는게 가독성에 좋다.
    public void 유저네임중복검사() {

    }

    public void 회원가입() {

    }

    public void 로그인() {

    }

    public void 유저정보보기() {

    }

    public void 유저수정() {

    }

}
