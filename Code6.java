import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int regdNo;
	Student(String n,int r){
		this.name=n;
		this.regdNo=r;
	}	
}

public class Code6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Want to Add Student? press y/n: ");
		char n=sc.next().charAt(0);
		ArrayList<Student> al=new ArrayList<>();
		while(n=='y') {
			System.out.println("Enter Name and regd No: ");
			al.add(new Student(sc.next(),sc.nextInt()));
			System.out.print("Want to Add Student? press y/n: ");
			n=sc.next().charAt(0);
		}
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).name+" "+al.get(i).regdNo);
		}
		
	}

}
