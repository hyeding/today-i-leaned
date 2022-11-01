import java.util.*;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split(""); //n을 String 타입으로 형변환하고 split으로 문자구분
        Arrays.sort(list); //list 배열을 오름차순으로 정렬

        StringBuilder sb = new StringBuilder(); //가변성을 가지는 StringBuilder 클래스 사용하여 객체 생성
        for(String aList : list) sb.append(aList); //StringBuilder의 API로 .append 사용하여 문자열 변경

        return Long.parseLong(sb.reverse().toString()); //reverse로 오름차순 문자열을 뒤집어줌.
        // .parseLong을 이용하여 문자열을 숫자 Long으로 변환
    }
}
