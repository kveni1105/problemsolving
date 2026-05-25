import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder str=new StringBuilder();
        for(int digit:num)
        {
            str.append(digit);
        }
        BigInteger n=new BigInteger(str.toString());
        BigInteger sum=n.add(BigInteger.valueOf(k));
        List<Integer>result=new ArrayList<>();
        for(char c :sum.toString().toCharArray())
        {
           result.add(c - '0');
        }
        return result;
    }
}