package verify;

import java.util.Scanner;

public class Gugudan_ {

	public static void main(String[] args) {
		
		for(int dan=2; dan <=9; dan++) {
			System.out.print("["+dan+"단]"+"\t");
		}
		System.out.println();
		
		for(int i=1; i<=9 ; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf(j+"*"+i+"="+"%d"+"\t",j*i);
			}
			System.out.println();
		}
		
		
		
		

	}

}
