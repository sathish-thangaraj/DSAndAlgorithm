//https://www.youtube.com/watch?v=qq64FrA2UXQ
//https://leetcode.com/explore/interview/card/top-interview-questions-medium/114/others/822/discuss/302793/Java-two-lines-beats-100
public int getSum(int a, int b) {
     if(b == 0) return a;
     return getSum(a ^ b, (a & b) << 1);
}
