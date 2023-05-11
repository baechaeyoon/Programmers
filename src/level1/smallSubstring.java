package level1;

/*
 * @author : baechaeyoon
 * @date : 2023-05-11
 * @title : 크기가 작은 부분 문자열
 * */

public class smallSubstring {

    public static void main(String[] args){
        String t = "10203";
        String p = "15";
        System.out.println(solution(t,p));
    }
    public static int solution(String t, String p){
        int cnt = t.length() - p.length() +1;
        String[] tgtArr = new String[cnt];
        int passCnt = 0;

        for(int i =0; i<cnt; i++){
            tgtArr[i] = t.substring(i,p.length()+i);
            if(Long.parseLong(tgtArr[i]) <= Long.parseLong(p)){
                passCnt++;
            }

        }

        return passCnt;
    }
}

