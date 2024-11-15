package com.example.twitterapp.service;


import com.example.twitterapp.model.Post;
import com.example.twitterapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

//    @Autowired
    private PostRepository postRepository;

//    another way of dependancy injection using constructor

    public PostService(PostRepository postRepository){
    this.postRepository = postRepository;
    }

    public void save(Post post){
        post.setCreatedAt(LocalDateTime.now());
        postRepository.save(post);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }


}
