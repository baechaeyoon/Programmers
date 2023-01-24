package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-24
 * @title : 문자열 계산하기
 * @problem : 못 푼 문제(**다시 공부하기**)
 * */

import java.util.Arrays;

public class calculatingAString {
    public static void main(String[] args){
        String myString = "3 + 4";
        System.out.println(solution(myString));
    }

    public static int solution(String myString){
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }
}
