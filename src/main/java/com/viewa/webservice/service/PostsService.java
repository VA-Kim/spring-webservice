package com.viewa.webservice.service;

import com.viewa.webservice.dto.posts.PostsSaveRequestDto;
import com.viewa.webservice.web.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){  // id를 알수있도록 리턴 타입을 Long
        return postsRepository.save(dto.toEntity()).getId();    // 굳이 dto를 controller가 아닌 service에서 불러서 쓰는 이유는, 역할분담을 위해서.
        // 비지니스 로직 & 트랜잭션 관리는 모두 Service에서 관리
        // View 와 연동되는 부분은 Controller에서 담당
    }
}
