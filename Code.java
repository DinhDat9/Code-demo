/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author DELL
 */
public class Code {

    // Function to add two numbers
    public static int add(int a, int b) {
        int sum = a + b; // Local variable on stack
        return sum; // sum and local frame will be popped after return
    }

    public static void main(String[] args) {
        int num1 = 5; // Stored in main's stack frame
        int num2 = 10;
        
        // Function call: pushes return address, arguments, local vars
        int result = add(num1, num2);

        // Control returns here, and result is printed
        System.out.println("Result: " + result); // Output: 15
    }
}

