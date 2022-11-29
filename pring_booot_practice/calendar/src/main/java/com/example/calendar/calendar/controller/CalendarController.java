package com.example.calendar.calendar.controller;

import com.example.calendar.dto.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalendarController {

    private ArrayList<Calendar> calList = new ArrayList<>();

    @GetMapping("/all/schedule")
    public ArrayList<Calendar> allSchedule() {
        return calList;
    } // 할일을 화면으로 전송

    @GetMapping("/put/schedule")
    public ArrayList<Calendar> putSchedule(Calendar cal) {
        calList.add(cal);
        return calList;
    } // 할일을 등록
}
// <Calendar> → DTO와 연결이 되어야함!!! 다른거랑 연결하면 안됨