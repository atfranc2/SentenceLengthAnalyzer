package SentenceTools;

public class InvalidDelimiterException extends Exception{
    public InvalidDelimiterException(String invalidDelimiter){
        super('"' + invalidDelimiter + '"' + " is not a valid delimiter.");
    }
}
