package com.name.module1_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        double expectedArea = 6.0;
        double actualArea = triangle.getArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(2.0);
        double expectedArea = 12.56636;
        double actualArea = circle.getArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
}
