package day15;

import java.util.Objects;

public class StudentMapDTO {

	private long id;
	private String studentNumber;
	private String studentName;
	private String studentMajor;
	private String studentMobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	@Override
	public String toString() {
		String str = id + "\t" + studentNumber + "\t" + studentName + "\t" + studentMajor + "\t" + studentMobile;
//		
		return str;
	}

	// 두 객체의 필드값이 모두 일치 하는지 판단 하려면 아래처럼 hashCode(), equals(Object obj)
	@Override
	public int hashCode() {
		return Objects.hash(id, studentMajor, studentMobile, studentName, studentNumber);
	}
// 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMapDTO other = (StudentMapDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(studentMajor, other.studentMajor)
				&& Objects.equals(studentMobile, other.studentMobile) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentNumber, other.studentNumber);
	}

}
