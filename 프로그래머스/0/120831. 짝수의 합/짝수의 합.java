class Solution {
    public int solution(int n) {
        int answer = 0;
        //짝수들의 합을 저장할 변수를 0으로 초기화
        
        for (int i = 2; i<=n; i+=2) answer +=i;
        //i를 2부터 시작해서 2씩 증가시킴
        //짝수만 돌게 되니 짝수를 답에 더함
        
        return answer;
    }
}