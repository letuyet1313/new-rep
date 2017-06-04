package main;
import java.io.IOException;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Demo = new Calculator();
		Scanner input = new Scanner(System.in);
		double NumBi1 = input.nextDouble();
		double NumBi2 = input.nextDouble();
		ArrayList NumSum = Demo.Sum(NumBi1, NumBi2);
		ArrayList NumSub = new ArrayList();
		System.out.println("Sum: ");
		for(int i = Demo.Sum(NumBi1, NumBi2).size(); i > 0; i++){
			System.out.println(Demo.Sum(NumBi1, NumBi2));
		}
		System.out.println("Sub: ");
		for(int i = Demo.Sub(NumBi1, NumBi2).size(); i > 0; i++){
			System.out.println(Demo.Sub(NumBi1, NumBi2));
		}
		
	}

}
