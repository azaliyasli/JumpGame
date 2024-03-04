import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index except for 0 and between 1-7: ");

        int array[] = {7,8,12,5,18,3,19,2};
        int n; 
        
        n = input.nextInt();

        if(array[n]>array[0]) {
            System.out.printf("You win!");
        }
        else {
            System.out.printf("Game over!");
    }
  }
}
    

