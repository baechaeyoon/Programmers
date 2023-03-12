package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-12
 * @title : 짝수 홀수 개수
 * */

import java.util.Arrays;

public class evenOddNumber {

    public static void main(String[] args){
        int[] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list){
        int[] answer = new int[2];

        for(int i = 0; i<num_list.length; i++){
            answer[num_list[i] % 2]++;
        }
        return answer;
    }
}
