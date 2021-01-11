public class Pilot implements Person{
	
	public String name;
	public String phone;
	int age;
	String rank;
	public Pilot(){}
	public Pilot(String name, String phone, int age, String rank){
			this.name = name;
			this.phone = phone;
			this.age = age;
			this.rank = rank;
	}
	
	
	public void setName(String name){
		this.name = name;
		}
	public void setPhone(String phone){
		this.phone = phone;
		}
	public void getName(){
		System.out.println(name);
		}
	public void getPhone(){
		System.out.println(phone);
		}
	public void PilotDetails(){
		System.out.println(name);
		System.out.println(phone);
        System.out.println(age);
		System.out.println(rank+'\n');		
		}
	}