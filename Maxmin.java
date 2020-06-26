import java.util.*;
public class Maxmin
{
    public static void main(String[] st)
    {
        int min,max;
        int a[]=new int[st.length];
        for(int i=0;i<st.length;i++)
        {
            a[i]=Integer.parseInt(st[i]);
        }
        min=a[0];
        max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i])
                min=a[i];
            if(max<a[i])
                max=a[i];
        }
        System.out.println("Maximum= "+max+"\nMinimum= "+min);
    }
}