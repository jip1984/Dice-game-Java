import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Please enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than, SHUTTING THE GAME DOWN!!!");
            System.exit(0);
        }

        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be higher than six, SHUTTING THE GAME DOWN!!!");
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Dice sum = " + sumOfDiceRolls);
        System.out.println("Number sum = " + sumOfNumbers); 

        checkWin(sumOfDiceRolls, sumOfNumbers);

        scan.close();
        
        
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6 ;
        randomNumber += 1;
        return (int)randomNumber;
    }

    public static void checkWin(int sumOfDiceRolls, int sumOfNumbers){
        if (sumOfNumbers > sumOfDiceRolls && sumOfNumbers < sumOfDiceRolls - 3){
            
        System.out.println("Congratulations you have won!!!!!");

        } else {
            System.out.println("Sorry you lose!!!!!");
        }

    } 
       
  
}


