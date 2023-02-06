package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-06
 * @title : 팩토리얼
 * */

public class factorial {
    public static void main(String[] args){
        int n = 3628800;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            } else break;
        }
        return i-1;
    }
}
