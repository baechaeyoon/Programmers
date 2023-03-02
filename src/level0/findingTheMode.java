package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-02
 * @title : 최빈값 구하기
 * */

import java.util.HashMap;
import java.util.Map;

public class findingTheMode {
    public static void main(String[] args){
        int[] array = {1,2,3,3,3,4};
        System.out.println(solution(array));
    }

    public static int solution(int[] array){
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int number : array){
            int count = map.getOrDefault(number, 0)+1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else if(count == maxCount){
                answer = -1;
            }
            map.put(number,count);
        }
        return answer;
    }
}
