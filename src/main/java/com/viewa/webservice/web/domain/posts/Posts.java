package com.viewa.webservice.web.domain.posts;

import com.viewa.webservice.web.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 기본 생성자 자동 추가, access = AccessLevel.PROTECTED -> 기본생성자의 접근 권한을 protected로 제한  // Entity 클래스를 프로젝트 코드상에서 기본생서자로 생성하는 것은 막되, JPA에서 Entity 클래스를 생성하는 것은 허용하기 위해서 추가한다.
@Getter     // 클래스 내 모든 필드의 Getter 메소드를 자동생성
@Entity     // 테이블과 링크될 클래스임을 나타냄, 언더스코어 네이밍으로 이름을 매치(ex. SalesManager.java -> sales_manager table)
<<<<<<< HEAD
public class Posts extends BaseTimeEntity{    // DB 테이블에 매칭될 클래스
=======
public class Posts extends BaseTimeEntity {    // DB 테이블에 매칭될 클래스
>>>>>>> 8918b5a6989f8e52da097d1d7f8ae65421a4bf9f

    @Id                 // PK값, 고유한 ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // PK생성규칙을 나타냄. 기본값은 auto. auto_increment와 같이 자동증가하는 정수형 값.
    private Long id;

    @Column(length = 500, nullable = false)     // 테이블 컬럼을 의미. 선언하지 않더라도 현클래스의 필드는 모두 컬럼이 된다. 변경하고 싶은 옵션이 있을때 사용 ex) 문자열 크기를 늘린다. 혹은 타입을 변경한다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;      // @Column을 사용하지 않아도 자동으로 생성된다.

    @Builder    // 해당 클래스의 빌더패턴 클래스를 생성...?
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

// 1. Setter는 왜 안 만드는가?
// 무분별한 setter 메소드 생성은 좋지않다.
// 왜? 해당 클래스의 인스턴스 값이 언제 어디서 변하는지 코드상으로 명확히 구분할 수가 없어, 차후 기능 변경시 복잡해진다.