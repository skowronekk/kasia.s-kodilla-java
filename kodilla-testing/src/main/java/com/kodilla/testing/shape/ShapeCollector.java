package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figureList = new ArrayList<>();

    public void addFigure(Shape shape) {
        figureList.add(shape);

    }

    public boolean removeFigure(Shape shape) {
        figureList.remove(shape);
        return false;
    }

    public Shape getFigure(int n) {
        return figureList.get(n);
    }

    public int getFiguresCount() {
        return figureList.size();

    }
}


