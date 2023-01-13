package com.example.jpaexample_1.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor // 전체 파라미터를 받는 생성자
@NoArgsConstructor // 기본 생성자(파라미터를 받지 않는 생성자)
// 둘다 lombok에서 씀
@Getter
@Setter
@Builder //
@Entity // 엔티티 클래스
@Table(name= "Example" ) // 어느 테이블과 연결되어있다
public class Example {

    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int price;
}
// 각 필드에 컬럼, pk 적어줌
// 안쪽에서 만 사용 (밖으로 나가지 않음)