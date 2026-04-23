package Blogging_Application.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Blogging_Application.entities.Post;


public interface PostRepository extends JpaRepository<Post, Integer> {
}


