package datatype01;

public class Question1 {

	public static void main(String[] args) {
		int Hkor=95, Heng=70, Hmath=90;
		int Kkor=90, Keng=85, Kmath=80;
		int Pkor=85, Peng=98, Pmath=97;
				
		System.out.println("==========================================");
		System.out.printf("%-6s%-6s%-6s%-6s%-10s%-8s\n","name","kor","math","eng","total","avg");
		System.out.println("==========================================");
		System.out.printf("%-6s%-6d%-6d%-6d%-8d%3.2f\n","HONG",Hkor,Hmath,Heng,(Hkor+Hmath+Heng),(double)(Hkor+Hmath+Heng)/3);
		System.out.printf("%-6s%-6d%-6d%-6d%-8d%3.2f\n","KIM",Kkor,Kmath,Keng,(Kkor+Kmath+Keng),(double)(Kkor+Kmath+Keng)/3);
		System.out.printf("%-6s%-6d%-6d%-6d%-8d%3.2f\n","PARK",Pkor,Pmath,Peng,(Pkor+Pmath+Peng),(double)(Pkor+Pmath+Peng)/3);
		//System.out.printf("%-10d%-12d%-10d%d%n",kor,eng,math,(kor+eng+math)/3);

	}

}
 