package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-29
 * @title : k의 개수
 * */

public class theNumberOfK {

    public static void main(String[] args){
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i,j,k));
    }
    public static int solution(int i, int j, int k){
        String str = "";
        for(int a = i; a <= j; a++){
            str += a+"";
        }
        return str.length() - str.replace(k+"", "").length();
    }
}
