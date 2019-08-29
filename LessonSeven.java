public class LessonSeven {
 
	public static void main(String[] args) {
		
		// outside of a class, you can only access 
		// PUBLIC variables and functions
		MonsterTwo Frank = new MonsterTwo();
		Frank.name = "Frank";
		System.out.println(Frank.name + " has an attack of " + Frank.getAttack());
	}
}
