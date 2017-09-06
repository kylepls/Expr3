package in.kyle.expr;

import java.util.Scanner;

public class TestRun {
    
    public static void main(String[] args) {
    	Expr expr = new Expr();
    	Scanner scanner = new Scanner(System.in); 
    	while (true) {
			System.out.println(expr.eval(scanner.nextLine()));
		}
    }
}
