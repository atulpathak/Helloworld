import java.util.*; 
public class EmployeeDetails {

	
		public static void main(String[] args)
		{
		Employee [] arr=new Employee[1];
		
		

		for(int i=0;i<arr.length;i++)
		{
			
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the Name:");
			String name=scn.next();
			System.out.println("Enter the Age:");
			byte age=scn.nextByte();
			
			arr[i]=new Employee(name,age);
			System.out.println("How many address:");
			int noAdd=scn.nextInt();
			Address []addr=new Address[noAdd];
			arr[i].setAddress(addr);
			
					
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("name="+arr[i].getName()+"age="+arr[i].getAge());
			Address []address=arr[i].getAddress();
			for(int j=0;j<address.length;j++)
			System.out.println("city="+address[j].getCity().getName()+"country="+address[j].getCity().getCountry().getName());	
		}
	}
  }
	


	

		




