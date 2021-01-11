public class Passenger implements Person{
		
		private String name;
		private String phone;
		
		
	public Passenger(){}
	
	
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
}