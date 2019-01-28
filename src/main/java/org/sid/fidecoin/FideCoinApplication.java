package org.sid.fidecoin;

import org.sid.fidecoin.dao.ItemRepository;
import org.sid.fidecoin.dao.RoleRepository;
import org.sid.fidecoin.dao.UserRepository;
import org.sid.fidecoin.entities.Item;
import org.sid.fidecoin.util.RoleEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.sid.fidecoin.entities.Role;
import org.sid.fidecoin.entities.User;

import java.util.Arrays;

@SpringBootApplication
public class FideCoinApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(FideCoinApplication.class, args);

		ItemRepository itemRepository = ((ConfigurableApplicationContext) ctx).getBean(ItemRepository.class);



	//	itemRepository.save(new Item(1L,"Livre", "kkkkkddddddkkkkkkk", 512, 250,1L));
//		produitRepository.save(new Item(2L,"Cahier", "", 312, 215));
//		produitRepository.save(new Item(3L,"Stylo", "", 342, 12));
//		produitRepository.save(new Item(4L,"Valise", "", 52, 1550));
//		produitRepository.save(new Item(5L,"Ram papier", "", 112, 125));
//		produitRepository.save(new Item(6L,"LXXXXXX", "", 622, 250));
//		produitRepository.save(new Item(7L,"LDDDDDD", "", 422, 275));
//		produitRepository.save(new Item(8L,"LZZZZZZ", "", 612, 650));

//		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
//
//        Role roleUser = new Role(RoleEnum.ROLE_USER);

      //  roleUser.setName("ROLE_USER");
	//	Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);

	  //	roleAdmin.setName("ROLE_ADMIN");
//		roleRepository.save(roleUser);
//		roleRepository.save(roleAdmin);


//		UserRepository userRepository = ctx.getBean(UserRepository.class);
//
//		User  user = new User("user", "user", true);
//		user.setRoles(Arrays.asList(roleUser));
//		userRepository.save(user);
//
//
//		User  admin = new User("admin", "admin", true);
//		admin.setRoles(Arrays.asList(roleAdmin, roleUser));
		//admin.setRoles(Arrays.asList(roleUser));
//		userRepository.save(admin);

	}



}

