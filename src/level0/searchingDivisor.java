package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-24
 * @title : 약수 구하기
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class searchingDivisor {
    public static void main(String[] args){
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n){
        List<Integer> answer = new ArrayList<>();

        for(int i =1; i<=n; i++){
            if(n%i == 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
