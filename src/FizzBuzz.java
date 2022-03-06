import java.util.Scanner;
class FizzBuzz
{
  public static void main(String[] args) 
  {

    // The number to check for FizzBuzz.
    int numCheck = 0;
    char userRepeatChoice;
    String userRepeatInput;
    String menuRepeat = "Would you like to start again? (y or n) ";

    // Create scanner object for input.
    Scanner keyboard = new Scanner(System.in);

    // Display the program title.
    generateTitle();
    
    // Display instructions.
    System.out.println("Numbers divisble by 3 are Fizz.");
    System.out.println("Numbers divisble by 5 are Buzz.");
    System.out.println("Numbers divisble by 3 and 5 are FizzBuzz.");
    
    do
    {

    System.out.printf("Enter a number to check it's value: ");

    // Get the number from the Scanner object.
    numCheck = keyboard.nextInt();

    // Call the isBuzz method to check 
    // for Fizz, Buzz, or FizzBuzz and
    // assign the results to returnValue.
    int returnValue = isBuzz(numCheck);


    // Determine which output to display based on the
    // returnValue from the isBuzz method.
    if (returnValue == -3)
    {
        System.out.println(numCheck + " divided by 3 equals " + numCheck / 3);
        System.out.println(numCheck + " divided by 5 equals " + numCheck / 5);
        System.out.println(numCheck + " is FizzBuzz.");
    }
    else if (returnValue == -1)
    {
        System.out.println(numCheck + " divided by 3 equals " + numCheck / 3);
        System.out.println(numCheck + " is Fizz.");
    }
    else if (returnValue == -2)
    {
        System.out.println(numCheck + " divided by 5 equals " + numCheck / 5);
        System.out.println(numCheck + " is Buzz.");
    }
    else 
    {
        System.out.println(numCheck + " is not Fizz, Buzz, or FizzBuzz!");
    }
    keyboard.nextLine(); // Consume the remaining newline.
    System.out.printf(menuRepeat); // Ask if the user would like to start again.
    userRepeatInput = keyboard.nextLine(); // Get the user input.
    userRepeatChoice = userRepeatInput.charAt(0); // Get the first char.
    } 
    while(userRepeatChoice == 'Y' || userRepeatChoice == 'y'); // Loop if the answer is 'Y' or 'y'.
      
    // Close the Scanner object.
    keyboard.close();
  }

    /**
      The isBuzz method determines if the integer is divisible by 3, 5, or both.
      @param i An integer.
      @return -1=Fizz, -2=Buzz, -3=FizzBuzz, or int.
    */
    public static int isBuzz(int i)
    {
      if (i % 3 == 0 && i % 5 == 0)
      {
        return -3; // -3=FizzBuzz
      }
      else if (i % 3 == 0)
      {
        return -1; // -1=Fizz
      }
      else if (i % 5 == 0)
      {
        return -2; // -2=Buzz
      }
      else
      {
        return i;
      }
    
  }

  /**
      The generateTitle method outputs a Title header.
    */
    public static void generateTitle()
    {
    String tableCharacter = "/";
    String headerText = "FIZZ BUZZ CHECKER";
    int headerLength = headerText.length();
    final int COLUMNS = headerLength + 6;
    final int ROWS = 1;

    // Print the first half of the table. 
    for (int row = 0; row < ROWS; row++)
    {
        for (int col = 0; col < COLUMNS; col++)
        {
          System.out.printf(tableCharacter);
        }
    System.out.println();
    }

    //Jump out and print the headerText padded with 2 tableCharacters on each side of the text.
    System.out.printf(tableCharacter + tableCharacter + " " + headerText + " " + tableCharacter + tableCharacter + "\n");

    // Print the last half of the table. 
    for (int row = 0; row < ROWS; row++)
    {
        for (int col = 0; col < COLUMNS; col++)
        {
          System.out.printf(tableCharacter);
        }
    System.out.println();
    }

  }
    
}