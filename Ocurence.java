import java.util.Scanner;
import java.util.Arrays;

class Ocurrence{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s = new String();
        System.out.print("Enter a string: ");
        s = input.nextLine();

        char array[] = s.toCharArray();
        Arrays.sort(array);

        int occurrences=1, i, j, flag=0;
        int n = array.length;

        for(j=0; j<n; ){

            occurrences=1;

            for(i=j+1; i<n; i++){

                if(array[i]==array[j]) {
                    occurrences += 1;
                    flag = 1;
                }
                else {
                    System.out.println(array[i - 1] + " = " + occurrences);
                    flag = 0;
                    break;
                }
            }
            j=i;
            if(flag==1)
                System.out.println(array[i - 1] + " = " + occurrences);
            if(i==array.length && flag==0)
                System.out.println(array[i-1] + " = " + occurrences);
        }

    }
}
