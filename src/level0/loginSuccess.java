package level0;

import java.util.HashMap;
import java.util.Map;

/*
 * @author : baechaeyoon
 * @date : 2023-01-30
 * @title : 로그인 성공?
 * */
public class loginSuccess {

    public static void main(String[] args){
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        System.out.println(solution(id_pw,db));
    }
    public static String solution(String[] id_pw, String[][] db){
        Map<String, String> map = new HashMap<String,String>();

        for(String[] list: db){
            map.put(list[0], list[1]);
        }
        if(map.containsKey(id_pw[0])){
            if(map.get(id_pw[0]).equals(id_pw[1])) return "login";
            else return "wrong pw";
        }
        else return "fail";
    }
}
