package com.viewa.webservice.web.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        /**
         * 이후 테스트 코드에 영향을 끼치티 않기 위해
         * 테스트 메소드가 끝날때마다 repository 전체를 비우는 코드
         */
        postsRepository.deleteAll();
    }

    @Test
    public void selectContents() {
        // given
        postsRepository.save(Posts.builder()
                        .title("test title")
                        .content("test content")
                        .author("icewkd@gmail.com")
                        .build());
        // when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("test title"));
        assertThat(posts.getContent(), is("test content"));
    }
}






