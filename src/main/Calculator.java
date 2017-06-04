package main;


import java.util.ArrayList;

public class Calculator{
	ArrayList Num1 = new ArrayList();
	ArrayList Num2 = new ArrayList();
	
	float NumBi1, NumBi2;
	public ArrayList SplitNum(double NumBi){
		ArrayList num = new ArrayList();
		while(NumBi != 0){
			int temp = (int) NumBi%10;
			num.add(temp);
			NumBi = NumBi/10;
		}
		return num;
	}
	
	public ArrayList Sum(double NumBi1, double NumBi2){
		ArrayList Num1 = SplitNum(NumBi1);
		ArrayList Num2 = SplitNum(NumBi2);
		ArrayList NumSum = new ArrayList();
		int temp = 0;
		for(int i = 0; i < Math.max(Num1.size(), Num2.size()); i++){
			if((Num1.get(i) + Num2.get(i)+ temp) == 0){
				NumSum.add(0);
				temp = 0;
			}
			else if((Num1.get(i) + Num2.get(i) + temp) == 1){
				NumSum.add(1);
				temp = 0;
			}
			else {
				NumSum.add(0);
				temp = 1;
			} 
		}
		return NumSum;
	}
	public ArrayList Sub(double numBi1, double numBi2){
		ArrayList NumSub = new ArrayList();
		int temp = 0;
		for(int i = 0; i < Math.max(Num1.size(), Num2.size()); i++){
			if(Num1.get(i) - Num2.get(i)- temp == 0){
				NumSub.add(0);
				temp = 0;
			}
			else if(Num1.get(i) - Num2.get(i) - temp == 1){
				NumSub.add(1);
				temp = 0;
			}
			else {
				NumSub.add(1);
				temp = 1;
			}
		}
		return NumSub;
	}
	
}
