package com.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	@Query(value="select * from user_data where email_Id=?1",nativeQuery = true)
    Optional<User> findEmailId(String emailid);
	
	Boolean existsByName(String username);

	Boolean existsByEmailId(String email);
	
	User findByEmailId(String emailId);
	
	//User findByUserEmailId(String s);
	

}
