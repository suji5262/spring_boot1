package com.example.jpaexample_1.dto;

import com.example.jpaexample_1.entity.Example;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@Data //라고 치면 위에 5개가 다 포함된 어노테이션이 만들어짐

public class ExampleReqDTO { // 요청 DTO

    private Long id;
    private String name;
    private int price;


    // 엔티티로 변환할 수 있는 변환 메서드
    public Example toEntity() {
        return Example.builder()
                .id(id)
                .name(name)
                .price(price)
                .build();
    } // 가독성 있게 작성하라, 메서드를 호출해서 엔티티로 바꿔줄 수 있음

}
// entity 와 같으면 좋지않음
// 생성자를 통해 만드는 것보다 빌더로 만드는게 좋음