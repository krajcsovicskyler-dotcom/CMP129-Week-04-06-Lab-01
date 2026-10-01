import java.util.Scanner;
public class DriversLicenseExam {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String[] correctAnswers = {"A","D","B","B","C","B","A","B","C","D","A","C","D","B","D","C","C","A","D","B"};
        String[] studentAnswers = {};
        System.out.println("Please enter only 'A, B, C, or D' for your test answers");
        for(int i = 0; i<20; i++)
        {
            boolean validAnswer = false;
            do
            {
                System.out.print("Enter your answer for question " + i + " : ");
                String Answer = input.nextLine();
                if(Answer.equalsIgnoreCase("A")||Answer.equalsIgnoreCase("B")||Answer.equalsIgnoreCase("C")||Answer.equalsIgnoreCase("D"))
                {
                    validAnswer = true;
                    studentAnswers[i] = Answer.toUpperCase();
                }
                else
                {
                    System.out.println("Answer is invalid. Please enter 'A, B, C, or D'.");
                }
            }while(validAnswer = false);
        }//ends for loop
    }//ends main
}//ends class
