package com.kodilla.testing.com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 5);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresCount());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 5);
        //when
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresCount());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 5);
        shapeCollector.addFigure(circle);
        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, retrievedFigure);

    }
}