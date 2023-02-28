package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-28
 * @title : 특정 문자 제거하기
 * */

public class removeSpecificCharacter {

    public static void main(String[] args){
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution(my_string,letter));
    }

    public static String solution(String my_string, String letter){
        String answer = my_string.replace(letter, "");
        return answer;
    }
}
