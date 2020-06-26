import java.util.Scanner;
import java.util.Arrays;

class CountingOccurence
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n;
        int occurrences=1, i, j, flag=0;
        System.out.print("Enter number of inputs: ");
        n = input.nextInt();
        int array[] = new int[n];
        System.out.print("Enter values between 1-100: ");

        for(i=0; i<n; i++){
            array[i] = input.nextInt();
        }
       
        Arrays.sort(array);

        for(j=0; j<n; ){

            occurrences=1;

            for(i=j+1; i<n; i++){

                if(array[i]==array[j]) {
                    occurrences += 1;
                    flag = 1;
                }
                else {
                    System.out.println(array[i - 1] + " -> " + occurrences);
                    flag = 0;
                    break;
                }
            }
        

            j=i;
            if(flag==1)
                System.out.println(array[i - 1] + " -> " + occurrences);
            if(i==array.length && flag==0)
                System.out.println(array[i-1] + " -> " + occurrences);
        }

    }

}
