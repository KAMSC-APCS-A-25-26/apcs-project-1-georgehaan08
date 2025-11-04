import java.util.Scanner;
import java.text.DecimalFormat;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int difficulty, choice, year = 0;
        double cash = 0, debt = 0, stockValue = 0, rate = 0, amount = 0;
        boolean playing;
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
        if (playing) {
            while (playing) {
                System.out.println("\nWelcome to Market Maniac!\nIn this game you'll explore the life of an aspiring trader who needs to flip some money around to pay the bills.\nEvery choice you make alters your storyline.\nGood Luck!");
                System.out.println("\nSelect your difficulty:\n1) Easy\n2) Medium\n3) Hard");
                difficulty = sc.nextInt();

                switch (difficulty) {
                    case (1): {
                        System.out.println("\nEasy Mode!");
                        break;
                    }
                    case (2): {
                        System.out.println("\nMedium Mode!");
                        break;
                    }
                    case (3): {
                        System.out.println("\nHard Mode!");
                        break;
                    }
                }

                System.out.println("First things first lets get you some money.\nChoose on of the 3 loan options from below:");
                System.out.println("\n1) $25,000 with " + (difficulty * 3) + "% interest\n" + "2) $50,000 with " + (difficulty * 5) + "% interest\n" + "3) $100,000 with " + (difficulty * 10) + "% interest");

                switch (sc.nextInt()) {
                    case (1): {
                        cash = 25000;
                        debt = 25000;
                        rate = difficulty * 0.03 + 1;
                        break;
                    }
                    case (2): {
                        cash = 50000;
                        debt = 50000;
                        rate = difficulty * 0.05 + 1;
                        break;
                    }
                    case (3): {
                        cash = 100000;
                        debt = 100000;
                        rate = difficulty * 0.10 + 1;
                        break;
                    }
                }
                System.out.println("\nGreat choice!\nNow you can see your stats\nThese will be displayed every time a year passes in the game\n");
                System.out.println("Year: " + year);
                System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                System.out.println("Cash Available : " + df.format(cash) + "$");
                System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                System.out.println("Amount Owed to Bank: " + df.format((debt)) + "$");

                System.out.println("\nNow that you've decided to start trading you have an important decision to make.\nShould you leave your girlfriend to focus specifically on trading?\nEnter 1 to leave her, 0 to stay:");
                if (sc.nextInt() == 1) {
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
                    System.out.println("\nQUICK!\nThe market is going to close at 4PM\nYou only have 5 minutes to place a trade!\n\nWould you like to\n1) Buy the stock\n2) Short the stock");
                    switch (sc.nextInt()) {
                        case (1): {
                            System.out.println("How much would you like to buy?: ");
                            amount = sc.nextInt();
                            stockValue += amount;
                            cash -= amount;
                            trades[0][0] = 1;
                            trades[0][1] = amount;
                            break;
                        }
                        case (2): {
                            System.out.println("How much would you like to short?: ");
                            amount = sc.nextInt();
                            stockValue += amount;
                            cash -= amount;
                            trades[0][0] = 2;
                            trades[0][1] = amount;
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

                    if ((int) trades[0][0] == 1) {
                        stockValue -= ((double) trades[0][1]);
                    } else if ((int) trades[0][0] == 2) {
                        stockValue += ((double) trades[0][1]);
                    }

                    System.out.println("Year: " + year++);
                    System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                    System.out.println("Cash Available : " + df.format(cash) + "$");
                    System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                    System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");

                    System.out.println("\nNow that you've dipped your feet in the market lets take a little trip to meet with some experts\n\n1) Go to Patagonia store\n2) Go to underground crypto club");
                    if (sc.nextInt() == 1) {
                        System.out.println("\nWelcome to Patagonia!\nWho will you approach?\n\n1) Chad\n2) Becket\n3) Lancaster");
                        switch (sc.nextInt()) {
                            case (1): {
                                System.out.println("\nme name chad, what you want?");
                                System.out.println("Select your response:\n\n1) Can I get some advice with stocks? \n2) What patagonia vest should I buy?");
                                if (sc.nextInt() == 1) {
                                    System.out.println("\nuh idk, i ask my dad, he know\nhe say buy Starbucks\nhe is buying all of starbucks company tonight");
                                    System.out.println("Would you like to listen to Chad?\n\n1) Yes\n2) No");
                                    if (sc.nextInt() == 1) {
                                        System.out.println("\nWould you like to\n1) Buy the stock\n2) Short the stock");
                                        switch (sc.nextInt()) {
                                            case (1): {
                                                System.out.println("How much would you like to buy: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 1;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                            case (2): {
                                                System.out.println("How much would you like to short?: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 2;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                        }
                                        if ((int) trades[1][0] == 1)
                                        {
                                            stockValue -= ((double) trades[1][1] * 0.05);
                                        }
                                        else if ((int) trades[1][0] == 2)
                                        {
                                            stockValue += ((double) trades[1][1] * 0.05);
                                        }
                                        System.out.println("The stock went down 5%\nI think chad was lying...\nAnyways let's see your stats:");
                                        System.out.println("Year: " + year++);
                                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                                        System.out.println("Cash Available : " + df.format(cash) + "$");
                                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                                    } else {
                                        System.out.println("I wonder why you didn't take his advice?");
                                    }
                                } else {
                                    System.out.println("buy purple one\ni like");
                                }
                                break;
                            }
                            case (2): {
                                System.out.println("\nHey man, I'm Becket, how can I help you?");
                                System.out.println("Select your response:\n\n1) Can I get some advice with stocks? \n2) What patagonia vest should I buy?");
                                if (sc.nextInt() == 1) {
                                    System.out.println("\nGood question my man!\nQuantum Inc. would be my pick\nThey help make quantum computers for Google!");
                                    System.out.println("Would you like to listen to Becket?\n\n1) Yes\n2) No");
                                    if (sc.nextInt() == 1) {
                                        System.out.println("\nWould you like to\n1) Buy the stock\n2) Short the stock");
                                        switch (sc.nextInt()) {
                                            case (1): {
                                                System.out.println("How much would you like to buy: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 1;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                            case (2): {
                                                System.out.println("How much would you like to short?: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 2;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                        }
                                        if ((int) trades[1][0] == 1)
                                        {
                                            stockValue += ((double) trades[1][1] * 0.25);
                                        }
                                        else if ((int) trades[1][0] == 2)
                                        {
                                            stockValue -= ((double) trades[1][1] * 0.25);
                                        }
                                        System.out.println("The stock went up 25%\nGreat choice!\nLet's see your stats:");
                                        System.out.println("Year: " + year++);
                                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                                        System.out.println("Cash Available : " + df.format(cash) + "$");
                                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                                    }
                                    else
                                    {
                                        System.out.println("hmmmmmm\nI'd say you should get the green and white one\nReminds me of the country club!");
                                    }
                                    break;
                                }
                            }
                            case (3):
                            {
                                System.out.println("\nMy good acquaintance, my name is Lancaster. How may I assist you?");
                                System.out.println("Select your response:\n\n1) Can I get some advice with stocks? \n2) What patagonia vest should I buy?");
                                if (sc.nextInt() == 1)
                                {
                                    System.out.println("\nBrilliant Question my friend!\nI would say NihalCorp BioSciences\nThey are releasing some amazing medicine through their work on ADHD");
                                    System.out.println("Would you like to listen to Chad?\n\n1) Yes\n2) No");
                                    if (sc.nextInt() == 1) {
                                        System.out.println("\nWould you like to\n1) Buy the stock\n2) Short the stock");
                                        switch (sc.nextInt()) {
                                            case (1): {
                                                System.out.println("How much would you like to buy: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 1;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                            case (2): {
                                                System.out.println("How much would you like to short?: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 2;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                        }
                                        if ((int) trades[1][0] == 1)
                                        {
                                            stockValue += ((double) trades[1][1] * 0.35);
                                        }
                                        else if ((int) trades[1][0] == 2)
                                        {
                                            stockValue -= ((double) trades[1][1] * 0.35);
                                        }
                                        System.out.println("The stock went up 35%!\nAnyways let's see your stats:");
                                        System.out.println("Year: " + year++);
                                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                                        System.out.println("Cash Available : " + df.format(cash) + "$");
                                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                                    }
                                }
                                else
                                {
                                    System.out.println("Fantastic question sir!\nI would say the black and white one\nIt's very clean!");
                                }
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("\nWelcome to CRYPTO UNDERGROUND!\nWho will you approach?\n\n1) Dax\n2) Henry\n3) xx_ProTrader69_xx");
                        switch (sc.nextInt()) {
                            case (1): {
                                System.out.println("\nwsg brodie my name is dax");
                                System.out.println("Select your response:\n\n1) Can I get some advice with stocks? \n2) no response, simply attack him");
                                if (sc.nextInt() == 1) {
                                    System.out.println("\nno this is crypto dummy\ninstead buy CatCoin");
                                    System.out.println("Would you like to listen to Dax?\n\n1) Yes\n2) No");
                                    if (sc.nextInt() == 1) {
                                        System.out.println("\nWould you like to\n1) Buy the coin\n2) Short the coin");
                                        switch (sc.nextInt()) {
                                            case (1): {
                                                System.out.println("How much would you like to buy: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 1;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                            case (2): {
                                                System.out.println("How much would you like to short?: ");
                                                amount = sc.nextInt();
                                                stockValue += amount;
                                                cash -= amount;
                                                trades[1][0] = 2;
                                                trades[1][1] = amount;
                                                break;
                                            }
                                        }
                                        if ((int) trades[1][0] == 1)
                                        {
                                            stockValue -= ((double) trades[0][1] * 0.75);
                                        }
                                        else if ((int) trades[1][0] == 2)
                                        {
                                            stockValue += ((double) trades[0][1] * 0.75);
                                        }
                                        System.out.println("The coin went down 75%\nI think you got rug-pulled\nAnyways let's see your stats:");
                                        System.out.println("Year: " + year++);
                                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                                        System.out.println("Cash Available : " + df.format(cash) + "$");
                                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                                    } else {
                                        System.out.println("I wonder why you didn't take his advice?");
                                    }
                                } else {
                                    System.out.println("You punch dax is the face but he dodges it and sleeps you...\nYou wake up tied to a chair in his basement");
                                    System.out.println("Why did you try that\nNow dax slowly kills you\nGAME OVER");
                                    playing = false;
                                    System.exit(0); // Exit with a success status
                                }
                                break;
                            }
                            case (2): {
                                System.out.println("\nHey man, I'm Henry, how can I help you?");
                                System.out.println("Select your response:\n\n1) Can I get some advice with stocks? \n2) Rob his ahh");
                                if (sc.nextInt() == 1)
                                    {
                                        System.out.println("Nah I aint gonna help u\nLeave before I swiss cheese your ahh");
                                        System.out.println("Select your response:\n\n1) Leave \n2) Stay");
                                        if (sc.nextInt() == 1)
                                        {
                                            System.out.println("Good Boy -Henry");
                                        }
                                        else
                                        {
                                            System.out.println("He robs you and wires all your cash to his account\nYour cash is now at 0\n\nRESULTS:\n");
                                            cash = 0;
                                            System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                                            System.out.println("Cash Available : " + df.format(cash) + "$");
                                            System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                                            System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");

                                            if((debt * (((rate-1) * year)+1)) > (cash+stockValue))
                                            {
                                                System.out.println("You Lose\nYou cant pay back your debt");
                                                System.exit(0); // Exit with a success status
                                            }
                                            else
                                            {
                                                System.out.println("You Win\nYou can pay back your debt\n You finished with a " + df.format((cash+stockValue) - (debt * (((rate-1) * year)+1))) + "$ profit");
                                                System.exit(0); // Exit with a success status
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("IT WORKED!\nYou took 20 bucks from him\nIt has been added to your running total for cash");
                                        cash += 20;
                                    }
                                    break;
                                }
                            case (3):
                            {
                                System.out.println("\nGreetings noob\nI am the best memecoin trader of all time");
                                System.out.println("Select your response:\n\n1) Can I get some advice with stocks? \n2) You Stink! Take a shower!");
                                if (sc.nextInt() == 1)
                                {
                                    System.out.println("\nITS CALLED A COIN\nBut I will make a memecoin for you and personally rug-pull it");
                                    System.out.println("Would you like to trust him?\n\n1) Yes\n2) No");
                                    if (sc.nextInt() == 1) {
                                        System.out.println("\nYou must give me 100% of your cash for this");
                                        trades[1][0] = 1;
                                        trades[1][1] = cash;
                                        cash = 0;
                                        stockValue += ((double) trades[1][1] * 19.91);

                                        System.out.println("The stock went up 1991%!\n\nAnyways let's see your stats:");
                                        System.out.println("Year: " + year++);
                                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                                        System.out.println("Cash Available : " + df.format(cash) + "$");
                                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                                    }
                                }
                                else
                                {
                                    System.out.println("It's my alpha scent!");
                                }
                                break;
                            }
                        }
                    }
                    System.out.println("Would you like to be done trading, or fire one last shot?\n\n1) Keep going\n2) Stop");
                    if(sc.nextInt()==1)
                    {
                        System.out.println("\nWould you like to\n1) Buy the stock\n2) Short the stock");
                        switch (sc.nextInt()) {
                            case (1): {
                                System.out.println("How much would you like to buy: ");
                                amount = sc.nextInt();
                                stockValue += amount;
                                cash -= amount;
                                trades[2][0] = 1;
                                trades[2][1] = amount;
                                break;
                            }
                            case (2): {
                                System.out.println("How much would you like to short?: ");
                                amount = sc.nextInt();
                                stockValue += amount;
                                cash -= amount;
                                trades[2][0] = 2;
                                trades[2][1] = amount;
                                break;
                            }
                        }
                        if ((int) trades[2][0] == 1)
                        {
                            stockValue += ((double) trades[2][1] * 0.25);
                        }
                        else if ((int) trades[2][0] == 2)
                        {
                            stockValue -= ((double) trades[2][1] * 0.25);
                        }
                        System.out.println("You ended with");
                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                        System.out.println("Cash Available : " + df.format(cash) + "$");
                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                        if((debt * (((rate-1) * year)+1)) > (cash+stockValue))
                        {
                            System.out.println("You Lose\nYou cant pay back your debt");
                            System.exit(0); // Exit with a success status
                        }
                        else
                        {
                            System.out.println("You Win\nYou can pay back your debt\n You finished with a " + df.format((cash+stockValue) - (debt * (((rate-1) * year)+1))) + "$ profit");
                            System.exit(0); // Exit with a success status
                        }
                    }
                    else
                    {
                        System.out.println("You ended with");
                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                        System.out.println("Cash Available : " + df.format(cash) + "$");
                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                        if((debt * (((rate-1) * year)+1)) > (cash+stockValue))
                        {
                            System.out.println("You Lose\nYou cant pay back your debt");
                            System.exit(0); // Exit with a success status
                        }
                        else
                        {
                            System.out.println("You Win\nYou can pay back your debt\n You finished with a " + df.format((cash+stockValue) - (debt * (((rate-1) * year)+1))) + "$ profit");
                            System.exit(0); // Exit with a success status
                        }
                    }

                }
                else
                {
                    System.out.println("\nYour a good person\nNever put money over relationships\nYou only have 3 hours daily to trade because of her\nTake a look at this stock chart\n");
                    System.out.println("PolyTrack Inc\n" +
                            "│\n" +
                            "│         /\\\n" +
                            "│        /  \\\n" +
                            "│   /\\  /    \\\n" +
                            "│  /  \\/      \\\n" +
                            "│_/            \\\n" +
                            "│\n" +
                            "└────────────────────────────────────\n" +
                            "   9AM     11AM     1PM     3PM   5PM");

                    System.out.println("Would you like to\n1) Buy the stock\n2) Short the stock");
                    switch (sc.nextInt()) {
                        case (1): {
                            System.out.println("How much would you like to buy: ");
                            amount = sc.nextInt();
                            stockValue += amount;
                            cash -= amount;
                            trades[0][0] = 1;
                            trades[0][1] = amount;
                            break;
                        }
                        case (2): {
                            System.out.println("How much would you like to short?: ");
                            amount = sc.nextInt();
                            stockValue += amount;
                            cash -= amount;
                            trades[0][0] = 2;
                            trades[0][1] = amount;
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

                    if ((int) trades[0][0] == 1)
                    {
                        stockValue -= ((double) trades[0][1]);
                    }
                    else if ((int) trades[0][0] == 2)
                    {
                        stockValue += ((double) trades[0][1]);
                    }
                    System.out.println("Year: " + year++);
                    System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                    System.out.println("Cash Available : " + df.format(cash) + "$");
                    System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                    System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");

                    System.out.println("\nYour girlfriend wants to go to a dinner reservation on the bad side of town");
                    System.out.println("Select your response:\n\n1) I'll go! \n2) Nope");
                    if (sc.nextInt() == 1)
                    {
                        System.out.println("It was going well until you got mugged by 4 men in suits\nThey take you out back and make you drain your account\nShe was a rat trying to steal money from you!\n\nNow you have to pay back your debt of " + df.format((debt * (((rate-1) * year)+1))) + "$");
                        if((debt * (((rate-1) * year)+1)) > (cash+stockValue))
                        {
                            System.out.println("You Lose\nYou cant pay back your debt");
                            System.exit(0); // Exit with a success status
                        }
                        else
                        {
                            System.out.println("You Win\nYou can pay back your debt\n You finished with a " + df.format((cash+stockValue) - (debt * (((rate-1) * year)+1))) + "$ profit");
                            System.exit(0); // Exit with a success status
                        }
                    }
                    else
                    {
                        System.out.println("Good choice\nInstead you hop on robinhood and see the AiOpen is going to IPO\nWhats your move?");
                        System.out.println("\nWould you like to\n1) Buy the stock\n2) Short the stock");
                        switch (sc.nextInt()) {
                            case (1): {
                                System.out.println("How much would you like to buy: ");
                                amount = sc.nextInt();
                                stockValue += amount;
                                cash -= amount;
                                trades[1][0] = 1;
                                trades[1][1] = amount;
                                break;
                            }
                            case (2): {
                                System.out.println("How much would you like to short?: ");
                                amount = sc.nextInt();
                                stockValue += amount;
                                cash -= amount;
                                trades[1][0] = 2;
                                trades[1][1] = amount;
                                break;
                            }
                        }
                        if ((int) trades[1][0] == 1)
                        {
                            stockValue += ((double) trades[1][1] * 1.35);
                        }
                        else if ((int) trades[1][0] == 2)
                        {
                            stockValue -= ((double) trades[1][1] * 1.35);
                        }
                        System.out.println("The stock went up 135%!\nAnyways let's see your stats:");
                        System.out.println("Year: " + year++);
                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                        System.out.println("Cash Available : " + df.format(cash) + "$");
                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");

                        System.out.println("Your loving trading\nAnd your girlfriends lack of love gets you hooked\nYour addicted to trading");
                        System.out.println("Now you are stuck in a loop for the next 3 years of your life\nUntil you lose it all or win");
                        for(int i=0;i<3;i++)
                        {
                            System.out.println("\nWould you like to\n1) Buy the stock\n2) Short the stock");
                            switch (sc.nextInt()) {
                                case (1): {
                                    System.out.println("How much would you like to buy: ");
                                    amount = sc.nextInt();
                                    stockValue += amount;
                                    cash -= amount;
                                    trades[i+2][0] = 1;
                                    trades[i+2][1] = amount;
                                    break;
                                }
                                case (2): {
                                    System.out.println("How much would you like to short?: ");
                                    amount = sc.nextInt();
                                    stockValue += amount;
                                    cash -= amount;
                                    trades[i+2][0] = 2;
                                    trades[i+2][1] = amount;
                                    break;
                                }
                            }
                            if ((int) trades[i+2][0] == 1)
                            {
                                trades[i+2][1] = 0;
                                stockValue -= amount;
                            }
                            else if ((int) trades[i+2][0] == 2)
                            {
                                stockValue += ((double) trades[1][1] * 1.25);
                            }
                            System.out.println("The stock went way down!");
                        }
                        System.out.println("You ended with");
                        System.out.println("Net Worth: " + df.format((cash + stockValue)) + "$");
                        System.out.println("Cash Available : " + df.format(cash) + "$");
                        System.out.println("Total Portfolio Value: " + df.format(stockValue) + "$");
                        System.out.println("Amount Owed to Bank: " + df.format((debt * (((rate-1) * year)+1))) + "$");
                        if((debt * (((rate-1) * year)+1)) > (cash+stockValue))
                        {
                            System.out.println("You Lose\nYou cant pay back your debt");
                            System.exit(0); // Exit with a success status
                        }
                        else
                        {
                            System.out.println("You Win\nYou can pay back your debt\nYou finished with a " + df.format((cash+stockValue) - (debt * (((rate-1) * year)+1))) + "$ profit");
                            System.exit(0); // Exit with a success status
                        }
                    }
                }
            System.out.println("Would you like to play again?\n\n1) Yes\n2)No");
            if(sc.nextInt()==1)
            {
                continue;
            }
            else
            {
                playing = false;
            }
            }
        }
        else
        {
            System.out.println("Goodbye!");
        }
    }
}

