package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-23
 * @title : 직사각형 넓이 구하기
 * */

public class findTheAreaOfRectangle {
    public static void main(String[] args){
        int[][] dots = {{1,1}, {2,1}, {2,2}, {1,2}};
        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots){
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;

        for(int i = 0; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }
            else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        answer = tmp2 * tmp3;
        return answer;
    }
}
