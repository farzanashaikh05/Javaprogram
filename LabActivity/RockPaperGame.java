package Farzana;
/*
 * @Author Farzana Shaikh
 */

import java.util.Random;//package for random inputs
import java.util.Scanner;//package for taking user input
public class RockPaperGame{

		public static void main(String[] args) {
			game();	//calling function 
			
			}

		private static void game() {
			System.out.println("Welcome to Rock:Paper:Scissor Game");
			System.out.println("enter 1:ROCK  2:PAPER 3:SCISSOR");
			Scanner sc=new Scanner(System.in);
			Random rd=new Random();
			int n=1;
			int count=0;
			int t = 0;
			while(n<=3){
			System.out.println("Your turn \nenter number:");
			int user_input=sc.nextInt();
			switch(user_input){
				case 1:
				{ System.out.println("Rock");
				}break;
				
				case 2:{System.out.println("Paper");
				}break;
				case 3:
				{
					System.out.println("Scissor");
				}break;
			}
			System.out.println("\nComputer's turn ");
			int comp_input=rd.nextInt(3)+1;
			switch(comp_input){
				case 1:
				{ System.out.println("Rock");
				}break;
				
				case 2: {
					System.out.println("Paper");
				}break;
				case 3:{
					 System.out.println("Scissor");
				}break;
			}
			if(user_input==comp_input){
				System.out.println("\nDraw match\n");
			}
			else if((user_input==1&& comp_input==3)||(user_input==2 && comp_input==1)||(user_input==3 && comp_input==2))
			{
				System.out.println("\nCongratulations! You win the match\n");
			count++;
	}
	else {
			System.out.println("\nComputer Won the round\n");
			t++;
			}		
			
		n++;	
		
		}	
			System.out.println("Final Score your's "+count+ "\ncomputer's Score "+t);
		}
		
	}
