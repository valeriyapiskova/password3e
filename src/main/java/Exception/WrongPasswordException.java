package Exception;

class WrongPasswordException extends Exception {

    int passwordConditionViolated = 0;

    public WrongPasswordException(int conditionViolated)
    {
        super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage()
    {

        switch (passwordConditionViolated) {


            case 1:
                return ("Password length should be"
                        + " between 4 to 20 characters");


            case 2:
                return ("Password should not"
                        + " contain any space");


            case 3:
                return ("Password should contain"
                        + " at least one digit(0-9)");


            case 4:
                return ("Password should contain at "
                        + "least one special character");


            case 5:
                return ("Password should contain at"
                        + " least one uppercase letter(A-Z)");


            case 6:
                return ("Password should contain at"
                        + " least one lowercase letter(a-z)");
        }

        return ("true");
    }
}




