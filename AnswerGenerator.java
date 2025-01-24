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

  public class AnswerGenerator {
    public static void main(String[] args) 
      {
        // Set up scanner and random number generator
        Scanner kb = new Scanner(System.in);
  
        
        // define variables necessary for each question
        boolean run = true;
        boolean go = true;
        
        // Homescreen
        System.out.println();
        System.out.println("---------------------------Stephen Bridgett---------------------------");
        System.out.println();      
        System.out.println("                 Welcome to Stephen's Answer Generator!");
        System.out.println();
        System.out.println("You have the opportunity to learn more about the topics listed below.");
        System.out.println();
        System.out.println("Topics:");
        System.out.println();
        System.out.println("1. Order of United State's Presidents");
        System.out.println("2. Numbers Worn by Famous Athletes");
        System.out.println("3. Math Help - Numbers Squared");
        System.out.println("----------------------------------------------------------------------");
        
  
        // Topic 1:  Search a number for a President
        String pres[] = {"George Washington","John Adams","Thomas Jefferson", "James Madison", "James Monroe", "John Quincy Adams", "Andrew Jackson", "Martin Van Buren", 
                          "William Henry Harrison", "John Tyler", "James K. Polk", "Zachary Taylor", "Millard Fillmore", "Franklin Pierce", "James Buchanan",
                          "Abraham Lincoln", "Andrew Johnson", "Ulysses S. Grant", "Rutherford B. Hayes", "James A. Garfield", "Chester Arthur", "Grover Cleveland",
                          "Benjamin Harrison", "Grover Cleveland", "William McKinley", "Theodore Roosevelt", "William Howard Taft", "Woodrow Wilson", "Warren G. Harding",
                          "Calvin Coolidge", "Herbert Hoover", "Franlin D. Roosevelt", "Harry S. Truman", "Dwight D. Eisenhower", "John F. Kennedy", "Lyndon B. Johnson ",
                          "Richard Nixon", "Gerald Ford", "Jimmy Carter", "Ronald Reagan", "George Bush", "Bill Clinton", "George W. Bush", "Barack Obama", "Donald Trump",
                          "Joe Biden", "Donald Trump"};      
        System.out.println("Topic 1: Order of Presidents");
        System.out.println();
        while(go==true)
        {
        while(run){
        System.out.println("There have been 47 presidents in the history of the United States. ");
        System.out.println();  
        System.out.println(" Enter a number between one and forty-seven to see which President served in that position in the order");
        System.out.print("   Number 1-47: ");
        double answer = kb.nextDouble();
        if(answer<48&&answer>0){
          System.out.println();
          System.out.println(pres[(int) answer -1]);
          run=false;
        }
        else
        {
          System.err.println("Invalid");
        }
       } 
        
        if (run==false)
        
        System.out.println();    
        System.out.println("Run again?(y=yes n=next topic) ");
            char again = kb.next().charAt(0);
            if (again == 'y')
            {
              run=true;
            }
            else if (again == 'n')
            {
              System.out.println();
              System.out.println("Thanks for Trying!  Next Topic:");
              System.out.println("----------------------------------------------------------------------");
              System.out.println();
              go = false;
            }
            else
            {
              System.out.println();
              System.err.println("Invalid");
            }
        }
        // Topic 2:  Numbers Worn by Famous Athletes
        String ath[] = {"Warren Moon","Derek Jeter", "Allen Iverson", "Brett Favre", "Joe DiMaggio", "Bill Russel", "John Elway", 
                          "Steve Young", "Mia Hamm", "Emmanuel Sanders", "Yao Ming", "Tom Brady", "Dan Marino", "Oscar Robertson", "Bart Starr",
                          "Joe Montana", "Doug Williams", "Peyton Manning", "Joe Sakic", "Barry Sanders", "Tim Duncan", "Doug Flutie",
                          "Michael Jordan", "Kobe Bryant", "Barry Bonds", "Clinton Portis", "Trevor Story", "Marshall Faulk", "Eric Dickerson",
                          "Stephen Curry", "Reggie Miller", "Magic Johnson", "Larry Bird", "Shaquille O'Neal", "Kevin Durant", "Jerome Bettis",
                          "Lester Hayes", "Curt Schilling", "Larry Csonka", "Gale Sayers", "Dirk Nowitzki", "Jackie Robinson", "Troy Polamalu", "John Riggins", "Pedro Martinez"};      
        
        System.out.println("Topic 2: Famous Athletes");
        go=true;
        run=true;      
        while(go==true)
        {
        while(run){
        System.out.println();
        System.out.println("Many great athletes have come and gone throughout the years. See if your favorite is included in this list! ");
        System.out.println();  
        System.out.println(" Enter a number between one and forty-five to see which professional athlete wore that number");
        System.out.print("   Number 1-45: ");
        double answer = kb.nextDouble();
        if(answer<46&&answer>0){
          System.out.println();
          System.out.println(ath[(int) answer -1]);
          run=false;
        }
        else
        {
          System.out.println();
          System.err.println("Invalid");
        }
       } 
        
        if (run==false)
        
            System.out.println();
            System.out.println("Run again?(y=yes n=next topic) ");
            char again = kb.next().charAt(0);
            if (again == 'y')
            {
              run=true;
            }
            else if (again == 'n')
            {
              System.out.println();
              System.out.println("Thanks for Trying!  Next Topic:");
              System.out.println("----------------------------------------------------------------------");
              System.out.println();
              go = false;
            }
            else
            {
              System.out.println();
              System.err.println("Invalid");
            }
        }
        // Topic 3:  Numbers Squared
        String math[] = {"1", "4", "9", "16", "25", "36", "49", 
                          "64", "81", "100", "121", "144", "169", "196", "225",
                          "256", "289", "324", "361", "400", "441", "484",
                          "529", "576", "625", "676", "729", "784", "841",
                          "900", "961", "1024", "1089", "1156", "1225", "1296",
                          "1369", "1444", "1521", "1600", "1681", "1764", "1849", "1936", "2025"};
        System.out.println("Topic 3: Numbers Squared");
        go=true;
        run=true;      
        while(go==true)
        {
        while(run){
        System.out.println();
        System.out.println("Just in case you're stuck on your third grade homework! ");
        System.out.println();  
        System.out.println(" Enter a number between one and forty-five to see what that number's value is when squared");
        System.out.print("   Number 1-45: ");
        double answer = kb.nextDouble();
        if(answer<46&&answer>0){
          System.out.println();
          System.out.println(math[(int) answer -1]);
          run=false;
        }
        else
        {
          System.out.println();
          System.err.println("Invalid");
        }
       } 
        
        if (run==false)
        
            System.out.println();
            System.out.println("Run again?(y=yes n=no(ends program)) ");
            char again = kb.next().charAt(0);
            if (again == 'y')
            {
              run=true;
            }
            else if (again == 'n')
            {
              System.out.println("----------------------------------------------------------------------");
              System.out.println();
              System.out.println();
              System.out.println("Thanks for Trying Stephen's Answer Generator! ");
              System.out.println();
              System.out.println("Goodbye! ");
              System.out.println();
              go = false;
            }
            else
            {
              System.out.println();
              System.err.println("Invalid Answer");
            }
        }      
      }
        
    }
  