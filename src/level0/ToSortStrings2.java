package level0;
import java.util.*;
/*
 * @author : baechaeyoon
 * @date : 2023-01-13
 * @title : 문자열 정렬하기2
 * */

public class ToSortStrings2 {
    public static void main(String[] args){
        String my_string = "Python";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        String[] array = my_string.toLowerCase().split("");

        Arrays.sort(array);

        for(int i =0; i<array.length; i++){
            answer += array[i];
        }
        return answer;
    }
}
