package day15;

public class StudentMapDTO {


	public int id;
	public String studentNumber;
	public String studentName;
	public String studentMajor;
	public String studentMobile;

	
	@Override
	public String toString() {
		String str = id + "\t" + studentNumber + "\t" + studentName + "\t" + studentMajor + "\t" + studentMobile;
//		
		return str;
	}

}
