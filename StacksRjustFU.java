import java.util.Stack;

public class StacksRjustFU {

	public static void main(String[] args) {
		Stack <String> games = new Stack<String>();{
			games.add("Call of Duty");
			games.add("Guitar Hero");
			games.add("Super Mario");
			
			
			
			System.out.println(games.push("Bubble shooter"));
			
			
			System.out.println(games);
		}
		

	}

}
