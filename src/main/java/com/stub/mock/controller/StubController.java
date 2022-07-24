package com.stub.mock.controller;

import com.stub.mock.models.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class StubController {

    //"yyyy.MM.dd G 'at' HH:mm:ss z"

    private static final String text = "json response!";
    private final AtomicLong counter = new AtomicLong(); // счётчик
    private static final String verify = "Проверка прошла успешно!";
    private final LocalDateTime date = LocalDateTime.now(); //"2022-07-08T20:41:43.5369471"

    //Обрабатывает get-запросы
    @GetMapping("/stub")
    public Service stub() {
        try {
            return new Service(counter.incrementAndGet(), text, date, verify);
        } catch (Exception e) {
            System.err.println("catch Exception");
        }
        return null;
    }

    //    Проверка сервера
//    public ResponseEntity getStub() {
//        try {
//            return ResponseEntity.ok("Сервер работает");
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Произошла ошибка");
//        }
//    }
}
