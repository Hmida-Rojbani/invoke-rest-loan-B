package de.tekup.loan.invoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InvokeRestLoanBApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvokeRestLoanBApplication.class, args);
	}

}
