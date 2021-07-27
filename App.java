package Day1;

public class App {
	static void scenario1()
	{
		Student stu1=new Student();
		stu1.setId(101);
		stu1.setName("Dinesh");
		stu1.setDateOfBirth("12-01;1980");
		Student.collegeName="IIT Kanpur";
		Info in=new Info();
		in.display(stu1);
		Student stu2=new Student(102, "Utkarsh", "23-01-1999");
		in.display(stu2);
		
	}
	
	static void scenario2()
	{
		Student stu[]=new Student[3];
		stu[0]=new Student();
		stu[0].setId(201);
		stu[0].setName("Rajesh");
		stu[0].setDateOfBirth("01-01-1990");
		Info in=new Info();
		stu[1]=new Student(202,"Suraj","23-11-1997");
		stu[2]=new Student();
		stu[2].setId(203);
		stu[2].setName("Ahmed");
		stu[2].setDateOfBirth("28-07-2000");
		for(Student x:stu) {
			in.display(x);
		}
	}
	
	public static void main(String[] args) 
	{
		scenario1();
		scenario2();
	}

}
