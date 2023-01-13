package com.example.jpaexample_1.contorller;

import com.example.jpaexample_1.dto.ExampleReqDTO;
import com.example.jpaexample_1.dto.ExampleResDTO;
import com.example.jpaexample_1.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController {

    @Autowired
    ExampleService es;

    @GetMapping("/isert")
    public ExampleResDTO mergeExample() {
        ExampleReqDTO dto = new ExampleReqDTO(1L, "fish", 1500);
        return es.merge(dto);
    } // 추가

    @GetMapping("/selectAll")
    public List<ExampleResDTO> selectAll() {
        return es.selectAll();
    } // 모두 조회

    @GetMapping("/selectOne")
    public ExampleResDTO selectOne() {
        return es.selectOne(new ExampleReqDTO(7L, "chicken", 1500));
    } // chicken 만 조회

    @GetMapping("/deleteOne")
    public void deleteOne() {
        es.deleteOne(new ExampleReqDTO(7L, "chicken", 1500));
    } // chicken 만 지우기

    @GetMapping("/deleteAll")
    public void deleteAll() {
        es.deleteAll();
    } // 모두 지우기

    @GetMapping("/selectByName")
    public List<ExampleResDTO> selectByName() {
        ExampleReqDTO dto = new ExampleReqDTO(1L, "fish3", 1500);
        return es.selectByName(dto);
    } // fish3 찾기

    @GetMapping("/findByNameStartingWith")
    public List<ExampleResDTO> findByNameStartingWith() {
        ExampleReqDTO dto = new ExampleReqDTO(1L, "fish", 1500);
        return es.findByNameStartingWith(dto);
    } // fish 라는 이름을 갖은 데이터 모두 찾기

    @GetMapping("/findByPriceLessThan")
    public List<ExampleResDTO> findByPriceLessThan() {
        ExampleReqDTO dto = new ExampleReqDTO(1L, "fish", 3000);
        return es.findByPriceLessThan(dto);
    } // 3000원 미만 찾기

    @GetMapping("/findByNameAndPrice")
    public List<ExampleResDTO> findByNameAndPrice() {
        ExampleReqDTO dto = new ExampleReqDTO(1L, "fish4", 4500);
        return es.findByNameAndPrice(dto);
    } // 양쪽 검색



}
