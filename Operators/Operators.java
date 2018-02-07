class Operators {
    public static void main(String args[]) {
        // String name = "Zech";
        // System.out.println(name);

        // String fullName = "Zechariah Rosal";
        // System.out.println(fullName);

        // String firstName = "Zechariah";
        // String lastName = "Rosal";
        // String fullName = firstName + " " + lastName;

        // System.out.println(firstName);
        // System.out.println("firstName");
        // System.out.println(lastName);
        // System.out.println("lastName");
        // System.out.println(fullName);
        // System.out.println("fullName");

        //Replace the -1's with values relevant to yourself
        // int currentYear = 2018;
        // int yearsUntilGraduation = 0;

        // int myGradYear = currentYear + yearsUntilGraduation;
        // System.out.println(myGradYear);
        // System.out.println("myGradYear");   

         //Replace the -1's with values relevant to yourself
        // int currentAge = 17;
        // int nextAge = currentAge + 1;
        // System.out.println(currentAge);
        // System.out.println(nextAge);

        // int halfCurrentAge = currentAge / 2;
        // int halfNextAge = nextAge / 2;
        // System.out.println(halfCurrentAge);
        // System.out.println(halfNextAge);

        // //"Modulo" is the name of the '%' operator. Can you figure out what the modulo operator is doing?
        // int moduloCurrentAge = currentAge % 5;
        // int moduloNextAge = nextAge % 5;
        // System.out.println(moduloCurrentAge);
        // System.out.println(moduloNextAge);    

        // double bitcoinsOwned = .000001;
        // double bcsCoinsOwned = 2;

        // double bitcoinValue = 10000;
        // double bcsCoinValue = 0;

        // double bitcoinsWorth = bitcoinsOwned * bitcoinValue;
        // double bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
        // System.out.println("My current bitcoins are worth $" + bitcoinsWorth);
        // System.out.println("My current BCSCoins are worth $" + bcsCoinsWorth);

        // //Let's assume I can get it so you can redeem 25 BCSCoins for a $5 giftcard.
        // double reward = 5;
        // double amtToRedeem = 25;
        // bcsCoinValue = reward / amtToRedeem; //Reassign bcsCoinValue to the potential
        // System.out.println("One BCSCoin might be worth $" + bcsCoinValue + " later. If so...");

        // bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue; //This is the exact same calculation we used earlier, but we updated bcsCoinValue, so let's calculate it again.
        // System.out.println("My current BCSCoins could eventually be worth $" + bcsCoinsWorth);    

        // Boolean haveJob = false;
        // Boolean lookingForWork = true;
        // Boolean canProgram = false;
        // int currentSavings = 500;

        // //There are some print statements below. Can you guess which ones will print?
        // if(!haveJob) {
        //     if(lookingForWork && canProgram) {
        //         System.out.println("Your chances as getting a job go up!");
        //     }
        //     else {
        //         System.out.println("You might need to gain more skills before you can get a job.");
        //     }
        // }
        // if(currentSavings < 500) {
        //     System.out.println("You should be saving more money.");
        // }
        // else {
        //     System.out.println("Do you need to save more money, still?");
        // } 

        // int targetSavingsGoal = 8800;
        // int savingsPerMonth = 150;
        // int monthsToReach = targetSavingsGoal / savingsPerMonth;
        // System.out.println("months to reach");
        // System.out.println(monthsToReach);

        // String name1 = "Jeremiah";
        // String name2 = "Emily";
        // String name3 = "Christian";
        // String verb1 = "grabs";
        // String verb2 = "sees";
        // String verb3 = "is";
        // String adj1 = "red";
        // String adj2 = "wooden";
        // String adj3 = "cold";
        // String noun1 = "chair";
        // String noun2 = "apple";
        // String noun3 = "grass";
        // String art1 = "a";
        // String art2 = "the";
        // String help = "will";

        // String sent1 = name1 + " " + verb1 + " " + art1 + " " + adj1 + " " + noun1 + ".";
        // String sent2 = name2 + " " + verb2 + " " + art2 + " " + adj2 + " " + noun2 + ".";
        // String sent3 = name3 + " " + help + " " + verb3 + " " + adj3 + " " + noun3 + ".";

        // System.out.println(sent1);
        // System.out.println(sent2);
        // System.out.println(sent3);

        // Boolean hasGirlfriend = false;
        // Boolean hasMoney = true;
        // Boolean hasJob = false;

        // if(hasGirlfriend) {
        //     System.out.println("Success!");
        // }
        // else {
        //     System.out.println("Not my time.");
        // }
        // if(hasMoney || hasJob) {
        //     System.out.println("You can do it!");
        // }
        // else {
        //     System.out.println("Not good.");
        // }

        double loanAmount = 12000;
        double interestRate = 0.01;
        double loanPaybackPeriod = 6;
        double interestPerMonth = loanAmount / loanPaybackPeriod;

        System.out.println(interestPerMonth);
    }
}