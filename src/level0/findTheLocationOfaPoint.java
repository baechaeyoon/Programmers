package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-20
 * @title : 점의 위치 구하기
 * */

public class findTheLocationOfaPoint {

    public static void main(String[] args){
        int[] dot = {-7,9};
        System.out.println(solution(dot));
    }

    public static int solution(int[] dot){
        if(dot[0] > 0) return (dot[1] > 0) ? 1:4;
        else return (dot[1] > 0) ? 2:3;
    }
}
