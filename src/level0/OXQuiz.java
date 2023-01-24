package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-24
 * @title : OX퀴즈
 * */

import java.util.Arrays;

public class OXQuiz {
    public static void main(String[] args){
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(solution(quiz)));
    }

    public static String[] solution(String[] quiz){
        String[] answer = new String[quiz.length];
        String[] str = new String[quiz.length];

        for(int i = 0; i<quiz.length; i++){
            str = quiz[i].split(" ");

            if(str[1].equals("-"))
            {
                if(Integer.parseInt(str[0])-Integer.parseInt(str[2])==Integer.parseInt(str[4]))
                {
                    answer[i] = "O";
                }
                else
                {
                    answer[i] = "X";
                }
            }

            if(str[1].equals("+"))
            {
                if(Integer.parseInt(str[0])+Integer.parseInt(str[2])==Integer.parseInt(str[4]))
                {
                    answer[i] = "O";
                }
                else
                {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
