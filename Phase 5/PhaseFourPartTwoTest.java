import java.time.Clock;

public class PhaseFourPartTwoTest{
    public static void main(String[] args){
        Clock clock = Clock.systemDefaultZone();
        HomePageUI homePage = new HomePageUI();
        LoginUI test = new LoginUI(homePage);
        System.out.println("\n1, userName should not work");
        test.createAccount("", "Chaz-Berger@protonmail.com", "testZero");

        System.out.println("\n2, userName should not work");
        test.createAccount("fry", "Chaz-Berger@protonmail.com", "testZero");
        
        System.out.println("\n3, should work");
        test.createAccount("cola", "Chaz-Berger@protonmail.com", "testZero");

        System.out.println("\n4, should work except the email already exists so this should be rejected.");
        test.createAccount("fries", "Chaz-Berger@protonmail.com", "testZero");

        System.out.println("\n5, should work except the username already exists so this should be rejected.");
        test.createAccount("cola", "Chaz_Berger@protonmail.com", "testZero");

        System.out.println("\n6, email should not work");
        test.createAccount("schmoe", "", "testOne");

        System.out.println("\n7, email should not work");
        test.createAccount("schmoe", "joe..schmoe@gmail.com", "testOne");

        System.out.println("\n8, should work");
        test.createAccount("schmoe","joe.schmoe@gmail.com", "testOne");

        System.out.println("\n9, email should not work");
        test.createAccount("joeSchmoe", "joeSchmoegmail.com", "testTwo");

        System.out.println("\n10, email should not work");
        test.createAccount("joeSchmoe", "joeSchmoe@gm#il.com", "testTwo");

        System.out.println("\n11, email should not work");
        test.createAccount("joeSchmoe", "joeSchmoe@gmailcom", "testTwo");

        System.out.println("\n12, email should not work");
        test.createAccount("joeSchmoe", "joeSchmoe@gmail.co", "testTwo");

        System.out.println("\n13, email should not work");
        test.createAccount("joeSchmoe", "joeSchmoe@gmail.comm", "testTwo");

        System.out.println("\n14, email should work");
        test.createAccount("joeSchmoe", "joeSchmoe@gmail.com", "testTwo");

        System.out.println("\n15, password should not work");
        test.createAccount("bigMac", "Ronald_macDonald@gmail.com", "");

        System.out.println("\n16, password should not work");
        test.createAccount("bigMac", "Ronald_macDonald@gmail.com", "testO");

        System.out.println("\n17, password should work");
        test.createAccount("bigMac", "Ronald_macDonald@gmail.com", "testThree");

        System.out.println("\n18, email should not work");
        test.login("Ronald_macDonaldgmail.com", "testThree");

        System.out.println("\n19, account doesn't exist and should not sign in.");
        test.login("hacker@sus.com", "testOne");

        System.out.println("\n20, wrong password should not work");
        test.login("joeSchmoe@gmail.com", "testOne");

        System.out.println("\n21, wrong password should not work");
        test.login("Ronald_macDonald@gmail.com", "testOne");

        System.out.println("\n22, should work, and hold count should be reset");
        test.login("Ronald_macDonald@gmail.com", "testThree");
  //      homePage.begin("bigMac", "testThree");
        homePage.addTicket("Red", "Get Burger", "Get a big cheese burger", 2022, 11, 23, 16, 2022, 11, 23, 17);
        homePage.addTicket("Blue", "Eat Burger", "Self Explanitory.", 2022, 11, 23, 17, 2022, 11, 23, 18);
        homePage.addTicket("Purple", "Poop Burger", "Do not do so too quickly or else it will make a mess, and do not do so too slowly or it could be painful.", 2022, 11, 23, 18, 2022, 12, 25, 8);
        homePage.addCheckList("Poop Burger", "Flush Toilet", "Do this after the buisiness is complete");
        homePage.addCheckList("Poop Burger", "Wash Hands", "Don't be gross");
        homePage.removeCheckList("Poop Burger", "Wash Hands");
        homePage.openTicket("Poop Burger");

        // System.out.println("\n23, invalid password should not effect the hold count");
        // test.login("Ronald_macDonald@gmail.com", "test");

        // System.out.println("\n24, wrong password should not work");
        // test.login("Ronald_macDonald@gmail.com", "testTwo");

        // System.out.println("\n25, wrong password should not work");
        // test.login("Ronald_macDonald@gmail.com", "testTwo");

        // System.out.println("\n26, wrong password should not work");
        // test.login("Ronald_macDonald@gmail.com", "testFour");

        // System.out.println("\n27, wrong password should not work, a hold should be placed on account");
        // test.login("Ronald_macDonald@gmail.com", "testFive");

        // System.out.println("\n28,correct password but since a hold is place on the account it should not sign in.");
        // test.login("Ronald_macDonald@gmail.com", "testThree");

        // double timer = clock.millis()+59900;
        // System.out.println("\n29,wrong password but since a hold is place on the account it should respond with that.");
        // test.login("Ronald_macDonald@gmail.com", "testThree");
        // System.out.println("waiting 59900 milliseconds");
        // while(clock.millis() < timer){
        //     //wait
        // }
        // System.out.println("\n30,correct password but since a hold is place on the account it should not sign in.");
        // test.login("Ronald_macDonald@gmail.com", "testThree");
        // timer = clock.millis()+100;
        // System.out.println("waiting 100 milliseconds");
        // while(clock.millis() < timer){
        //     //wait
        // }
        // System.out.println("\n31, hold should be over, should sign in.");
        // test.login("Ronald_macDonald@gmail.com", "testThree");
/*
        System.out.println("\nwait one minute!!!");
        System.out.println("then sign in manually using the terminal!");
        System.out.println("Ronald_macDonald@gmail.com for the email");
        System.out.println("testThree for the password");

        System.out.println("29, should work");
        //wait one minute!!!
        //then sign in manually using the terminal!
        //Ronald_macDonald@gmail.com for the email
        //testThree for the password
        //should work
        test.login();
        */
    }
}