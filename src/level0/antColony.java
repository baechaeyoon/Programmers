package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-13
 * @title : 개미 군단
 * */

public class antColony {
    public static void main(String[] args){
        int hp = 999;
        System.out.println(solution(hp));
    }

    public static int solution(int hp){
        int answer = hp / 5 + hp % 5 / 3 + hp % 5 % 3;
        return answer;
    }
}
