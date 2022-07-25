package Exception;

public class LoginValidator {
    public static void isValid(String login)
        throws WrongLoginException
{


    if (!((login.length() >= 4)
            && (login.length() <= 20))) {
        throw new WrongLoginException(1);
    }


    if (login.contains(" ")) {
        throw new WrongLoginException(2);
    }
    if (true) {
        int count = 0;


        for (int i = 0; i <= 9; i++) {


            String str1 = Integer.toString(i);

            if (login.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            throw new WrongLoginException(3);
        }
    }


    if (!( login.contains("_"))) {
        throw new WrongLoginException(4);
    }

    if (true) {
        int count = 0;


        for (int i = 65; i <= 90; i++) {


            char c = (char)i;

            String str1 = Character.toString(c);
            if (login.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            throw new WrongLoginException(5);
        }
    }

    if (true) {
        int count = 0;


        for (int i = 90; i <= 122; i++) {


            char c = (char)i;
            String str1 = Character.toString(c);

            if (login.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            throw new WrongLoginException(6);
        }
    }


}
    public static void main(String[] args)
    {

        String login1 = "Myrcka_1";

        try {

            isValid(login1);
            System.out.println("Valid Login");
        }
        catch (WrongLoginException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

    }
}
