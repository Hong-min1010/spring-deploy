package com.springboot.practice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class Hello {

    @GetMapping(value = "/hello")
    public String HelloWorld() {

        return "Hello World";
    }

    @GetMapping(value = "/member/1")
    public Map<String, Object> firstMember() {

        return Map.of(
                "sabun", 1,
                "name", "hong gildong",
                "dept_cd", "CS001023004",
                "dept_nm", "컨테이너 실습",
                "role_cd", "EEF9852",
                "role_nm", "STUDENT"
        );
    }

    @GetMapping(value = "/dept/1")
    public Map<String, Object> container() {

        return Map.of(
                "id", 1,
                "dept_cd", "CS001023004",
                "dept_nm", "컨테이너 실습",
                "level", 3,
                "rel_dept_cd", "CS0010230000",
                "rel_dept_nm", "수강생대표팀"
        );
    }

}
