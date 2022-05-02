package task_1;

public class PinValidator {
    private final String regex = "\\d+";

    public boolean isValid (String pin) throws PinValidatorException {
        if(!(pin.matches(regex))){
            throw new PinValidatorException("Вводите числа");
        } else if (!(pin.length() == 4)){
            throw new PinValidatorException("Неверное кол-во символов");
        }
        return true;
    }
}

class PinValidatorException extends Exception{

    public PinValidatorException(String message){

        super(message);
    }
}
