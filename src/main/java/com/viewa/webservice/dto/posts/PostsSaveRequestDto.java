package com.viewa.webservice.dto.posts;

import com.viewa.webservice.web.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}


// 1.여기서는 Setter를 쓰는 이유?
// Controller에서 @RequestBody로 외부에서 데이터를 받는 경우엔, 기본생성자 + set메소드를 통해서만 값이 할당! 되기 때문이다.
// 그래서 이때만 setter를 허용한다!

// 2. 왜 Entity 클래스와 동일한 양식의 클래스를 Dto로 또 만들어서 쓰는가?
// Entity 클래스는 가장 Core 클래스이다.
// 이 클래스가 변경되면 다른 클래스들에도 영향이 간다.
// 그래서, View Layer & DB Layer를 분리하는 거다.
// (Request & Response 용 DTO는 View를 위한 클래스라서 변경이 잦다.)