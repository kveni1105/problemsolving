class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generate(result,"",0,0,n);
        return result;
    }
    public static void generate(List<String>result, String s,int op, int cl,int n)
    {
        if(s.length()==2*n)
        {
            result.add(s);
            return;
        }
        if(op<n)
        {
            generate(result,s+"(",op+1,cl,n);
        }
        if(cl<op)
        {
            generate(result,s+")",op,cl+1,n);
        }
    }
}