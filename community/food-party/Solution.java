import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import static java.util.function.Predicate.not;

public class Solution {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var itemsCount = sc.nextInt();
		var foods = sc.tokens().limit(itemsCount).collect(toSet());
		var pairsCount = sc.nextInt();
		var pairs = Stream.generate(() -> new Pair(sc.next(), sc.next()))
		        .limit(pairsCount).collect(toList());
		sc.close();
		
		System.out.println(foods);
		System.out.println(pairs);
		
		var menu = new ArrayList<String>();
		
		while (!pairs.isEmpty()) {
			var fatFoods = pairs.stream().map(Pair::getHighCalorieFood).collect(toSet());
			var lowFatFood = foods.stream()
			        .filter(not(fatFoods::contains)).findFirst().orElseThrow();
			menu.add(lowFatFood);
			pairs.removeIf(pair -> pair.isLowCalorieEquals(lowFatFood));
			foods.remove(lowFatFood);
		}
		menu.addAll(foods);
		menu.forEach(System.out::println);
	}
}

class Pair {
	private String lowCalorie;
	private String highCalorie;
	
	Pair (String lowCalorie, String highCalorie) {
		this.lowCalorie = lowCalorie;
		this.highCalorie = highCalorie;
	}
	
	String getHighCalorieFood() { 
		return highCalorie; 
	}
	boolean isLowCalorieEquals(String food) {
		return lowCalorie.equals(food);
	}
	@Override
	public String toString() {
		return lowCalorie + " < " + highCalorie;
	}
}
