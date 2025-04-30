class Solution {
    public int solution(int num1, int num2) {
        if(num1 < -50000 || num1 > 50000 || num2 < -50000 || num2 > 50000){
            throw new IllegalArgumentException("입력하는 숫자의 값은 -50000이상이면서 50000이하여야 합니다.");
        }
        return num1 + num2;
    }
}