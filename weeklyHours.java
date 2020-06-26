import java.util.Scanner;

class weeklyHours{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter number of employees: ");
        n = input.nextInt();

        int hours[][] = new int[n][7];       //rows for employees, columns for week days
        int i, j;
        int totalHours[] = new int[n];

        System.out.println("Enter hours per day.");

        for(i=0; i<n; i++){

            System.out.print("Employee " + (i+1) + ": ");

            for(j=0; j<7; j++){

                hours[i][j] = input.nextInt();
              }
        }


        for(i=0; i<n; i++){

            for(j=0; j<7; j++){

                totalHours[i] = totalHours[i] + hours[i][j];

            }
        }

        //Sorting totalHours in descending order

        for(i=0; i<n; i++){
            for(j=0; j<n-i-1; j++){
                if(totalHours[j+1]>totalHours[j]){
                    int temp = totalHours[j];
                    totalHours[j] = totalHours[j+1];
                    totalHours[j+1] = temp;
                }
            }
        }

        System.out.println("Decreasing order of total working hours:");
        for(i=0; i<n; i++)
            System.out.println(totalHours[i]);
        
    }
}
