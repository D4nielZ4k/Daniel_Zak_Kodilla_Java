package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    void addFigure(Shape shape){
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape){
       boolean result = false;
       if (shapeCollection.contains(shape)){
           shapeCollection.remove(shape);
           result = true;
       }
        return result;
    }

    public int getFigure(int n){
         return n ;
    }

    public void showFigures(){
        System.out.println(shapeCollection.toString());
    }

    @Override
    public String toString() {
        return "ShapeCollector  " +  shapeCollection
                ;
    }
}
