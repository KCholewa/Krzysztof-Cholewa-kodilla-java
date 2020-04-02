package com.kodilla.testing.shape;

public class Square implements Shape {

    public double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.sideSize, sideSize) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sideSize);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String getShapeName() {
        return ("Square");
    }

    @Override
    public double getField() {
       double field = sideSize*sideSize;
       return field;
    }
}
