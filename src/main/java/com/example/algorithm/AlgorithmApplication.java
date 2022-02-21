package com.example.algorithm;

import com.example.algorithm.coding.MatchingLottoClass;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class AlgorithmApplication implements Runnable{

    private final MatchingLottoClass matchingLottoClass;
    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        Thread thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("here");
        int[] a = {45, 4, 35, 20, 3, 9};
        int[] b = {20, 9, 3, 45, 4, 35};
        matchingLottoClass.solution(a, b);
    }
}
