package module1;

/**
  @autor   Mykola Myroshnychenko
  @project   myr.vsem
  @class   AboutMe
  @version   1.0.0
  @since   08.03.2021 - 22.45
*/
public class AboutMe {

    public static void main(String[] args) {

        System.out.println("Facts about me");

        byte myAge = 24;
        System.out.println("My age is " + myAge + " years");

        short myYear = 1997;
        System.out.println("My year of birth " + myYear + " year");

        boolean myBirthday = true;
        System.out.println("I was born in february. It is " + myBirthday);

        float myHeight = 1.88f;
        System.out.println("My height is " + myHeight + " cms");

        double myWeight = 99.2;
        System.out.println("My weight is " + myWeight + " kgs");

        char mySign = 'M';
        System.out.println("The first letter of my sur-name " + mySign);

        long populationSize = 2_658_461;
        System.out.println("The population of the Kharkiv regions " + populationSize + " people");

        int costContract = 25574;
        System.out.println("The cost of the contract is " + costContract + " hryvnia");

    }
}

/*
Facts about me
My age is 24 years
My year of birth 1997 year
I was born in february. It is true
My height is 1.88 cms
My weight is 99.2 kgs
The first letter of my sur-name M
The population of the Kharkiv regions 2658461 people
The cost of the contract is 25574 hryvnia
 */