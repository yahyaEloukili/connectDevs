package org.sid.connectDevs.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import org.sid.connectDevs.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}

