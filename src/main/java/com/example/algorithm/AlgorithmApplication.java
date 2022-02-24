package com.example.algorithm;

import com.example.algorithm.codingtest.MatchingLottoClass;
import com.example.algorithm.codingtest.TargetNumberClass;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class AlgorithmApplication implements CommandLineRunner {

    private final MatchingLottoClass matchingLottoClass;
    private final TargetNumberClass targetNumberClass;
    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int[] a = {4,1,2,1};
        int b = 4;
        targetNumberClass.solution(a, b);
    }
}
