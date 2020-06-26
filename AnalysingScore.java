import java.util.Scanner;

class AnalysingScore{

    public static void main(String args[]){

           Scanner input = new Scanner(System.in);
           int scores[] = new int[10]; 
           int i, inputsize=0, average, sum=0;
     
           System.out.println("Enter marks(enter -1 to indicate end of input):   "); 
           for(i=0; i<10; i++){
    
                scores[i] = input.nextInt();
                if(scores[i]==-1)
                    break;
                inputsize++;

           }

           for(i=0; i<inputsize; i++)
                 sum += scores[i];

          average = sum/inputsize;
          System.out.println("Average marks: " + average);

          for(i=0; i<inputsize; i++){
                  
                   if(scores[i] > average)
                         System.out.println(scores[i] + " is above average.");
                   if(scores[i]==average)
                         System.out.println(scores[i] + " equal to average.");
                   if(scores[i] < average)
                         System.out.println(scores[i] + " is below average.");
          }

    }

}
