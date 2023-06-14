package com.devsuperior.dscommerce.tests;

import java.time.LocalDate;

import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;

public class UserFactory {
	
	public static User createClientUser() {
		User user = new User(1L, "Maria", "maria@gmail.com", "83567289", LocalDate.parse("2001-07-25"), "ljkshfjksdhfkjs");
		user.addRole(new Role(1L,"ROLE_CLIENT"));
		return user;
	}

	public static User createAdminUser() {
		User user = new User(2L, "Alex", "alex@gmail.com", "5754688", LocalDate.parse("2000-02-20"), "ljkshfjksdhfkjs");
		user.addRole(new Role(2L,"ROLE_ADMIN"));
		return user;
	}

	public static User createCustomAdminUser(Long id, String name) {
		User user = createAdminUser();
		user.setId(id);
		user.setName(name);
		return user;
	}

	public static User createCustomClientUser(Long id, String name) {
		User user = createClientUser();
		user.setId(id);
		user.setName(name);
		return user;
	}

}
