package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-12
 * @title : 문자열 밀기
 * */
public class pushingStrings {
    public static void main(String[] args){
        String A = "hello";
        String B = "ohell";
        System.out.println(solution(A,B));
    }

    public static int solution(String A, String B) {
        int answer = (B+B).indexOf(A);
        return answer;
    }
}
