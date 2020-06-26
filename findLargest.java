import java.util.Scanner;

class findLargest{

    public static int[] locateLargest(double list[][]){
        int i, j;
        int location[] = new int[2];
        int rows = list.length;
        int columns = list[0].length;

        double largest = list[0][0];

        for(i=0; i<rows; i++){
            for(j=0; j<columns-1; j++){
                if(list[i][j+1] > largest) {
                    largest = list[i][j + 1];
                    location[0] = i;
                    location[1] = j + 1;
                }
            }
        }
        return location;
    }

  public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int rows, columns ;
        int i, j;
        double largest;

        System.out.println("Enter the number of rows and columns: ");
        rows = input.nextInt();
        columns = input.nextInt();

        double array[][] = new double[rows][columns];
        int locArray[] = new int[2];

        System.out.println("Enter the array: ");
        for(i=0; i<rows; i++){
            for(j=0; j<columns; j++){
                array[i][j] = input.nextDouble();
            }
        }

        locArray = locateLargest(array);
        System.out.println("The location of the largest element is (" + locArray[0] + ", " + locArray[1] + ").");
        
    }
}

