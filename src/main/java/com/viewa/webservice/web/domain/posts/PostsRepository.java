package com.viewa.webservice.web.domain.posts;

import com.viewa.webservice.web.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
