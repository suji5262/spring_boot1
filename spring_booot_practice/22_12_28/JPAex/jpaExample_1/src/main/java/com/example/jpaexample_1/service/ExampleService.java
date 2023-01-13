package com.example.jpaexample_1.service;

import com.example.jpaexample_1.dto.ExampleReqDTO;
import com.example.jpaexample_1.dto.ExampleResDTO;
import com.example.jpaexample_1.entity.Example;
import com.example.jpaexample_1.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExampleService {

    @Autowired
    ExampleRepository repo;

    //JPA에 인서트하는
    public ExampleResDTO merge(ExampleReqDTO req) {
        Example ex = req.toEntity();
        ex = repo.save(ex);
        return new ExampleResDTO(ex.getName());
    }
    // 요청을 받고 응답 dto를 줌
    // pk를 가지고 들어오면 insert
    // pk가 있음(충돌) 업데이트시킴


    public List<ExampleResDTO> selectAll() {
        List<Example> result = repo.findAll(); // 조건 없이 전체가 출력
        List<ExampleResDTO> resList = result.stream()
                .map(ex-> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }
    //for 문을 여러개 쓰는 것 보다 stream()를 쓰는게 좋음 -> 유지보수가 쉽다, 가독성


    public ExampleResDTO selectOne(ExampleReqDTO req) {

        Example res = repo.findById(req.getId()).orElse(null);
        return new ExampleResDTO(res.getName());
    }

    public void deleteOne(ExampleReqDTO req) {
        repo.deleteById(req.getId());
    }

    public void deleteAll() {
        repo.deleteAll(); // jpa에 포함된 메서드
    }

    public List<ExampleResDTO> selectByName(ExampleReqDTO dto) {
        List<Example> result = repo.findByName(dto.getName());
        List<ExampleResDTO> resList = result.stream()
                .map(ex-> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> findByNameStartingWith(ExampleReqDTO dto) {
        List<Example> result = repo.findByNameStartingWith(dto.getName());
        List<ExampleResDTO> resList = result.stream()
                .map(ex-> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> findByPriceLessThan(ExampleReqDTO dto) {
        List<Example> result = repo.findByPriceLessThan(dto.getPrice());
        List<ExampleResDTO> resList = result.stream()
                .map(ex-> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> findByNameAndPrice(ExampleReqDTO dto) {
        List<Example> result = repo.findByNameAndPrice(dto.getName(), dto.getPrice());
        List<ExampleResDTO> resList = result.stream()
                .map(ex-> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

}
