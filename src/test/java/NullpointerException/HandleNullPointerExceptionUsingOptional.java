package NullpointerException;

import java.util.Optional;

public class HandleNullPointerExceptionUsingOptional {
    static String firstName;

    public static void main(String[] args) {
        Optional<String> fnOptional = Optional.ofNullable(firstName);
        if (fnOptional.isPresent()){
            System.out.println(fnOptional.get().length());
        }else System.out.println("First Name No value");
    }
}
