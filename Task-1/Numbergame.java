import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
class Numbergame
{
   public static void main(String[] args)
   {
      String ans,res;
      int totalrounds=1;
      int wins=0,i;
      Scanner sc=new Scanner(System.in);  
      do
      {
        int num=ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("**GAME STARTED**\nYou have 5 attempts Guess the Number!");
        for(i=1;i<=5;i++)
        {
            System.out.println("\nEnter your guessed number:");
            int guess=sc.nextInt();
            sc.nextLine();
            if(num==guess)
            {
                System.out.println("CORRECT\n");
                System.out.println("You found the correct answer in attempt number-"+i);
                wins++;
                break;
            }
            else if(guess>num)
            {
               System.out.println("TOO HIGH");
            }
            else if(guess<num)
            {
               System.out.println("TOO LOW");
            }
            else{
            System.out.println("Invalid");
        }}
        if(i==6){
         System.out.println("\nYou failed all attempts the Correct number was:"+num);
        }
       System.out.println("\nPress y for continuing next round or n for end:");
       ans=sc.nextLine();
       res="y";
       if(ans.equalsIgnoreCase(res))
       {
            totalrounds++;
       }
       else
       {
         System.out.println("Your score is: "+wins+" out of "+totalrounds);
       }
     }while(ans.equalsIgnoreCase(res));
     sc.close();
  }
}   
       
