package site.level.march_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class MarchTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarchTestApplication.class, args);
	}

}
