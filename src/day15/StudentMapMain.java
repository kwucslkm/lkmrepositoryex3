package day15;

import java.util.HashMap;
import java.util.Map;

public class StudentMapMain {

	public static void main(String[] args) {
		// 
		Map<Integer, StudentMapDTO> studentmap = new HashMap<>();
		StudentMapDTO studentmapDTO =new  StudentMapDTO();
		studentmapDTO.id=1;
		studentmapDTO.studentNumber="1111";
		studentmapDTO.studentName="김자바";
		studentmapDTO.studentMajor="컴퓨터공학";
		studentmapDTO.studentMobile="010-1111-1111";
		
		studentmap.put(1, studentmapDTO);
		StudentMapDTO studentmapDTO1 =new  StudentMapDTO();
		studentmapDTO1.id = 2;
		studentmapDTO1.studentNumber = "2222";
		studentmapDTO1.studentName = "이자바";
		studentmapDTO1.studentMajor = "경영학";
		studentmapDTO1.studentMobile = "010-2222-2222";
		studentmap.put(2, studentmapDTO1);
//		System.out.println(studentmap.get(2));
//		StudentMapDTO studentmapDTO3 = new StudentMapDTO();
		StudentMapDTO studentmapDTO2 =new  StudentMapDTO();
		studentmapDTO2.id = 3;
		studentmapDTO2.studentNumber = "3333";
		studentmapDTO2.studentName = "박자바";
		studentmapDTO2.studentMajor = "전자공학";
		studentmapDTO2.studentMobile = "010-3333-3333";
		
		studentmap.put(3,studentmapDTO2);
//		System.out.println(studentmap.get(3));
		System.out.println("-------------------------------------------------------");
		System.out.println("번호\t학번\t이름\t전공\t전화번호");
		System.out.println("-------------------------------------------------------");
		for (Integer st : studentmap.keySet()) {
			System.out.println(st);
			System.out.println(studentmap.get(st));
//			System.out.println(studentmap.get(st).toString());

		}

	}

}
