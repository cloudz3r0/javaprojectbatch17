package review13;

/***
 * This exception is thrown when user does not have enough balance.
 */
public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String msg){
        super(msg);
    }

}
