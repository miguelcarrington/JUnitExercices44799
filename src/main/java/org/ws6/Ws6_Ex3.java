package org.ws6;

public class Ws6_Ex3 {

    public int calcArea(int length, int height){
        return length * height;
    }

    public int calcPerimeter(int length, int height){
        return 2*(length + height);
    }
    public boolean isTriangle(int s1, int s2, int s3){
        return s1 < s2 + s3 && s2 < s1 + s3 && s3 < s1 + s2;
    }
}
