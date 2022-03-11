package site.level.march_test.web;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import site.level.march_test.hospital.Hospital;
import site.level.march_test.hospital.HospitalRespository;

@Controller
public class HospitalController {

    private HospitalRespository hospitalRespository;

    public HospitalController(HospitalRespository hospitalRespository) {
        this.hospitalRespository = hospitalRespository;
    }

    @GetMapping("/")
    public String main() {

        return "hospital/download";
    }

    @GetMapping("/list")
    public String download(Model model) {

        // 1. DB 연결
        RestTemplate rt = new RestTemplate();
        String url = "http://3.38.254.72:5000/api/hospital?sidoCdNm=부산&sgguCdNm=부산사하구";

        Hospital[] response = rt.getForObject(url, Hospital[].class);

        List<Hospital> hosList = Arrays.asList(response);

        // DB에 saveAll() 호출
        hospitalRespository.saveAll(hosList);

        // 1. HospitalRepository의 findAll() 호출
        // 2. model에 담기
        // model.addAttribute("hospitals", hospitalRepository.findAll());
        model.addAttribute("hospitals", hosList);

        // 3. mustache 파일에 뿌리기

        return "hospital/list";
    }

}
