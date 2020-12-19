package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Addition add = new Addition(10, 20);
        int result=add.addTwoNumbers();
        System.out.println("Here's the result = "+result);
    }
}
