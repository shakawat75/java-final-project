import java.util.InputMismatchException;
import java.util.Scanner;
public class RootClass{
	public static void main(String args[]){
	
		Time time0 = new Time("8.00 AM");
		
		Time time1 = new Time("9.00 AM");
		
	    Time time2 = new Time("11.00 AM");
		
		Time time3 = new Time("12.00 PM");
		
		Time time4 = new Time("2.00 PM");
		
	    Time time5 = new Time("5.00 PM");
		
		Time time6 = new Time("12.00 AM");
		
		Seat A1 = new Seat("A1");
		Seat A2 = new Seat("A2");
		Seat B1 = new Seat("B1");
		Seat B2 = new Seat("B2");
		Seat C1 = new Seat("C1");
		Seat C2 = new Seat("C2");
		Seat D1 = new Seat("D1");
		Seat D2 = new Seat("D2");
		Seat E1 = new Seat("E1");
		Seat E2 = new Seat("E2");
		Seat F1 = new Seat("F1");
		Seat F2 = new Seat("F2");
		
		
		
		
		Pilot p0 = new Pilot("Steve","876387",45,"First Pilot");
		Pilot p1 = new Pilot("Evans","874787",32,"Second Pilot");
		Pilot p2 = new Pilot("James","872737",29,"Third Pilot");
		
		/*p0.PilotDetails();
		p1.PilotDetails();
		p2.PilotDetails();*/
		
		int []displayed_code= new int[]{0,0,0,0,0};
		int tracer = 0;
		
		
		Flight flight[] = new Flight[10];

		
		
		
		flight[0] = new Flight(100,"Boeing-787","New York","Ohio","20/09/20");
	    flight[0].setPilot(p0);
		flight[0].setPilot(p1);
		flight[0].setPilot(p2);
		
		flight[0].FlightTime(time0);
		flight[0].FlightTime(time3);
		flight[0].FlightTime(time5);
		
		flight[0].setSeat(A1);
		flight[0].setSeat(A2);
		flight[0].setSeat(B1);
		flight[0].setSeat(B2);
		flight[0].setSeat(C1);
		flight[0].setSeat(C2);
		flight[0].setSeat(D1);
		flight[0].setSeat(D2);
		flight[0].setSeat(E1);
		flight[0].setSeat(E2);
		flight[0].setSeat(F1);
		flight[0].setSeat(F2);
		
		
		
		flight[1] = new Flight(101,"Airbus A350-900","Florida","Alaska","20/09/20");
	    flight[1].setPilot(p0);
		flight[1].setPilot(p1);
		flight[1].setPilot(p2);
		
		flight[1].FlightTime(time2);
		flight[1].FlightTime(time3);
		flight[1].FlightTime(time4);
		
		flight[1].setSeat(A1);
		flight[1].setSeat(A2);
		flight[1].setSeat(B1);
		flight[1].setSeat(B2);
		flight[1].setSeat(C1);
		flight[1].setSeat(C2);
		flight[1].setSeat(D1);
		flight[1].setSeat(D2);
		flight[1].setSeat(E1);
		flight[1].setSeat(E2);
		flight[1].setSeat(F1);
		flight[1].setSeat(F2);
		
		flight[2] = new Flight(102,"Boeing-787","Alabama","California","21/09/20");
	    flight[2].setPilot(p0);
		flight[2].setPilot(p1);
		flight[2].setPilot(p2);
		
		flight[2].FlightTime(time3);
		flight[2].FlightTime(time4);
		flight[2].FlightTime(time5);
		
		flight[2].setSeat(A1);
		flight[2].setSeat(A2);
		flight[2].setSeat(B1);
		flight[2].setSeat(B2);
		flight[2].setSeat(C1);
		flight[2].setSeat(C2);
		flight[2].setSeat(D1);
		flight[2].setSeat(D2);
		flight[2].setSeat(E1);
		flight[2].setSeat(E2);
		flight[2].setSeat(F1);
		flight[2].setSeat(F2);
		
		flight[3] = new Flight(103,"Pilatus PC-12","New York","Ohio","21/09/20");
	    flight[3].setPilot(p0);
		flight[3].setPilot(p1);
		flight[3].setPilot(p2);
		
		flight[3].FlightTime(time1);
		flight[3].FlightTime(time2);
		flight[3].FlightTime(time6);
		
		flight[3].setSeat(A1);
		flight[3].setSeat(A2);
		flight[3].setSeat(B1);
		flight[3].setSeat(B2);
		flight[3].setSeat(C1);
		flight[3].setSeat(C2);
		flight[3].setSeat(D1);
		flight[3].setSeat(D2);
		flight[3].setSeat(E1);
		flight[3].setSeat(E2);
		flight[3].setSeat(F1);
		flight[3].setSeat(F2);
		
		flight[4] = new Flight(104,"Boeing 777 200","Utah","Virginia","22/09/20");
	    flight[4].setPilot(p0);
		flight[4].setPilot(p1);
		flight[4].setPilot(p2);
	
		flight[4].FlightTime(time4);
		flight[4].FlightTime(time5);
		flight[4].FlightTime(time6);
		
		flight[4].setSeat(A1);
		flight[4].setSeat(A2);
		flight[4].setSeat(B1);
		flight[4].setSeat(B2);
		flight[4].setSeat(C1);
		flight[4].setSeat(C2);
		flight[4].setSeat(D1);
		flight[4].setSeat(D2);
		flight[4].setSeat(E1);
		flight[4].setSeat(E2);
		flight[4].setSeat(F1);
		flight[4].setSeat(F2);
		
		flight[5] = new Flight(105,"Boeing-787","New York","Washington","22/09/20");
	    flight[5].setPilot(p0);
		flight[5].setPilot(p1);
		flight[5].setPilot(p2);
		
		flight[5].FlightTime(time1);
		flight[5].FlightTime(time4);
		flight[5].FlightTime(time6);
		
		flight[5].setSeat(A1);
		flight[5].setSeat(A2);
		flight[5].setSeat(B1);
		flight[5].setSeat(B2);
		flight[5].setSeat(C1);
		flight[5].setSeat(C2);
		flight[5].setSeat(D1);
		flight[5].setSeat(D2);
		flight[5].setSeat(E1);
		flight[5].setSeat(E2);
		flight[5].setSeat(F1);
		flight[5].setSeat(F2);
		
		flight[6] = new Flight(106,"Airbus A380 700","Texas","Indiana","23/09/20");
	    flight[6].setPilot(p0);
		flight[6].setPilot(p1);
		flight[6].setPilot(p2);
		
		flight[6].FlightTime(time2);
		flight[6].FlightTime(time3);
		flight[6].FlightTime(time6);
		
		flight[6].setSeat(A1);
		flight[6].setSeat(A2);
		flight[6].setSeat(B1);
		flight[6].setSeat(B2);
		flight[6].setSeat(C1);
		flight[6].setSeat(C2);
		flight[6].setSeat(D1);
		flight[6].setSeat(D2);
		flight[6].setSeat(E1);
		flight[6].setSeat(E2);
		flight[6].setSeat(F1);
		flight[6].setSeat(F2);
		
		flight[7] = new Flight(107,"Boeing 747 400","Hawaii","Georgia","23/09/20");
	    flight[7].setPilot(p0);
		flight[7].setPilot(p1);
		flight[7].setPilot(p2);
		
		flight[7].FlightTime(time0);
		flight[7].FlightTime(time4);
		flight[7].FlightTime(time5);
		
		flight[7].setSeat(A1);
		flight[7].setSeat(A2);
		flight[7].setSeat(B1);
		flight[7].setSeat(B2);
		flight[7].setSeat(C1);
		flight[7].setSeat(C2);
		flight[7].setSeat(D1);
		flight[7].setSeat(D2);
		flight[7].setSeat(E1);
		flight[7].setSeat(E2);
		flight[7].setSeat(F1);
		flight[7].setSeat(F2);
		
		//System.out.println(A1.name+A1.status);
		
	   /* flight[0].seat[3].changeSeatStat();
		flight[0].seat[6].changeSeatStat();
		flight[0].seat[9].changeSeatStat();
		System.out.println(flight[0].seat[3].status);*/
		
		
		//flight[0].flightDetails();
		//flight[0].showAvailSeat();
		
		System.out.println("\n" + "                     Welcome   to   Our  Online   Flight   Ticket   purchasing   system   ");
		
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select your journey date by entering the correct value(1-5)");
		System.out.println("1.20/09/20");
		System.out.println("2.21/09/20");
		System.out.println("3.22/09/20");
		System.out.println("4.23/09/20");
		System.out.println("5.24/09/20");
		
		String date = "";
		int d = 0;
		
		try{
		 d = input.nextInt();
		if(d<1 || d>5){
			throw new InputMismatchException();}
		}
		catch(InputMismatchException e){
			System.out.println("Wrong entry!"+"Please try again..");
			
		}
		
		boolean right_date = false;
		
		switch(d){
	case 1:
		date = "20/09/20";
		System.out.println(date);
		right_date = true;
		break;
    case 2:
		date = "21/09/20";
		System.out.println(date);
		right_date = true;
		break;
 	case 3:
  		date = "22/09/20";
		System.out.println(date);
		right_date = true;
		break;
 	case 4:
		date = "23/09/20";
		System.out.println(date);
		right_date = true;
		break;
 	case 5:
		date = "24/09/20";
		System.out.println(date);
		right_date = true;
		break;
	default:
		
		break;
                }
		
	    System.out.println(date);
		
		if(right_date == true){
		System.out.println("Choose your time by entering the valid key(1-7):");
		System.out.println("1. "+time0.time);
		System.out.println("2. "+time1.time);
		System.out.println("3. "+time2.time);
		System.out.println("4. "+time3.time);
		System.out.println("5. "+time4.time);
		System.out.println("6. "+time5.time);
		System.out.println("7. "+time6.time);
		
		
		boolean select_right_time = false;
		boolean counter = false;
		int t=0;
		String test = "";
	try{
		 t = input.nextInt();
		if(t<1 || t>7){
			throw new InputMismatchException();}
		}
		catch(InputMismatchException e){
			System.out.println("Wrong entry!"+"Please try again..");
			
		}
		
		
		
		String tm = "";
		
		if(t==1)
		{tm = time0.time;
		select_right_time = true;}
		else if(t==2)
		{tm = time1.time;
		select_right_time = true;}
		else if(t==3)
		{tm = time2.time;
		select_right_time = true;}
		else if(t==4)
		{tm = time3.time;
		select_right_time = true;}
		else if(t==5)
		{tm = time4.time;
		select_right_time = true;}
		else if(t==6)
		{tm = time5.time;
		select_right_time = true;}
		else if(t==7)
		{tm = time6.time;
		select_right_time = true;}
		
		if(select_right_time == true)
			System.out.println("Available carrier  "+"Destination  "+"Departure  "+"Flight Code  ");
		
		
		switch(t)
		{
			case 1:
             for(int i = 0; flight[i]!=null; i++){
				 if(flight[i].date.equals(date))
				 {
					 for(int j=0; j<3; j++){
						 
					   if(flight[i].time[j].time.equals(time0.time)){
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						   tracer++;
						   
					   }
					   else if(i==7 && j==2 && counter == false){
						   System.out.println("Sorry! no available carrier");
					   break;}
					   
					 }
					 
				 }
				 else if(i == 7 && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;
			 
			case 2:
			 for(int i = 0; flight[i]!=null; i++){
				 if(flight[i].date.equals(date))
				 {
					 for(int j=0; j<3; j++){
						 
					   if(flight[i].time[j].time.equals(time1.time)){
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						   tracer++;
						   
					   }
					   else if(i==7 && j==2 && counter == false){
						   System.out.println("Sorry! no available carrier");
					   break;}
					   
					 }
					 
				 }
				 else if(i==7 && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;

			 
			case 3:
			 for(int i = 0; flight[i]!=null; i++){
				 if(flight[i].date.equals(date))
				 {
					 for(int j=0; j<3; j++){
						 
					   if(flight[i].time[j].time.equals(time2.time)){
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						   tracer++;
						   
					   }
					   else if(i==7 && j==2 && counter == false){
						   System.out.println("Sorry! no available carrier");
					   break;}
					   
					 }
					 
				 }
				 else if(i==7  && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;
			 
			case 4:
			 for(int i = 0; flight[i]!=null; i++){
				 
				 if(flight[i].date.equals(date))
				 { 
					 for(int j=0; j<3; j++){
						// System.out.println(flight[i].time[j].time+"  "+time3.time);
					   if(flight[i].time[j].time.equals(time3.time)){
						   //System.out.println(1);
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						   tracer++;
					   }
					   else if(i==7 && j==2 && counter == false){
						   System.out.println("Sorry no available carrier");
					   break;}
					   
					 }
					 
				 }
				 else if(i==7 && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;
			 
			case 5:
			 for(int i = 0; flight[i]!=null; i++){
				 if(flight[i].date.equals(date))
				 {
					 for(int j=0; j<3; j++){
						 
					   if(flight[i].time[j].time.equals(time4.time)){
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						   tracer++;
					   }
					   else if(i==7 && j==2 && counter == false){
						   System.out.println("Sorry! no available carrier");
					   break;}
					   
					 }
					 
				 }
				 else if(i==7 && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;
			 
			case 6:
			 			 for(int i = 0; flight[i]!=null; i++){
				 if(flight[i].date.equals(date))
				 {
					 for(int j=0; j<3; j++){
						 
					   if(flight[i].time[j].time.equals(time5.time)){
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						   tracer++;
						   
					   }
					   else if(i==7 && j==2 && counter == false){
						   System.out.println("Sorry! no available carrier");
					       break;	}				   
					   
					 }
					 
				 }
				 else if(i==7 && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;
			 
		case 7:
		 for(int i = 0; flight[i]!=null; i++){
				 if(flight[i].date.equals(date))
				 {
					 for(int j=0; j<3; j++){
						 
					   if(flight[i].time[j].time.equals(time6.time)){
						   System.out.println("  "+flight[i].carrier_name+"          "+flight[i].Destination+"      "+flight[i].Departure+"    "+flight[i].carrier_id );
						   counter = true;
						   displayed_code[tracer] = flight[i].carrier_id;
						  // System.out.println(displayed_code[tracer]);
						   tracer++;
						   
						   
					   }
					   else if(i==7 && j==2 && counter == false){
						  System.out.println("Sorry! no available carrier");
					   break;}
					 }
					 
				 }
				 else if(i == 7 && counter==false){
					 System.out.println("Sorry! no available carrier");
					 break;
				 }
				 
			 }
			 
             break;
			 
			default:
					break;
		}
		
		if(counter==true){
		System.out.println("Select your carrier by entering the correct flight code:");
		
		int code = 0;
		boolean right_code = false;
		
		try{
		 code = input.nextInt();
		}catch(InputMismatchException e){System.out.println("Please try again by entering the correct code");}
		for(int k =0; displayed_code[k]!=0;k++){
		if(code==displayed_code[k]){
		right_code = true;
	    break;
		}
		
	   else
			System.out.println("Please try again by entering the correct code");
		}
		//throw new InputMismatchException();}}
		//}
		//catch(InputMismatchException e){
			//System.out.println("Please try again by entering the correct code");
		//}
		
		if(right_code == true){
			int i = 0;
		while(flight[i]!=null){
		if(flight[i].carrier_id==code)
			//flight[i].showAvailSeat();
			break;
			i++;
		}
		flight[i].showAvailSeat();
		//System.out.print(i);
		System.out.println("\n"+"Select the desired seat:");
		int sit = 0;
		boolean valid_seat = true;
		try{
		 sit = input.nextInt();
		if(sit<0 || sit>11){
			valid_seat = false;
			throw new InputMismatchException();}
		}
		catch(InputMismatchException e){
			valid_seat = false;
			System.out.println("Wrong entry!"+"Please try again..");
			
		}
		if(valid_seat == true){
		
		//flight[i].seat[sit].changeSeatStat();
		//flight[i].showAvailSeat();
		
		Passenger p = new Passenger();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		p.setName(name);
		System.out.println("Enter your phone number:");
		String phone = sc.nextLine();
		p.setPhone(phone);
		
		System.out.println("Payable amount: $100");
		System.out.println("1.Pay"+"  0.exit");
		int pay = 0;
		try{
		 pay = input.nextInt();
		}catch(InputMismatchException e){System.out.println("Exiting...");}
			switch(pay){
			case 0:
				break;
			case 1:
			    System.out.println("Payment successful....");
				System.out.println("Thanks for receiving our service... Wish you a good journey");
				break;
			default:
				break;
				
		}
		if(pay == 1){
			flight[i].seat[sit].changeSeatStat();
		System.out.println("Journey details:");
		System.out.print("Passneger name:");p.getName(); System.out.print("Phone:");p.getPhone();
		System.out.println("Journey Date:"+flight[i].date+"         Time:"+tm);
		System.out.println("Destination:"+flight[i].Destination+"   Departure:"+flight[i].Departure);
		System.out.println("Carrier_name:"+flight[i].carrier_name+" Seat:"+flight[i].seat[sit].name);
		}
		
		
		}
		
		
		}
	  }
	 }
		
		 
		
		
		
		
		
	}
  }