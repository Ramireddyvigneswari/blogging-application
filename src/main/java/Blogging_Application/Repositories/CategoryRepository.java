package Blogging_Application.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Blogging_Application.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> {
}


