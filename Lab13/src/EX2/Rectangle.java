/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return height*width;
    }
    
    @Override
    public double getPerimeter(){
        return 2*height+2*width;
    }

    @Override
    public int compareTo(Rectangle arg0) {
        if(this.getArea()<arg0.getArea()){
            return -1;
        }
        else if(this.getArea()==arg0.getArea()){
            return 0;
        }
        else
            return 1;
    }
    
    @Override
    public boolean equals(Object arg0){
        if(arg0 instanceof Rectangle)
            return this.compareTo((Rectangle)arg0)==0;
        else
            return false;
    }
}
