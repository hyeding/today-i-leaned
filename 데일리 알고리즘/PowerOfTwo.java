package Test;

public class PowerOfTwo {
    public boolean powerOfTwo(long num) {
        // TODO:
        /*
        수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다.

        입력
        인자 1 : num
        long 타입의 정수 (num >= 1)

        출력
        boolean 타입을 리턴해야 합니다.

        주의 사항
        반복문(while)문을 사용해야 합니다.
        2의 0승은 1입니다.
        Math.log 사용은 금지됩니다.
         */
        //2의 0승은 1
        if(num == 1) {
            return true;
        }
        //2의 거듭제곱이 아닌 경우 false
        if(num % 2 != 0) {
            return false;
        }
        //2의 거듭제곱에 대해 새로운 데이터 타입 선언
        long factor = 2;
        //while문 사용
        while(factor < num) {
            factor = factor * 2; //2의 거듭제곱이라 지수변수명 factor에 2씩 곱함
        } return factor == num; // factor가 num과 같을때 정지

    }
}
