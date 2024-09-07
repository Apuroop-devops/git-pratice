/**
 * @(#)Exercise1.java
 *
 * Exercise1 application
 *
 * @author 
 * @version 1.00 2023/10/1
 */
 //a function program to calculate volume of cylinder
public class Exercise1 {
   //volume of cylinder
   static double Volume(double radius,double lenght)
   {
   	double volume;
   	volume =Math.PI*radius*radius*lenght;
   	return(volume);
   }
    public static void main(String[] args) 
    {
    	double V;
    	v =Volume(10.0,10.0);
    	System.out.println("V=volume of cylinder" +v);
    }
}
