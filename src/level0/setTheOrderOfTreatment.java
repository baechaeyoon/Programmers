package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-06
 * @title : 진료순서 정하기
 * */

import java.util.Arrays;

public class setTheOrderOfTreatment {
    public static void main(String[] args){
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(emergency)));
    }

    public static int[] solution(int[] emergency){
        int[] answer = new int[emergency.length];

        for(int i = 0; i<answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j<answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
