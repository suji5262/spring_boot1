package com.example.jpaexample_1.repository;

import com.example.jpaexample_1.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {

    public List<Example> findByName(String name); // where name = ?
    // 메소드 명에 따라서 쿼리가 정해짐
    // 이름이 여러개 일 수 있으니 List<>형태로 적음
    //Name 은 -> 속성에서의 Name

    public List<Example> findByNameStartingWith(String name); // where name like 'x%'
    public List<Example> findByPriceLessThan(int price); // where price < x

    public List<Example> findByNameAndPrice(String name, int price); // where name = ? and price = ?
    // 양쪽 검색



}
