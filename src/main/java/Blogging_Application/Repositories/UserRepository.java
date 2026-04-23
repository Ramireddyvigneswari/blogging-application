package Blogging_Application.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Blogging_Application.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
}


