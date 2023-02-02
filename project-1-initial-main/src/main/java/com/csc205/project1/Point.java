package com.csc205.project1;
import java.lang.Math;
public class Point {
    private double x;
    private double y;

public Point(){
    x = 0;
    y = 0;
}
public Point(double a, double b ) {
    this.x = a;
    this.y = b;
}
public double distance(Point p2){

    return Math.sqrt( Math.pow((x - p2.getX()),2)+Math.pow((y-p2.getY()),2));

}
public double getX(){
    return x;
}

public void setX(double x) {
    this.x=x;
}

public double getY(){
    return y;
}

public void setY(double y){
    this.y=y;
}

public void setPoint(double x, double y){
 this.x = x;
 this.y = y;
}

public void shiftX(double n){
    x+=n;
}

public void shiftY(double n){
    y+=n;
}
public void rotate(double angle){

    x = x * Math.cos(angle) - y * Math.sin(angle);
    y = x * Math.sin(angle) + y * Math.cos(angle);
}

public String toString()
{
    return "Point{" + "x=" + x + ", y=" + y + '}';
}

}
