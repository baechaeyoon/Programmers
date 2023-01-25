package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-25
 * @title : 대문자와 소문자
 * */

public class uppercaseAndLowerCaseLetters {
    public static void main(String[] args){
        String my_string = "ABcDeFGHij";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string){
        String answer = "";
        for(int i =0; i<my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toLowerCase(my_string.charAt(i));
            }else{
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
