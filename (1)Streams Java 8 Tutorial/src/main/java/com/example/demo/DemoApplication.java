package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("PK", 23));
        list.add(new Student("KK", 26));
        list.add(new Student("MK", 23));
        list.add(new Student("SK", 21));
        list.add(new Student("RK", 40));
        list.add(new Student("BK", 30));

        Stream<Student> parallelStream = list.parallelStream();
        System.out.println("Students data send for processing::::");
        parallelStream.forEach(s->doProcess(s));

    }

    private static void doProcess(Student s) {
     System.out.println(s);
    }
}
