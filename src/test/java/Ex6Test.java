import org.example.Ex6;
import org.example.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {
    private Ex6 ex6;
    private String number;

    private int count;

    @BeforeAll
    public static void onceExecutedBeforeAll () {
        System. out .println ( "Test Digit counter" ) ;
    }

    @BeforeEach
    public void setup(){
        ex6= new Ex6();
        number = "0123456789";
        count = 10;
    }

    @Test
    public void countDigitsTest(){

        double test = ex6.countDigits(number);
        double expected = (double) (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) /count;
        assertEquals(test, expected, "Error counting digits");
    }
}
