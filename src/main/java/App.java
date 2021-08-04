import models.Rectangle;

import java.util.Scanner;


public  class  App{
    public static void main(String[] args){
        Scanner myConsole=new Scanner(System.in);
        System.out.println("Enter the length(height) of you rectangle");
        String stringLength= myConsole.nextLine();
        int intLength= Integer.parseInt(stringLength);
        System.out.println("Enter the width of your rectangle");
        String stringWidth= myConsole.next();
        int intWidth= Integer.parseInt(stringWidth);
        Rectangle rectangle= new Rectangle(intLength,intWidth);
        boolean result = rectangle.isSquare();
        System.out.println("Is you rectangle a square? "+ result+"!");

    }
}