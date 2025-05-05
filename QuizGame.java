import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Mini - Quiz
        Scanner quest = new
                Scanner(System.in);

        int Points = 0;

        System.out.println("Quiz Game!");
        System.out.println("You Ready: Y/N ");
        char Answer = quest.next().charAt(0);

        if (Answer == 'Y' || Answer == 'y') {
            System.out.println();
            System.out.println("Let's start! Just choose the correct options.");
        } else if (Answer == 'N' || Answer == 'n') {
            System.out.println("Okay, see you later...");
        return;}

        //Q1
        System.out.println("1. what is the color of the sea");
        System.out.println("a. green");
        System.out.println("b. red");
        System.out.println("c. blue");
        System.out.println("d. white");

        quest.nextLine();

        char question1 =
                quest.next().charAt(0);

        if(question1 == 'c' || question1 == 'C') {
            System.out.println("You're correct! You get 10 points.");
            Points++;
        } else {
            System.out.println("You get 0 Point");
        }

        //Q2
        System.out.println("2. Whats the color of the sun");
        System.out.println("a. blue");
        System.out.println("b. yellow");
        System.out.println("c. white");
        System.out.println("d. red");

        char question2 =
                quest.next().charAt(0);

        if (question2 == 'b' || question2 == 'B') {
            System.out.println("You're correct! You get 10 points.");
            Points++;
        } else {
            System.out.println("You get 0 Point");
        }

        //Q3
        System.out.println("3. Are vegetables healthy?");
        System.out.println("a. Yes");
        System.out.println("b. No");

        char question3 =
                quest.next().charAt(0);

        if(question3 == 'a' || question3 == 'A') {
            System.out.println("You're correct! You get 10 points.");
            Points++;
        } else {
            System.out.println("You get 0 Point.");
        }


        //Q4
        System.out.println("4. Full meaning of SAAS");
        System.out.println("a. Secrete Association Apocalyptic Sadists");
        System.out.println("b. Samurai Association of Alan Sails");
        System.out.println("c. Software As A Service");
        System.out.println("d. Source As A Software");

        char question4 =
                quest.next().charAt(0);

        if(question4 == 'c' || question4 == 'C') {
            System.out.println("You're correct! You get 10 points.");
            Points++;
        } else {
            System.out.println("You get 0 Point.");
        }

        //Q5
        System.out.println("5. Is the Earth flat?");
        System.out.println("a. Yes");
        System.out.println("b. No");

        char question5 =
                quest.next().charAt(0);

        if(question5 == 'b' || question5 == 'B') {
            System.out.println("You're correct! You get 10 points.");
            Points++;
        } else {
            System.out.println("You get 0 Point.");
        }
        System.out.println("Total Score: " + Points++ + "/50" + " Points");

        quest.close();
    }
}

