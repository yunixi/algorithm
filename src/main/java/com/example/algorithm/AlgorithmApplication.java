package com.example.algorithm;

import com.example.algorithm.codingtest.MatchingLottoClass;
import com.example.algorithm.codingtest.TargetNumberClass;
import com.example.algorithm.codingtest.TravelPathClass;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class AlgorithmApplication implements CommandLineRunner {

    private final MatchingLottoClass matchingLottoClass;
    private final TargetNumberClass targetNumberClass;
    private final TravelPathClass travelPathClass;
    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        String [][] str = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String [][] str = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        travelPathClass.solution(str);
    }
}
