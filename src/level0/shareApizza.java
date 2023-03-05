package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-05
 * @title : 피자 나눠먹기(1)
 * */

public class shareApizza {
    public static void main(String[] args){
        int n = 15;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        return (n+6) / 7;
    }
}
