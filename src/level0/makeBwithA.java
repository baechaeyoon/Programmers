package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-29
 * @title : A로 B 만들기
 * */

import java.util.Arrays;

public class makeBwithA {
    public static void main(String[] args){
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before,after));
    }

    public static int solution(String before, String after){
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();

        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);

        String beforeStr = new String(beforeChar);
        String afterStr = new String(afterChar);

        if(beforeStr.equals(afterStr)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
