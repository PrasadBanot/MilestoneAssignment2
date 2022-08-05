package DevOpsMilestone2;

public class Employee {
private int id;
private int age;
private int amountpurchase;
private String name;
public Employee(int id,int age,int purchaseamount, String name) {
	super();
	this.id = id;
	this.age = age;
	this.amountpurchase = amountpurchase;
	this.name = name;
}
public int getId() {
	return id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getamountpurchase() {
	return amountpurchase;
}
public void getamountpurchase(int amountpurchase) {
	this.amountpurchase= amountpurchase;

}
public void  setName(String Name) {
	this.name = name;
}
   
public String toString() {
	return "Employee[id=" +id + ",age=" +age+",amountpurchase=" + amountpurchase+",name=" + name+"]";
}
}