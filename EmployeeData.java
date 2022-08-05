package DevOpsMilestone2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.JSeparator;
import javax.swing.JToolBar.Separator;

public class EmployeeData {

	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(10,23,77000,"Prasad"));
		list.add(new Employee(11,24,67000,"Sandhya"));
		list.add(new Employee(12,25,58000,"Mohan"));
		list.add(new Employee(13,26,47000,"Saritha"));
		list.add(new Employee(14,27,59000,"Nagesh"));
		list.add(new Employee(15,28,66000,"Prakash"));
		list.add(new Employee(16,29,63000,"Vamshi"));
		list.add(new Employee(17,30,61000,"Sushmitha"));
		list.add(new Employee(18,31,55000,"Pavithra"));
		list.add(new Employee(19,35,44000,"Vinod"));
		
		
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1)Display the data");
			System.out.println("2)Display the all the employee in ascending order of their name");
			System.out.println("3)update the employee age by their id");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				for(Employee e :list) {
					System.out.println(e);
				}
				break;
			case 2:
				List<Employee> l1 = new ArrayList<Employee>();
				Collections.sort(l1,new NameComparator());
				for(Employee e1:l1) {
					System.out.println(e1);
				}
				break;
			case 3:
				boolean found = false;
				System.out.println("enter the emplpoyee id for their purchase amount update");
				int id1=sc.nextInt();
				ListIterator<Employee> l2 =list.listIterator();
				while(l2.hasNext()) {
					Employee e5=l2.next();
					if(e5.getId()==id1) {
						System.out.println("enter the age");
						int age = sc.nextInt();
						System.out.println("enter the purchaseamount of emp");
						int amountpurchase=sc.nextInt();
						System.out.println("enter the name of emp");
						String name = sc.next();
						l2.set(new Employee(id1,age,amountpurchase, name));
						found= true;
						
					}
					if(!found)
						System.out.println("emp not found in the list");
					else
						System.out.println("upadate is sucessful");
				}
			}
			
			
			
		}while(ch!=0);
			
		
		
		
		

	}

}
