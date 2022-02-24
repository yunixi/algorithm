package com.example.algorithm.codingtest;

import org.springframework.stereotype.Component;

@Component
public class TargetNumberClass {

    /**
     * @date 2022.02.24
     * @author : jiyun.kim
     * https://programmers.co.kr/learn/courses/30/lessons/43165
     *
     * n개의 음이 아닌 정수들이 있습니다.
     * 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
     * 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
     *
     * -1+1+1+1+1 = 3
     * +1-1+1+1+1 = 3
     * +1+1-1+1+1 = 3
     * +1+1+1-1+1 = 3
     * +1+1+1+1-1 = 3
     * 사용할 수 있는 숫자가 담긴 배열 numbers,
     * 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서
     * 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
     */
    private int value = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        answer = value;
        System.out.println(answer);
        return answer;
    }

    private void dfs(int[] numbers, int depth, int target, int result) {
        if(depth == numbers.length) {
            if (target == result) {
                value++;
            }
            return;
        }
        dfs(numbers, depth+1, target, result+numbers[depth]);
        dfs(numbers, depth+1, target, result-numbers[depth]);
    }


}
