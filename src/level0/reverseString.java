package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-10
 * @title : 문자열 뒤집기
 * */

public class reverseString {
    public static void main(String[] args){
        String my_string = "jaron";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string){
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
