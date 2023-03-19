package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-19
 * @title : 배열 자르기
 * */

import java.util.Arrays;

public class cutArray {

    public static void main(String[] args){
        int[] numbers = {1,3,5};
        int num1 = 1;
        int num2 = 2;
        System.out.println(Arrays.toString(solution(numbers,num1,num2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2){
        int[] answer = new int[num2-num1+1];

        int index = 0;

        for(int i = num1; i<= num2; i++){
            answer[index]  = numbers[i];
            index++;
        }
        return answer;
    }
}
