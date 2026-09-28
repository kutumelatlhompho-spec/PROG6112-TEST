//Question 1
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
		
		String[] gamingConsoles = {"PS5", "XBOX", "SWITCH"};
		
		int[][] consoleSales = {{1000, 2000, 3000},
		                        {2000, 3000, 4000},
		                        {1500, 1100, 1200}
		                        };
		
		int[] totals = new int[cities.length];
		
		for (int row = 0; row < cities.length; row++) {
		    int sum = 0;
		    for (int col = 0; col < gamingConsoles.length; col++) {
		        sum = sum + consoleSales[row][col];
		    }
		    totals[row] = sum;
		}
		
		int highestIndex = 0;
		for (int i = 1; i < totals.length; i++) {
		    if (totals[i] > totals[highestIndex]) {
		        highestIndex = i;
		    }
		}
		
		String line = "---------------------------------------";
		System.out.println(line);
		System.out.println("GAMING CONSOLE REPORT");
		System.out.println(line);
		System.out.printf("%-18s %-12d %-12d %-12d %n", " ", "PS5", "XBOX", "SWITCH");
		
		for (int row = 0; row < cities.length; row++) {
		    System.out.printf("%-18s %-12d %-12d %-12d %n", cities[row], consoleSales[row][0], consoleSales[row][1], consoleSales[row][2]);
		}
		
		System.out.println(line);
		System.out.println("CONSOLE SALES TOTALS FOR EACH CITY ");
		
	    System.out.println("City with the most sales: " + highestIndex);
	    System.out.println();
	}
}










