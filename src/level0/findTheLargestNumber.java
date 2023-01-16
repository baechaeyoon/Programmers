package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-16
 * @title : 가장 큰 수 찾기
 * */

import java.util.Arrays;

public class findTheLargestNumber {

    public static void main(String[] args){
        int[] array = {9, 10, 11, 8};
        System.out.println(Arrays.toString(solution(array)));
    }

    public static int[] solution(int[] array){
        int[] answer = new int[2];
        int max = 0;
        int index = 0;

        for(int i =0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;

        return answer;
    }
}
