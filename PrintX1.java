/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aciiart;

/**
 *
 * @author user2
 */
public class PrintX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               //j=1 j=2 j=3 j=4 j=5
        //i=1     *               *
        //i=2         *       *
        //i=3             *
        //i=4         *       *
        //i=5     *               *
        
        //Initialization of Integers
        int i,j;
        
        //for loop to print 5 rows and 5 columns
        
        for (i = 1; i<=5; i++)
        {
            for (j=1; j<=5; j++)
            {
              if (i == 1 && j==1) //1st row 1st column
               System.out.print("*");
              if (i == 1 && j==5) //1st row 5th column
               System.out.print("*");
              if (i == 2 && j==2) //2nd row 2nd column
               System.out.print("*");
              if (i == 2 && j==4) //2nd row 4th column
               System.out.print("*");
              if (i == 3 && j==3) //3rd row 3rd column
               System.out.print("*");
              if (i == 4 && j==2) //4th row 2nd column
               System.out.print("*");
              if (i == 4 && j==4) //4th row 4th column
               System.out.print("*");
              if (i == 5 && j==1) //5th row 1st column
               System.out.print("*");
              if (i == 5 && j==5) //5th row 5th column
               System.out.print("*");
            
    //all the remaining rows and columns which i and j's are not specified will be filled with spaces
                else
                  System.out.print(" "); 
                     
            }System.out.println();
        }
    }    
}

