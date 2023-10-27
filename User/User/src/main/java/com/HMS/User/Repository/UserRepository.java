package com.HMS.User.Repository;


import com.HMS.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByFirstName(String firstName);

	User findByEmail(String email);

	List<User> findByCity(String city);

	User findByMobile(long mobile);
}
