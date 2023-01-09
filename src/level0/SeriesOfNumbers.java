package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-09
 * @title : 연속된 수의 합
 * */

import java.util.Arrays;

public class SeriesOfNumbers {
    public static void main(String[] args){
        int num = 3;
        int total = 12;
        System.out.println(Arrays.toString(solution(num,total)));
    }

        public static int[] solution(int num, int total) {
            int[] answer = new int[num];

            int sum = num *(1+num)/2;
            int start = (total-sum)/num;

            for(int i =1; i<num+1; i++){
                answer[i-1] = i+ start;
            }

            return answer;

    }
}
