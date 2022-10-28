package objetos.parcial3.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testArea(){
        Rectangle rectangle = new Rectangle(2,10);
        Assertions.assertEquals(24,rectangle.getPerimeter());
    }
    @Test
    public void testPerimeter(){
        Rectangle rectangle = new Rectangle(2,10);
        Assertions.assertEquals(20,rectangle.getArea());
    }
    @Test
    public void testGetBaseGetHeight(){
        Rectangle rectangle = new Rectangle(2,10);
        Assertions.assertEquals(2,rectangle.getBase());
        Assertions.assertEquals(10,rectangle.getHeight());
    }

}
