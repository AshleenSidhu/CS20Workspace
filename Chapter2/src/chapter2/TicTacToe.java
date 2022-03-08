/*

Program: TicTacToe.java          Last Date of this Revision: 03-Mar-2022

Purpose: Create a TicTacToeBoard application that displays a tic-tac-toe board with an X in the center.  

Author: Ashleen Sidhu, 
School: CHHS
Course: Computer Programming 20
 
*/

package chapter2;

public class TicTacToe 
{

	public static void main(String[] args)
	{
		System.out.println("      |       |");
		System.out.println("      |       |");
		System.out.println("      |       |");
		
		System.out.println("---------------------");
		
		System.out.println("      |       |");
		System.out.println("      |   x   |");
		System.out.println("      |       |");
		
		System.out.println("---------------------");
		
		System.out.println("      |       |");
		System.out.println("      |       |");
		System.out.println("      |       |");
		
		
		System.out.println("\nTic Tac Toe Rules");
		
		System.out.println("Tic Tac Toe is a game for 2 players. To win you have to complete a row of an x or o.The row can be diagonal, horizontal, or vertical.");
		
		System.out.println("1. A grid of 9 square are drawn.");
		
		System.out.println("2. The first player draws an x in and empty square.");
		
		System.out.println("3. The second player draws an o in an empty square.");
		
		System.out.println("4. Step 2 and 3 repeat until the grid is filled and there are no more empty squares and there is a complete row of your pattern (x or o).");
		
		System.out.println("5. The winner draws a line through the pattern. If there is no pattern it is a tie and there is no winner.");
		
	}
	
}




/* Screen Dump

      |       |
      |       |
      |       |
---------------------
      |       |
      |   x   |
      |       |
---------------------
      |       |
      |       |
      |       |

Tic Tac Toe Rules
Tic Tac Toe is a game for 2 players.
1. A grid of 9 square are drawn.
2. The first player draws an x in and empty square.
3. The second player draws an o in an empty square.
4. Step 2 and 3 repeat until the grid is filled and there are no more empty squares.
5. The winner draws a line through the pattern. 



      |       |
      |       |
      |       |
---------------------
      |       |
      |   x   |
      |       |
---------------------
      |       |
      |       |
      |       |

Tic Tac Toe Rules
Tic Tac Toe is a game for 2 players. To win you have to complete a row of an x or o.The row can be diagonal, horizontal, or vertical.
1. A grid of 9 square are drawn.
2. The first player draws an x in and empty square.
3. The second player draws an o in an empty square.
4. Step 2 and 3 repeat until the grid is filled and there are no more empty squares and there is a complete row of your pattern (x or o).
5. The winner draws a line through the pattern. If there is no pattern it is a tie and there is no winner.

 
 */