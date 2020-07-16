package com.java.thirtydayscode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueuesandStacks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

	}

}

class Solution {
	
	Stack<Character> pushStack = new Stack<Character>();
	Queue<Character> pushQueue = new LinkedList<Character>();
	
	public void pushCharacter(char c) {
		
		pushStack.push(c);
		
	}

	public char dequeueCharacter() {
		// TODO Auto-generated method stub
		return pushQueue.poll();
	}

	public char popCharacter() {
		// TODO Auto-generated method stub
		return pushStack.pop();
	}

	public void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		pushQueue.add(c);
		
		
		
	}
	
}
