package day2_programs;

public class Customer {
	private int cid;
	private String c_name;
	private String Address;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String toString()
	{
		return "c_id:"+cid+"c_name"+c_name+"Addresss"+Address;
	}

}
