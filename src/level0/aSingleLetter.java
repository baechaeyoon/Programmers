package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-25
 * @title : 한 번만 등장한 문자
 * */

import java.util.Arrays;

public class aSingleLetter {

    public static void main(String[] args){
        String s ="hello";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        String answer = "";
        String[] str = s.split("");
        int count = 0;

        Arrays.sort(str);

        for(int i = 0; i<str.length; i++){
            count = 0;
            for(int k = 0; k<str.length; k++){
                if(str[i].equals(str[k])){
                    count++;
                }
            }
            if(count == 1){
                answer += str[i];
            }
        }
        return answer;
    }
}
