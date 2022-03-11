package site.metacoding.first;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstApplicationTests {

	@Test
	public void test1() {
		System.out.println("테스트 1 함수 실행!");
	}

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		SpringApplication.run( , args);
	}

}
