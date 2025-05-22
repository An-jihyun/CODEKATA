import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
        //배열을 스트림으로 바꾸고 숫자를 전부 더해 평균을 구함
    }
}