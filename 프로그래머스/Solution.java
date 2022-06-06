import java.util.*;

class Solution {
    public String solution(int num) {
        if(num % 2 == 0){ //num을 2로 나눴을때 나머지가 0 >>짝수
            return "Even"; // Even 리턴
        } else{  //그렇지 않으면>>홀수
            return "Odd"; //Odd 리턴
        }
        }
}