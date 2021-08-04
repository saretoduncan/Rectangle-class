package models;

public class Cube {
    Rectangle mFace;
public Cube(Rectangle rectangle){
    this.mFace=rectangle;
}
 public Rectangle getFace(){
    return mFace;
    }
}
