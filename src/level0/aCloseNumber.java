package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-27
 * @title : 가까운 수
 * */

import java.util.Arrays;

public class aCloseNumber {
    public static void main(String[] args){
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n){
        int answer = 0;
        Arrays.sort(array);

        for(int i = 1; i<array.length; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}
