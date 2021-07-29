package models;

public class Rectangle {
private int height;
private int width;
  public Rectangle(int length, int width){
this.height=length;
this.width= width;

  }
  public int getLength(){
    return this.height;
  }
  public  int getWidth(){
    return  this.width;
  }
  public boolean isSquare(){
    return this.height==this.width;
  }

}
