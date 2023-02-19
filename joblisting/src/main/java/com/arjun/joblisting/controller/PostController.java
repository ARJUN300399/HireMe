package com.arjun.joblisting.controller;

import com.arjun.joblisting.repository.PostRepository;
import com.arjun.joblisting.model.Post;
import com.arjun.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    public PostRepository repo;
    @Autowired
    public SearchRepository srepo;
    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
    @GetMapping("/a/{text}")
    public List<String> Asearch(@PathVariable String text){
        return srepo.printString(text);
    }
    @GetMapping("/po")
    public String search(){
        String a = "hello";
        return a;
    }

}
