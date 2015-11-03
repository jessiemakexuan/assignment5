package person;

/*Design a Person class implements Comparable interface. 
 *In the Person class, you should have at least firstName and lastName attributes, 
 *getters/setters about them, override compareTo(), equals(), hashCode(), toString() functions based on them.*/
public class Person implements Comparable<Object>{
	private String firstName;
	private String lastName;
	private int age;
	
	//constructors
	public Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	//overloading
	public Person() {
		
	}

	public String getfirstName(){
		return firstName;
	}
	public void setfirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getlastName(){
		return lastName;
	}
	public void setlastName(String lastName){
		this.lastName=lastName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o){
		Person p=(Person) o;
		return this==p;
	}
	
	@Override
	public int hashCode(){  
		return (firstName.hashCode()+lastName.hashCode());
	}
	
	@Override
	public int compareTo(Object o) {
		Person p=(Person) o;
		String thisName=this.firstName+" "+this.lastName;
		String pName=p.firstName+" "+p.lastName;
		if(thisName.compareTo(pName)>0){
			return 1;
		}else if(thisName.compareTo(pName)==0){
			return 0;
		}else{
			return -1;
		}
	}
	
	@Override
	public String toString(){
		return "Name:"+firstName+" "+lastName;
	}



	

}
