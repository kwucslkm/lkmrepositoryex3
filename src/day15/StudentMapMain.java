package day15;

import java.util.HashMap;
import java.util.Map;

public class StudentMapMain {

	public static void main(String[] args) {
		//
		Map<Long, StudentMapDTO> studentmap = new HashMap<>();
		StudentMapDTO studentmapDTO = new StudentMapDTO();
		studentmapDTO.setId(1L);
		studentmapDTO.setStudentNumber("1111");
		studentmapDTO.setStudentName("김자바");
		studentmapDTO.setStudentMajor("컴퓨터공학");
		studentmapDTO.setStudentMobile("010-1111-1111");
		studentmap.put(studentmapDTO.getId(), studentmapDTO);

		StudentMapDTO studentmapDTO1 = new StudentMapDTO();
		studentmapDTO1.setId(2L);
		studentmapDTO1.setStudentNumber("2222");
		studentmapDTO1.setStudentName("이자바");
		studentmapDTO1.setStudentMajor("경영학");
		studentmapDTO1.setStudentMobile("010-1111-1111");
		studentmap.put(studentmapDTO1.getId(), studentmapDTO1);

		StudentMapDTO studentmapDTO2 = new StudentMapDTO();
		studentmapDTO2.setId(3L);
		studentmapDTO2.setStudentNumber("3333");
		studentmapDTO2.setStudentName("박자바");
		studentmapDTO2.setStudentMajor("전자공학");
		studentmapDTO2.setStudentMobile("010-1111-1111");
		studentmap.put(studentmapDTO2.getId(), studentmapDTO2);

		System.out.println("-------------------------------------------------------");
		System.out.println("번호\t학번\t이름\t전공\t전화번호");
		System.out.println("-------------------------------------------------------");
		for (Long st : studentmap.keySet()) {
//			System.out.println(st);
			System.out.println(studentmap.get(st));
			System.out.println(studentmap.get(st).getStudentName());

		}

	}

}
//StudentMapDTO studentmapDTO1 =new  StudentMapDTO();
//studentmapDTO1.id = 2;
//studentmapDTO1.studentNumber = "2222";
//studentmapDTO1.studentName = "이자바";
//studentmapDTO1.studentMajor = "전자공학";
//studentmapDTO1.studentMobile = "010-2222-2222";
//
////System.out.println(studentmap.get(2));
////StudentMapDTO studentmapDTO3 = new StudentMapDTO();
//StudentMapDTO studentmapDTO2 =new  StudentMapDTO();
//studentmapDTO2.id = 3;
//studentmapDTO2.studentNumber = "3333";
//studentmapDTO2.studentName = "박자바";
//studentmapDTO2.studentMajor = "전자공학";
//studentmapDTO2.studentMobile = "010-3333-3333";
//