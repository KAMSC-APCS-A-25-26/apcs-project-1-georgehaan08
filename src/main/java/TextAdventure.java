import java.util.Scanner;
import java.text.DecimalFormat;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int difficulty, choice, year=0;
        double cash=0, debt=0, stockValue=0, rate=0, amount=0;
        boolean marketStatus, playing;
        Object[][] trades = new Object[5][2];

        System.out.println("\n /$$      /$$                     /$$                   /$$           /$$      /$$                     /$$                    \n" +
                "| $$$    /$$$                    | $$                  | $$          | $$$    /$$$                    |__/                    \n" +
                "| $$$$  /$$$$  /$$$$$$   /$$$$$$ | $$   /$$  /$$$$$$  /$$$$$$        | $$$$  /$$$$  /$$$$$$  /$$$$$$$  /$$  /$$$$$$   /$$$$$$$\n" +
                "| $$ $$/$$ $$ |____  $$ /$$__  $$| $$  /$$/ /$$__  $$|_  $$_/        | $$ $$/$$ $$ |____  $$| $$__  $$| $$ |____  $$ /$$_____/\n" +
                "| $$  $$$| $$  /$$$$$$$| $$  \\__/| $$$$$$/ | $$$$$$$$  | $$          | $$  $$$| $$  /$$$$$$$| $$  \\ $$| $$  /$$$$$$$| $$      \n" +
                "| $$\\  $ | $$ /$$__  $$| $$      | $$_  $$ | $$_____/  | $$ /$$      | $$\\  $ | $$ /$$__  $$| $$  | $$| $$ /$$__  $$| $$      \n" +
                "| $$ \\/  | $$|  $$$$$$$| $$      | $$ \\  $$|  $$$$$$$  |  $$$$/      | $$ \\/  | $$|  $$$$$$$| $$  | $$| $$|  $$$$$$$|  $$$$$$$\n" +
                "|__/     |__/ \\_______/|__/      |__/  \\__/ \\_______/   \\___/        |__/     |__/ \\_______/|__/  |__/|__/ \\_______/ \\_______/");

        System.out.println("\nPress 1 to play or 0 to quit: ");
        choice = sc.nextInt();
        playing = choice == 1;
        if(playing)
        {
            while(playing)
            {
                System.out.println("\nWelcome to Market Maniac!\nIn this game you'll explore the life of an aspiring trader who needs to flip some money around to pay the bills.\nEvery choice you make alters your storyline.\nGood Luck!");
                System.out.println("\nSelect your difficulty:\n1) Easy\n2) Medium\n3) Hard");
                difficulty = sc.nextInt();

                switch(difficulty)
                {
                    case(1):
                    {
                        System.out.println("\nEasy Mode!");
                        break;
                    }
                    case(2):
                    {
                        System.out.println("\nMedium Mode!");
                        break;
                    }
                    case(3):
                    {
                        System.out.println("\nHard Mode!");
                        break;
                    }
                }

                System.out.println("First things first lets get you some money.\nChoose on of the 3 loan options from below:");
                System.out.println("\n1) $25,000 with "+(difficulty*3)+"% interest\n"+"2) $50,000 with "+(difficulty*5)+"% interest\n"+"3) $100,000 with "+(difficulty*10)+"% interest");

                switch(sc.nextInt())
                {
                    case(1):
                    {
                        cash = 25000;
                        debt = 25000;
                        rate = difficulty*0.03+1;
                        break;
                    }
                    case(2):
                    {
                        cash = 50000;
                        debt = 50000;
                        rate = difficulty*0.05+1;
                        break;
                    }
                    case(3):
                    {
                        cash = 100000;
                        debt = 100000;
                        rate = difficulty*0.10+1;
                        break;
                    }
                }
                System.out.println("\nGreat choice!\nNow you can see your stats\nThese will be displayed every time a year passes in the game\n");
                System.out.println("Year: " + year);
                System.out.println("Net Worth: " + df.format((cash+stockValue)) + "$");
                System.out.println("Cash Available : " + df.format(cash) + "$");
                System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                System.out.println("Amount Owed to Bank: " + df.format((debt)) + "$");
                //System.out.println("Amount Owed to Bank: " + df.format((debt*rate*year)) + "$");

                System.out.println("\nNow that you've decided to start trading you have an important decision to make.\nShould you leave your girlfriend to focus specifically on trading?\nEnter 1 to leave her, 0 to stay:");
                if(sc.nextInt()==1)
                {
                    System.out.println("\nGreat Choice!\nShe was never that pretty anyway\nAnd a real pain to always listen too...\nYou have all day to look at stocks\nTake a look at this chart\n");
                    System.out.println("PolyTrack Inc\n" +
                            "│\n" +
                            "│         /\\       \n" +
                            "│        /  \\      /\\       \n" +
                            "│   /\\  /    \\    /  \\     /\\   \n" +
                            "│  /  \\/      \\  /    \\   /  \\  \n" +
                            "│_/             \\/      \\_/    \\____\n" +
                            "│\n" +
                            "└────────────────────────────────────\n" +
                            "   9AM     11AM     1PM     3PM   5PM");
                    System.out.println("\nQUICK!\nThe market is going to close at 4PM\nYou only have 5 minutes to place a trade!\n\nWould you like to\n1) Buy the stock\n2) Short the stock\n3) Not do anything");
                    switch(sc.nextInt())
                    {
                        case (1):
                        {
                            System.out.println("How much would you like to buy?: ");
                            amount = sc.nextInt();
                            stockValue += amount;
                            cash -= amount;
                            trades[0][0] = 1;
                            trades[0][1] = amount;
                            break;
                        }
                        case (2):
                        {
                            System.out.println("How much would you like to short?: ");
                            amount = sc.nextInt();
                            stockValue += amount;
                            cash -= amount;
                            trades[0][0] = 2;
                            trades[0][1] = amount;
                            break;
                        }
                        case (3):
                        {
                            System.out.println("Your boring\n");
                            break;
                        }
                    }
                    System.out.println("Take a look at what the stock did the next day!\n");
                    System.out.println("PolyTrack Inc\n" +
                            "│\\\n" +
                            "│ \\___\n" +
                            "│     \\\n" +
                            "│      \\\n" +
                            "│       \\___\n" +
                            "│            \\\n" +
                            "│              \\__________________\n" +
                            "└────────────────────────────────────\n" +
                            "   9AM     11AM     1PM     3PM   5PM");
                    System.out.println("\nHOLY COW THEY WENT BANKRUPT!\nDROPPING 100%!");
                    System.out.println("A news report states that Mr. Afsal banned it in class");
                    System.out.println("That's probably why\nAnyways here is your account info\n");

                    if((int)trades[0][0] == 1)
                    {
                        stockValue -= ((double)trades[0][1]);
                    }
                    else if((int)trades[0][0] == 2)
                    {
                        stockValue += ((double)trades[0][1]);
                    }

                    System.out.println("Year: " + year++);
                    System.out.println("Net Worth: " + df.format((cash+stockValue)) + "$");
                    System.out.println("Cash Available : " + df.format(cash) + "$");
                    System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                    System.out.println("Amount Owed to Bank: " + df.format((debt*rate*year)) + "$");


                }
                else
                {
                    System.out.println("\nYour a good person\nNever put money over relationships\nYou only have 3 hours daily to trade because of her\nTake a look at this stock chart\n");
                    System.out.println("");
                }



                playing = false;
            }
        }
        else
        {
            System.out.println("Goodbye!");
        }
    }
}
