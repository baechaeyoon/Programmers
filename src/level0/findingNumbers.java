package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-18
 * @title : 숫자 찾기
 * */

public class findingNumbers {

    public static void main(String[] args){
        int num = 29183;
        int k = 1;
        System.out.println(solution(num,k));
    }

    public static int solution(int num, int k){
        String strNum = num+"";
        String strK = k+"";

        int answer = strNum.indexOf(strK);
        return answer>-1 ? ++answer : answer;
    }
}
