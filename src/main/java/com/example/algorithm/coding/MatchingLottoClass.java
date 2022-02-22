package com.example.algorithm.coding;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MatchingLottoClass {

    /**
     * https://programmers.co.kr/learn/courses/30/lessons/77484
     * [로또의 최고 순위와 최저 순위]
     *  로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다.
     *  이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
     *
     * int[] a = {45, 0, 0, 20, 3, 9};
     * int[] b = {45, 4, 35, 20, 3, 9};
     */

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = getLottos(lottos, win_nums);
        return answer;
    }

    public int[] getLottos(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> gradeMap = new HashMap<>(){{
            put(6, 1);
            put(5, 2);
            put(4, 3);
            put(3, 4);
            put(2, 5);
            put(1, 6);
        }};
        /**
         * 1. 0의 개수를 찾는다.
         * 2. 0을 제외하고 일치하는 갯수를 찾는다.
         * 3. 순위 가르기
         */
        //1. 0의 개수를 찾는다.
        int zeroCnt = (int) Arrays.stream(lottos).filter(w -> w == 0).count();
        List<Integer> collectList = new ArrayList<>();

        //2. 0을 제외하고 일치하는 숫자를 찾아 저장한다.
        Arrays.stream(lottos).forEach(w -> {
            if(w != 0) {
                Arrays.stream(win_nums).forEach(num -> {
                    if(num==w)
                        collectList.add(w);
                });
            }
        });

        //3. 순위 가르기
        //최고순위
        int maxGrade = collectList.size() + zeroCnt;
        //최저순위
        int minGrade = collectList.size();

        int[] result = {gradeMap.get(maxGrade), gradeMap.get(minGrade)};
        System.out.println(maxGrade + "\t" + minGrade);
        System.out.println(result[0] + "\t" + result[1]);

        return result;
    }

    public int[] AnotherAnserCode(int[] lottos, int[] win_nums) {
        int zero=0;
        int matched =0;
        for(int l : lottos) {
            if(l==0) zero++;
            else {
                for (int w: win_nums) {
                    if (l==w) {
                        matched++;
                        break;
                    }
                }
            }
        }
        int min = matched;
        int max = matched + zero;

        int[] result = {Math.min(7-max, 6), Math.min(7-min, 6)};
        return result;
    }
}
