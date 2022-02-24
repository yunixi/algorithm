package com.example.algorithm.codingtest;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TravelPathClass {

    public String[] solution(String[][] tickets) {
        String[] answer = getAnswer(tickets);
        return answer;
    }

    public String[] getAnswer(String[][] tickets) {
        Map<String, List<String>> airportMap = new LinkedHashMap<>();

        for (int x=0; x< tickets.length; x++) {
            if(!airportMap.containsKey(tickets[x][0]))
                airportMap.put(tickets[x][0], new ArrayList<String>(Arrays.asList(tickets[x][1])));
            else {
                List list = airportMap.get(tickets[x][0]);
                list.add(tickets[x][1]);
                airportMap.put(tickets[x][0], list);
            }
        }

        System.out.println(airportMap);

        return new String[]{"ss"};
    }
}
