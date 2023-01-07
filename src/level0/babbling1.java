package level0;

public class babbling1 {

    public static void main(String[] args) {
        String[] list =  {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(list));

    }
    public static int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    }

}