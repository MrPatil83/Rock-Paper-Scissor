import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Paper = 0");
        System.out.println("Rock = 1");
        System.out.println("Scissor = 2");
        System.out.print("Select your no for : ");
        int userInput= sc.nextInt(3);
        Random random= new Random();
        int computerInput= random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Darw "+ "user value= "+userInput + " computer value= "+computerInput);
        }else if(userInput ==0 && computerInput ==1 || userInput == 1 && computerInput == 2|| userInput==2 && computerInput==0){
            System.out.println("You Win!");
        }else{
            System.out.println("Computer win!");
        }
//        System.out.println("Computer value :"+computerInput);

        if(computerInput ==0){
            System.out.println("Computer select Paper");
        } else if (computerInput == 1) {
            System.out.println("Computer select Rock");

        }else{
            System.out.println("Computer select Scissor");
        }

    }
}
