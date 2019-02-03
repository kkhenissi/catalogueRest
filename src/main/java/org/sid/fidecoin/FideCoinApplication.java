package org.sid.fidecoin;


import org.sid.fidecoin.entities.AppRole;
import org.sid.fidecoin.service.AccountService;
import org.sid.fidecoin.util.RoleEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.stream.Stream;


@SpringBootApplication
public class FideCoinApplication  {

	public static void main(String[] args) {

		SpringApplication.run(FideCoinApplication.class, args);


	}

	@Bean
	CommandLineRunner start(AccountService accountService) {
		return args -> {
		  	accountService.saveRole(new AppRole(RoleEnum.ROLE_USER));
		  	accountService.saveRole(new AppRole(RoleEnum.ROLE_ADMIN));

//			Stream.of("user1", "user2", "user3", "user4", "admin").forEach(one->{
//				accountService.saveUser(one, "1234", "1234");
//			});
			accountService.saveUser("admin", "1234", "1234");
			accountService.addRoleToUser("admin", "ADMIN");


		};
	}
    @Bean
	BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}


}

