public class Vowel
{
    public static void main(String[] st)
    {
        String word=st[0];
        int vow=0,cons=0;
        //char t[]=new char[10];
        String[] t = {"a","e","i","o","u","A","E","I","O","U"};
        for(int i=0;i<word.length();i++)
        {
            for(int j=0;j<10;j++)
            {
                if (word.charAt(i)==t[j].charAt(0))
                    vow++;
            }
        }
        cons=word.length()-vow;
        System.out.println("No. of Vowels: "+vow+"\nNo. of Constants: "+cons);
    }
}