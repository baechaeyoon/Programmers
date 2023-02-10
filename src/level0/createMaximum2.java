package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-10
 * @title : 최댓값 만들기2
 * */

import java.util.Arrays;

public class createMaximum2 {
    public static void main(String[] args){
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}
