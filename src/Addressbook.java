
public class Addressbook {

	private String First_name;
	private String Last_name;
	private String Address;
	private String city;
	private String state;
	private String Phoneno;
	private String emailid;
	private int zipcode;
	
public void setFirst_Name(String sname) {
	First_name = sname;
}
public String getFirst_name() {
	return First_name;
}	

public void setLast_name(String sLname) {
	Last_name = sLname;
}
public String getLast_name() {
	return Last_name;
}	
public void setAddress(String sAddress) {
	Address = sAddress;
}
public String getAddress() {
	return Address;
}	
public void setcity(String scity) {
	city = scity;
}
public String getcity() {
	return city;
}	
public void setstate(String sstate) {
	state = sstate;
}
public String getstate() {
	return state;
}	
public void setPhoneno(String sPhoneno) {
	Phoneno = sPhoneno;
}
public String getPhoneno() {
	return Phoneno;
}	
public void setemailid(String semailid) {
	emailid = semailid;
}
public String getemailid() {
	return emailid;
}	
public void setzipcode(int szipcode) {
	zipcode = szipcode;
}
public int getzipcode() {
	return zipcode;
}

	


	 public static void main(String[]args) {
		
		Addressbook myAddressbook = new Addressbook();
		myAddressbook.setFirst_Name( "mrityunjay");
		myAddressbook.setLast_name( "nayak");
		myAddressbook.setAddress( "858 hbur nbugrb");
		myAddressbook.setcity( "bhopal");
		myAddressbook.setPhoneno("987456226");
		myAddressbook.setemailid("jbjbb@jnini.com");
		myAddressbook.setzipcode(456322);
		
		System.out.println("myAddressbook  : "+ myAddressbook.getFirst_name()+ " "+ myAddressbook.getLast_name()+" "+myAddressbook.getAddress()+" "+ 
				myAddressbook.getcity()+" " + myAddressbook.getPhoneno()+"  "+ myAddressbook.getemailid()+" "+ myAddressbook.getzipcode() );
		
	}
}
