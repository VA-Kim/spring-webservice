package com.viewa.webservice.web;

import com.viewa.webservice.dto.posts.PostsSaveRequestDto;
import com.viewa.webservice.web.domain.posts.Posts;
import com.viewa.webservice.web.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    private Posts posts;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

}