// Arrays
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

//Basic class definition
//public means this class can be used by other classes
//Class names should begin with a capital letter
//A file can't contain two public classes. It can contain classes that are not public
//If you place class files in the same folder the java compiler will be able to find them
/* The Goal of this tutorial is to make a game like this
------------------------------
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||M||F||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|P||*||*||*||*||*||*||*||*||*|
|*||*||*||*||D||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
------------------------------
[9,9]
*/

// classes and objects
public class MonsterTwo {
	
	// multi dimensional array
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard() {
		
		// temporarily populate array with stars, special way of populating array
		for(char[] row : battleBoard) {
			Arrays.fill(row, '*');
		}
	}
	
	public static void redrawBoard() {
		int k = 1;
		while(k <=30) {System.out.print('-'); k++;}
		System.out.println();
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j <battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while(k <=30) {System.out.print('-'); k++;}
		System.out.println();
	}
	
	public final String TOMBSTONE = "Here Lies a dead moster";
	
	// private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	
	private boolean alive = true;
	
	// public variables are visible outside of the class
	// you should have as few as possible public fields
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numOfMonsters = 0;
	
	// Accessor methods are used to get and set the values of private fields
	
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public void moveMonster(MonsterTwo[] monster, int arrayItemIndex) {
		
		boolean isSpaceOpen = true;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		while(isSpaceOpen) {
			
			// move either N, S, E or W
			int randMoveDirection = (int) (Math.random() * 4);
			// determine how many steps monster is moving in certain positions
			int randMoveDistance = (int) (Math.random() * (this.getMovement()));
		
			System.out.println(randMoveDistance + " " + randMoveDirection);
			
			// as monster moves, replace space it was in with a '*'
			battleBoard[this.yPosition][this.xPosition] = '*';
			
			// North == 0
			// moving north so potentially hit a negative number which we don't want
			if(randMoveDirection == 0) {
				if((this.yPosition - randMoveDistance) < 0)
				{
					this.yPosition = 0; // if it's a negative number, set position to equal 0, so monster doesn't fall off game board
				}
				else {
					this.yPosition = this.yPosition - randMoveDistance;
				}
			}
			// East == 1
			else if (randMoveDirection == 1) {
				if((this.xPosition + randMoveDistance) > maxXBoardSpace)
				{
					this.xPosition = maxXBoardSpace;
				}
				else {
					this.xPosition = this.xPosition + randMoveDistance;
				}
			}
			// South == 2
			else if (randMoveDirection == 2) {
				if((this.yPosition + randMoveDistance) > maxYBoardSpace)
				{
					this.yPosition = maxYBoardSpace;
				}
				else {
					this.yPosition = this.yPosition + randMoveDistance;
				}
			}
			// West == 3
			else {
				// keep from falling to the left, so it doesn't go below 0
				if((this.xPosition + randMoveDistance) < 0) {
					this.xPosition = 0; // if it wants to fall off, simply set it to leftmost of board
				}
				else {
					this.xPosition = this.xPosition - randMoveDistance; // move left from current distance
				}
			}
			
			// make sure we don't move monsters on top of each other or itself
			for(int i = 0; i < monster.length; i++) {
				
				// Monster Frank x = 1, y = 3
				if(i == arrayItemIndex) {
					continue;
				}
				// if there's a monster on space i want to move to,
				if(onMySpace(monster, i, arrayItemIndex)) {
					
					isSpaceOpen = true; // 
					break;

				}
				else {
					isSpaceOpen = false;
				}
			}
					
		} // END OF WHILE LOOP
		
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
	} // END OF moveMonster
	
	// Check if there's a monster on space i want to move to, return true of yes, false otw
	public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2) {
		
		if((monster[indexToChk1].xPosition) == (monster[indexToChk2].xPosition) && (monster[indexToChk1].yPosition) == (monster[indexToChk2].yPosition)) {
			
			return true;
			
		}
		else {
			return false;
		}
	}
	
	// Constructor
	public MonsterTwo(int health, int attack, int movement, String name) {
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		/* If the attributes has the same name as the class health, attack, movement 
		 * You could refer to the object fields by proceeding them with this
		 * this.healt = health
		 * this.attack = attack
		 * this.movement = movement
		 */
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		// Place 1 monster on top of stars only, not on top of other monsters 
		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		} while(battleBoard[randNumX][randNumY] != '*'); // since the whole board == '*', it will only place ONE monster in this loop, DUH
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		// assigning monster initial to position in array
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
		numOfMonsters++;
	}
	
	// overloading the constructor(declaring variable constructors)
	// Default constructor
	public MonsterTwo() {
		numOfMonsters++;
	}
	
	public static void main(String[] args) {
		MonsterTwo Frank = new MonsterTwo();
		System.out.println(Frank.attack);
	}
	
	
	
	
}