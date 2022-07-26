package Exception;

public class PasswordValidator {


    public static void isValid(String password, String confirmPassword)
            throws WrongPasswordException {


        if (!((password.length() >= 4)
                && (password.length() <= 20)) && !password.equals(confirmPassword)) {
            throw new WrongPasswordException(1);
        }


        if (!(password.contains(" ")) && !password.equals(confirmPassword)) {
            throw new WrongPasswordException(2);
        }

        int count = 0;


        for (int i = 0; i <= 9; i++) {

            String str1 = Integer.toString(i);

            if (!(!password.contains(str1) && password.equals(confirmPassword))) {
                count = 1;
            }
        }
        if (count == 0) {
            throw new WrongPasswordException(3);
        }

        if (!(!password.contains("_") && password.equals(confirmPassword ))) {
            count = 1;
        }

        if (count == 0) {
            throw new WrongPasswordException(4);
        }
        for (int i = 65; i <= 90; i++) {

            char c = (char) i;

            String str1 = Character.toString(c);
            if (password.contains(str1) && password.equals(confirmPassword)) {
                count = 1;
            }
        }
        if (count == 0) {
            throw new WrongPasswordException(5);
        }
        for (int i = 90; i <= 122; i++) {
            char c = (char) i;
            String str1 = Character.toString(c);

            if (password.contains(str1) && password.equals(confirmPassword.contains(str1))) {
                count = 1;
            }
        }
        if (count == 0) {
            throw new WrongPasswordException(6);
        }
    }
    public static void main(String[] args)
    {
        String password1 = "Myrchik_2";
        String confirmPassword = "Myrchik_2";
        try {
            isValid(password1,confirmPassword);
            System.out.println("Valid Password");
        }
        catch (WrongPasswordException e) {
            e.getMessage();
            e.printMessage();
        }

    }
}
