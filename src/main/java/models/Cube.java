package models;

public class Cube {
    Rectangle mFace;
public Cube(Rectangle rectangle){
    this.mFace=rectangle;
}
 public Rectangle getFace(){
    return mFace;
    }
    public int getVolume(){
    int length= this.getFace().getLength();
    return length*length*length;
    }
    public int getSurfaceArea(){
//    int length= this.getFace().getLength();
//    return (length*length)*6;
        return this.getFace().getArea()*6;
    }
}
