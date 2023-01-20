package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-20
 * @title : n의 배수 고르기
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class multipleChoiceOfN {
    public static void main(String[] args){
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};
        System.out.println(Arrays.toString(solution(n,numlist)));
    }

    public static int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i : numlist){
            if(i%n == 0){
                arr.add(i);
            }
        }
        Integer[] num = arr.toArray(new Integer[arr.size()]);
        int[] answer = Arrays.stream(num).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
