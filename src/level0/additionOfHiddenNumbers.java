package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-14
 * @title : 숨어있는 숫자의 덧셈(1)
 * */

import java.util.Arrays;

public class additionOfHiddenNumbers {

    public static void main(String[] args){
        String my_string = "aAb1B2cC34oOp";
        int answer = (int)solution(my_string);
        System.out.println(answer);
    }

    public static int solution(String my_string){
        return Arrays.stream(my_string.replaceAll("[a-z|A-Z]","").split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
