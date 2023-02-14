package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-14
 * @title : 모음 제거
 * */

public class vowelRemove {

    public static void main(String[] args){
        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string){
        String answer = "";

        String[] replace = {"a", "e", "i", "o", "u"};
        for(int i = 0; i<replace.length; i++){
            if(my_string.contains(replace[i])){
                answer = my_string.replaceAll(replace[i], "");
                my_string = answer;
            }
            else{
                answer = my_string;
            }
        }
        return answer;
    }
}
