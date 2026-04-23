package Blogging_Application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Blogging_Application.Repositories.CategoryRepository;
import Blogging_Application.Repositories.PostRepository;
import Blogging_Application.Repositories.UserRepository;
import Blogging_Application.entities.Category;
import Blogging_Application.entities.Post;
import Blogging_Application.entities.User;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private CategoryRepository catRepo;

    @PostMapping("/")
    public Post createPost(@RequestBody Post post){

        User user = userRepo.findById(post.getUser().getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Category category = catRepo.findById(post.getCategory().getId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        post.setUser(user);
        post.setCategory(category);

        return postRepo.save(post);
    }
}


