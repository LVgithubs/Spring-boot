package site.level.march_test;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import site.level.march_test.hospital.Hospital;

@SpringBootTest
class MarchTestApplicationTests {

	@Test
	public void contextLoads() {
		RestTemplate rt = new RestTemplate();
		List<Hospital> hos = new ArrayList<>();
		// Hospital c = rt.getForEntity("주소", Hospital.class);

		String url = "http://3.38.254.72:5000/api/hospital?sidoCdNm=%EB%B6%80%EC%82%B0&sgguCdNm=%EB%B6%80%EC%82%B0%EC%82%AC%ED%95%98%EA%B5%AC";

		String[] response = rt.getForObject(url, String[].class);
		List<String> list = Arrays.asList(response);
		System.out.println(response);

	}

}
