public class Flight { 

	public int carrier_id;
	public String carrier_name;
	public Pilot pilot[];
	public Time time[];
	public Seat seat[];
	public String Departure;
	public String Destination;
	public String date;
	
	
    
	
	
	public void setPilot(Pilot p){
		for(int i = 0; i< this.pilot.length; i++){
			if(this.pilot[i]==null){
				this.pilot[i] = p;
			    break;
				}
			}
	}
	
	public void FlightTime(Time tm){
		for(int i = 0; i< this.time.length; i++){
			if(this.time[i]==null){
				this.time[i] = tm;
			break;}
	}
  }
	
	public void flightDetails(){
		System.out.println(carrier_id);
		System.out.println(carrier_name);
		System.out.println(Departure);
		System.out.println(Destination);
		System.out.println(date);
		for(int j = 0;j < this.pilot.length; j++)
			System.out.println(pilot[j].name + '\n');
		for(int j = 0;j < this.time.length; j++)
			time[j].showTime() ;
		
		}
		
	public Flight(){}
	
	public Flight(int carrier_id, String carrier_name,String departure,String destination,String date){
		this.carrier_id = carrier_id;
		this.carrier_name = carrier_name;
		this.Departure = departure;
		this.Destination = destination;
		this.date = date;
		this.pilot = new Pilot[3];
		this.time = new Time[3];
		this.seat = new Seat[12];
	}
	
	public void setSeat(Seat s){
		for(int i = 0; i<this.seat.length;i++){
			if(this.seat[i]==null){
				this.seat[i] = s;
			     break;
			}
		}
	}
	
	public void showAvailSeat(){
	     for(int i = 0; i< this.seat.length; i++){
			 if(seat[i].status =="Available")
			 System.out.print(i+":"+seat[i].name+"  ");
			}
	}
 
	
}
		
		
		
		
		
		
		