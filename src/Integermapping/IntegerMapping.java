package Integermapping;

import java.util.HashMap;
import java.util.Map;

public class IntegerMapping {
    public static void main(String[] args) {

    }

    public static String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) != '#')
            {
                res.append(resultGen(s.substring(i,i+1)));
            }
            else
            {
                res.append(resultGen(s.substring(i-2,i)));
                i-=2;
            }
        }
        return res.reverse().toString();
    }

    public static char resultGen(String str)
    {
        int res = Integer.parseInt(str);
        return (char)(res+96);
    }
}
