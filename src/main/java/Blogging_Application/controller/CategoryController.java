package Blogging_Application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Blogging_Application.Repositories.CategoryRepository;
import Blogging_Application.entities.Category;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @PostMapping("/")
    public Category createCategory(@RequestBody Category category){
        return repo.save(category);
    }
}

