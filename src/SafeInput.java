import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retval = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retval = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while (!done);

        return retval;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retval = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retval = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an double: " + trash);
            }
        } while (!done);

        return retval;
    }

    public static int getRangedint(Scanner pipe, String prompt, int low, int high)
    {
        int retval = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]:" );
            if(pipe.hasNextInt())
            {
                retval = pipe.nextInt();
                pipe.nextLine();
                if(retval >= low && retval <= high)
              {
                   done = true;
               }
               else
               {
                   System.out.println("\nNumber is out of range [" + low + " - " + high + "]: " + retval);
                }
           }
            else
           {
                trash = pipe.nextLine();
                System.out.println("You must enter an int [" + low + " - " + high + "]: " + trash);
            }
        }while(!done);

       return retval;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retval = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]:" );
            if(pipe.hasNextDouble())
            {
                retval = pipe.nextDouble();
                pipe.nextLine();
                if(retval >= low && retval <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + " - " + high + "]: " + retval);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an double [" + low + " - " + high + "]: " + trash);
            }
        }while(!done);

        return retval;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retval = true;
        String response = "";
        boolean gotAval = false;

        do
        {
            System.out.print("\n" + prompt + "[Y/N]");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                gotAval = true;
                retval = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                gotAval = true;
                retval = false;
            }
            else
            {
                System.out.println("You must answer [Y/N]! " + response);
            }
        }while (!gotAval);
        return retval;

    }
}




