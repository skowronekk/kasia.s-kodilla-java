package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String ShapeName;
    private Integer Field;

    public Square(String shapeName, Integer field) {
        this.ShapeName = shapeName;
        this.Field = field;
    }
    public String getShapeName() {
        return "Square";
    }
    public Integer getField() {
        return 7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(ShapeName, square.ShapeName) &&
                Objects.equals(Field, square.Field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ShapeName, Field);
    }
}

