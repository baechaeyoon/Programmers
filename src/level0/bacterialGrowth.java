package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-10
 * @title : 세균 증식
 * */

public class bacterialGrowth {
    public static void main(String[] args){
        int n = 2;
        int t = 10;
        System.out.println(solution(n, t));
    }
    public static int solution(int n, int t){
        int answer = n * (int)Math.pow(2,t);
        return answer;
    }
}
