package Exception;

public class WrongLoginException extends Exception {

    int loginConditionViolated = 0;

    public WrongLoginException(int conditionViolated) {
        super("Invalid Login: ");
        loginConditionViolated = conditionViolated;
    }

    public void printMessage() {

        switch (loginConditionViolated) {


            case 1:
                System.out.println("Login length should be"
                        + " between 4 to 20 characters");


            case 2:
                System.out.println("Login should not"
                        + " contain any space");


            case 3:
                System.out.println("Login should contain"
                        + " at least one digit(0-9)");


            case 4:
                System.out.println("Login should contain at "
                        + "least one special character");


            case 5:
                System.out.println("Login should contain at"
                        + " least one uppercase letter(A-Z)");


            case 6:
                System.out.println("Login should contain at"
                        + " least one lowercase letter(a-z)");
        }


    }
}
