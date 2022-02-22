package com.example.algorithm;

import com.example.algorithm.coding.MatchingLottoClass;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class AlgorithmApplication implements CommandLineRunner {

    private final MatchingLottoClass matchingLottoClass;
    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int[] a = {45, 0, 0, 20, 3, 9};
        int[] b = {45, 4, 35, 20, 3, 9};
        matchingLottoClass.solution(a, b);
    }
}
