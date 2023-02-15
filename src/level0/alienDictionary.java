package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-15
 * @title : 외계어 사전
 * */

public class alienDictionary {
    public static void main(String[] args){
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell,dic));
    }

    public static int solution(String[] spell, String[] dic){
        int answer = 2;

        for(String dicS : dic){
            boolean isRight = true;
            for(String spellS : spell){
                if(dicS.indexOf(spellS) == -1){
                    isRight = false;
                    break;
                }
            }
            if(isRight){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
