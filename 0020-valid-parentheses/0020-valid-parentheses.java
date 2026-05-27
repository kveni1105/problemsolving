class Solution {
    public boolean isValid(String s) {
        char ch[]=s.toCharArray();
        Stack<Character>stk=new Stack<>();
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
            {
                stk.push(ch[i]);
            }
            else
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                char top=stk.pop();
                if((ch[i]==')'&&top!='(')||(ch[i]=='}'&&top!='{')||(ch[i]==']'&&top!='['))
                {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}