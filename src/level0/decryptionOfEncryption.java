package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-26
 * @title : 암호 해독
 * */

public class decryptionOfEncryption {
    public static void main(String[] args){
        String cipher = "pfqallllabwaoclk";
        int code = 2;
        System.out.println(solution(cipher,code));
    }

    public static String solution(String cipher, int code){

        String answer = "";

        String[] str = cipher.split("");
        for( int i = 0; i<str.length; i++){
            if((i+1) % code == 0){
                answer += str[i];
            }
        }
        return answer;
    }
}
