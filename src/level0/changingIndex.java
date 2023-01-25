package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-25
 * @title : 인덱스 바꾸기
 * */

public class changingIndex {
    public static void main(String[] args){
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        System.out.println(solution(my_string,num1,num2));
    }

    public static String solution(String my_string, int num1, int num2){
        String answer = "";
        String[] s = my_string.split("");

        for(int i = 0; i<s.length; i++){
            if(i == num1){
                answer += s[num2];
            }
            else if(i == num2){
                answer += s[num1];
            }
            else{
                answer += s[i];
            }
        }
        return answer;
    }
}
