class Solution {
    public int maxNumberOfBalloons(String text) {
        int a=0,b=0,d=0,e=0,f=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b')
            a++;
            if(c=='a')
            b++;
            if(c=='l')
            d++;
            if(c=='o')
            e++;
            if(c=='n')
            f++;
        }
        return Math.min(b,Math.min(a,Math.min(d/2,Math.min(e/2,f))));
    }
}