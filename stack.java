package javaprojects;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> plateStack=new Stack<String>();
		
		// Cleaning plates and stacking them
		plateStack.push("Plate 1");
		plateStack.push("Plate 2");
		plateStack.push("Plate 3");
        plateStack.push("Plate 4");
		System.out.println("Stack of plates: " + plateStack);

        // Someone eats and takes the top plate
        System.out.println("\nTaking a plate for eating...");
        String usedPlate = plateStack.pop();
        System.out.println("Used: " + usedPlate);
        
        System.out.println("\nUpdated stack of plates: " + plateStack);
	    }
	}


