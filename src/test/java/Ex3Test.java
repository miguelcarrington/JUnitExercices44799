import org.example.Ex3;
import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex3Test {
    @Test
    public void calcAreaTest(){
        Ex3 ex3 = new Ex3();
        int area = ex3.calcArea(3, 5);
        int testArea = 15;
        assertEquals(area, testArea,"Error calculating the area!!");
    }

    @Test
    public void calcPerimeterTest() {
        Ex3 ex3 = new Ex3();
        int perimeter = ex3.calcPerimeter(3, 5);
        assertEquals(perimeter, 16, "Error calculating the perimeter!!");

    }
    @Test
    public void isTriangleTest(){
        Ex3 ex3 = new Ex3();
        assertTrue(ex3.isTriangle(5,5,5));
    }
}
