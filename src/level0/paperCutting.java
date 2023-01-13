package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-12
 * @title : 종이 자르기
 * */
public class paperCutting {
    public static void main(String[] args){
        int N = 2;
        int M = 5;
        System.out.println(solution(N,M));
    }
    public static int solution(int N, int M){
        int answer = N*M-1;
        return answer;
    }
}
