/*
Name: Grant Baumstark
Block: F
Program: PA02
Date: 08/23/25
*/

public class PA02 {
  public static void main(String[] args) {

    // This program calculates the floor area for my house.
    // Not gonna worry about naming too much because this'll be quick.
	  
	  //going to rename so that variables are easier to organize
    int recx = 16; //semicolon instead of comma
    int recy = 7;
    
    int recarea = recx*recy; //rectangle formula
    
    double pi = 3.14;      //its pi not pie, needs to be double for a floating point with 64 bits
    String mrhi = "Mr. Rosen's house is ";      //capitalized s in String (syntax)
    int circler = 18;       //once more renaming for clarity
    
    double circlearea = pi*circler*circler; //circle formula
    
    /*
    int two = 0;  // obvious variable name
    int a = 12;
    int z = a/two;
    double b = 7;
    double b = z * b;
    
    //this formula sucks, and i have no idea why zero is there
    //it appears its literally there just so you can divide by it and cause an error lol
    */
    
    
    //removing the needless division by zero and making the triangle formula more clear and streamlined
    int tria = 12;
    int trib = 7;
    
    int triarea = tria * trib / 2;  //Just for the area of a triangle
    
    String sqft = " square feet.";
    
    
    // double area = x*y + pie*r*r + b; 
    //this formula would probobly be better organized as multiple functions.
    
    //now that I have multiple functions, i just add to create total area
    double totalarea = triarea+recarea+circlearea;
    
    System.out.println(mrhi + totalarea + sqft); //remove extra letter on variable mrhi, capitalize s in System (syntax)
    
    //deleted comment here because it was not properly formatted


  }
}