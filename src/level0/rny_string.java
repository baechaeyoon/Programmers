package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-05-08
 * @title : rny_string
 * */

public class rny_string {

    public static void main(String[] args){
        String rny_string = "masterpiece";
        System.out.println(solution(rny_string));
    }
    public static String solution(String rny_string){
        String answer = rny_string.replaceAll("m","rn");
        return answer;
    }
}
