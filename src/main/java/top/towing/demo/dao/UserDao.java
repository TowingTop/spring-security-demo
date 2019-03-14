package top.towing.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import top.towing.demo.model.User;

public interface UserDao extends JpaRepository<User, String> {
	User findByUsername(String userId);
}
