/**********************************************************************
  *                  Project --  Answer Generator                     *
  *                                                                   *
  * PROGRAMMER: (Stephen Bridgett)                                    *
  *                                                                   *
  * DESCRIPTION:                                                      *
  * The following is an answer generator that gives users answers     *
  * based on numbers that they submit into the program.               *
  * The following topics have been implemented.                       *
  *    1.         The Order of United States Presidents               *
  *    2.            Numbers Worn by Famous Athletes                  *
  *    3.            Math Help - Numbers Squared                      *
  * CREDITS:                                                          *
  * This program is copyright (c) (Stephen Bridgett).                 *
  * Based on a template written by Tom Jensen and Dean Zeller.        *
  ********************************************************************/ 
import java.util.Scanner;

public class AnswerGenerator{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Scanner object for user input
        boolean continueProgram = true;
        
        // Display welcome screen
        displayWelcomeScreen();
        
        while (continueProgram) {
            System.out.println("Choose a topic (1-3) or enter 0 to exit:");
            int choice = getValidInteger(kb, 0, 3);
            
            switch (choice) {
                case 1:
                    topicPresidents(kb);
                    break;
                case 2:
                    topicAthletes(kb);
                    break;
                case 3:
                    topicMath(kb);
                    break;
                case 0:
                    System.out.println("\nThanks for using Stephen's Answer Generator! Goodbye!\n");
                    continueProgram = false;
                    break;
            }
        }
        kb.close();
    }

    // Displays the welcome message and options
    private static void displayWelcomeScreen() {
        System.out.println("\n---------------------------Stephen Bridgett---------------------------");
        System.out.println("Welcome to Stephen's Answer Generator!");
        System.out.println("You have the opportunity to learn more about the topics listed below.");
        System.out.println("\nTopics:");
        System.out.println("1. Order of United States Presidents");
        System.out.println("2. Numbers Worn by Famous Athletes");
        System.out.println("3. Math Help - Numbers Squared");
        System.out.println("----------------------------------------------------------------------\n");
    }

    // Handles the "Order of Presidents" topic
    private static void topicPresidents(Scanner kb) {
        String[] presidents = {
            "George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe",
            "John Quincy Adams", "Andrew Jackson", "Martin Van Buren", "William Henry Harrison", "John Tyler",
            "James K. Polk", "Zachary Taylor", "Millard Fillmore", "Franklin Pierce", "James Buchanan",
            "Abraham Lincoln", "Andrew Johnson", "Ulysses S. Grant", "Rutherford B. Hayes", "James A. Garfield",
            "Chester Arthur", "Grover Cleveland", "Benjamin Harrison", "Grover Cleveland", "William McKinley",
            "Theodore Roosevelt", "William Howard Taft", "Woodrow Wilson", "Warren G. Harding", "Calvin Coolidge",
            "Herbert Hoover", "Franklin D. Roosevelt", "Harry S. Truman", "Dwight D. Eisenhower", "John F. Kennedy",
            "Lyndon B. Johnson", "Richard Nixon", "Gerald Ford", "Jimmy Carter", "Ronald Reagan", "George Bush",
            "Bill Clinton", "George W. Bush", "Barack Obama", "Donald Trump", "Joe Biden", "Donald Trump"
        };
        handleTopic(kb, "Order of Presidents", presidents, 1, 47);
    }

    // Handles the "Famous Athletes" topic
    private static void topicAthletes(Scanner kb) {
        String[] athletes = {
            "Warren Moon", "Derek Jeter", "Allen Iverson", "Brett Favre", "Joe DiMaggio",
            "Bill Russell", "John Elway", "Steve Young", "Mia Hamm", "Emmanuel Sanders",
            "Yao Ming", "Tom Brady", "Dan Marino", "Oscar Robertson", "Bart Starr",
            "Joe Montana", "Doug Williams", "Peyton Manning", "Joe Sakic", "Barry Sanders",
            "Tim Duncan", "Doug Flutie", "Michael Jordan", "Kobe Bryant", "Barry Bonds",
            "Clinton Portis", "Trevor Story", "Marshall Faulk", "Eric Dickerson", "Stephen Curry",
            "Reggie Miller", "Magic Johnson", "Larry Bird", "Shaquille O'Neal", "Kevin Durant",
            "Jerome Bettis", "Lester Hayes", "Curt Schilling", "Larry Csonka", "Gale Sayers",
            "Dirk Nowitzki", "Jackie Robinson", "Troy Polamalu", "John Riggins", "Pedro Martinez"
        };
        handleTopic(kb, "Famous Athletes", athletes, 1, 45);
    }

    // Handles the "Numbers Squared" topic
    private static void topicMath(Scanner kb) {
        String[] squares = new String[45];
        for (int i = 1; i <= 45; i++) {
            squares[i - 1] = String.valueOf(i * i);
        }
        handleTopic(kb, "Numbers Squared", squares, 1, 45);
    }

    // Generic method to handle topics
    private static void handleTopic(Scanner kb, String topicName, String[] data, int min, int max) {
        boolean run = true;
        System.out.println("\nTopic: " + topicName);
        while (run) {
            System.out.println("\nEnter a number between " + min + " and " + max + " to see the result:");
            int input = getValidInteger(kb, min, max);
            System.out.println("\nResult: " + data[input - 1]);
            run = askToRepeat(kb);
        }
    }

    // Gets valid integer input within a given range
    private static int getValidInteger(Scanner kb, int min, int max) {
        int input;
        while (true) {
            if (kb.hasNextInt()) {
                input = kb.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            } else {
                kb.next(); // Clear invalid input
            }
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ":");
        }
    }

    // Asks the user if they want to run the topic again
    private static boolean askToRepeat(Scanner kb) {
        System.out.println("\nRun again? (y = yes, n = next topic)");
        while (true) {
            String input = kb.next().toLowerCase();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                System.out.println("\nThanks for trying! Back to Topic Selection.\n");
                System.out.println("----------------------------------------------------------------------\n");
                return false;
            } else {
                System.out.println("\nInvalid input. Enter 'y' for yes or 'n' for no.");
            }
        }
    }
}
