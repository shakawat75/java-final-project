public class Seat{
	public String name;
	public String status =  "Available";
	public Seat(String sn){
	 this.name = sn;
	}
	public void changeSeatStat(){
		this.status = "Booked";
	}
}