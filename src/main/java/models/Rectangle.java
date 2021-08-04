package models;

import java.util.ArrayList;

public class Rectangle {
private final int height;
private final int width;
private final static ArrayList<Rectangle> instance= new ArrayList<>();
  public Rectangle(int length, int width){
          this.height=length;
          this.width= width;
          instance.add(this);


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
  public int getArea(){
    return this.height*this.width;
  }
  public static ArrayList<Rectangle> getAll(){
   return instance;
  }

}

