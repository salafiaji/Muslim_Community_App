package com.ajiii.muslimCommunityApp.repository;

import com.ajiii.muslimCommunityApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
