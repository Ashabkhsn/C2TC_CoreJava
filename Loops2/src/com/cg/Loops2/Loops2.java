package com.cg.Loops2;

public class Loops2 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println("before braking=" +i);
			if(i == 6)
				break;
			System.out.println("after breaking=" +i);
			
		}System.out.println("for loop terminated");

	}

}
