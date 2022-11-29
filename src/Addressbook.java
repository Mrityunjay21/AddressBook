
public class Addressbook {

	private String First_name;
	private String Last_name;
	private String Address;
	private String city;
	private String state;
	private String Phoneno;
	private String emailid;
	private int zipcode;
	
public void setFirstName(String pname) {
	First_name = pname;
}
public String getFirst_name() {
	return First_name;
}	

public void setLast_name(String psname) {
	Last_name = psname;
}
public String Last_name() {
	return Last_name;
}	
public void setAddress(String pAddress) {
	Address = pAddress;
}
public String getAddress() {
	return Address;
}	
public void setcity(String pcity) {
	First_name = pcity;
}
public String getcity() {
	return city;
}	
public void setstate(String pstate) {
	state = pstate;
}
public String getstate() {
	return state;
}	
public void setPhoneno(String pPhoneno) {
	Phoneno = pPhoneno;
}
public String getPhoneno() {
	return Phoneno;
}	
public void setemailid(String pemailid) {
	emailid = pemailid;
}
public String getemailid() {
	return emailid;
}	
public void setzipcode(int pzipcode) {
	zipcode = pzipcode;
}
public int getzipcode() {
	return zipcode;
}


	public static void main(String[]args) {
		
		Addressbook mynewContent = new Addressbook();
		Addressbook.setFirst_name(pname: "mrityunjay");
		Addressbook.setLast_name(psname: "nayak");
		Addressbook.setAddress(pAddress: "858 hbur nbugrb");
		Addressbook.setcity(pcity: "bhopal");
		Addressbook.Phoneno(pPhoneno:"987456226");
		Addressbook.setemailid(pemailid:"jbjbb@jnini.com");
		Addressbook.setzipcode(pzipcode:"456322");
		
		System.out.println("Address : "+ Address.getFirst_Name);
		
	}
}
