import java.util.Scanner;

class EliminatingDuplicate{

    public static int[] eliminateDuplicates(int numbers[]) {
        int i, j;
        int list[] = new int[numbers.length];

        for(i=0; i<numbers.length; i++) {

            for(j=0; j<numbers.length; j++){
  
                if(i==j){continue;}

                if(numbers[i]==numbers[j])
                    numbers[j] = 0;
            }
        }

        j=0;
        System.out.println("Duplicates Eliminated.");
        for(i=0; i<numbers.length; i++){

            if(numbers[i]!=0){
                list[j] = numbers[i];
                j += 1;
            }

        }
        return list;
    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("Enter input size: ");
        n = input.nextInt();
        int set[] = new int[n];
        int newSet[] = new int[n];

        System.out.print("Enter values: ");

        for(i=0; i<n; i++)
            set[i] = input.nextInt();

        newSet = eliminateDuplicates(set);
        System.out.print("New list: ");
        for(int value: newSet){
	    if(value==0) break;
            System.out.print(value + " ");
        }
	System.out.println();
    }

}
