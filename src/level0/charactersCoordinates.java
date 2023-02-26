package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-26
 * @title : 캐릭터의 좌표
 * */

import java.util.Arrays;

public class charactersCoordinates {

    public static void main(String[] args){
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(Arrays.toString(solution(keyinput,board)));
    }

    public static int[] solution(String[] keyinput, int[] board){
        int[] now = {0, 0};
        for (int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")) now[0] -= now[0]>-(board[0]/2)?1:0;
            else if(keyinput[i].equals("right")) now[0] += now[0]<(board[0]/2)?1:0;
            else if(keyinput[i].equals("down")) now[1] -= now[1]>-(board[1]/2)?1:0;
            else if(keyinput[i].equals("up")) now[1] += now[1]<(board[1]/2)?1:0;
        }
        return now;
    }
}
