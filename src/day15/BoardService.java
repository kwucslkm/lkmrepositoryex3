package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BoardService {
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void testData() {
		//
		for (int i = 1; i < 6; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + i);
			boardDTO.setWriter("writer" + i);
			br.save(boardDTO);

		}
	}
	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		boolean success = br.save(boardDTO);// boolean return 값을 받아 성공 여부를 담는다.
		if (success) {
			System.out.println("게시글 등록완료!");
		} else {
			System.out.println("게시글 등록실패ㅜ");
		}
	}
	public void findAll() {
		Map<String, BoardDTO> mapall = br.findAll();
//		List<String> keySet = new ArrayList<>(mapall.keySet());
		System.out.println("==Key 값 기준으로 오름차순 정렬==");
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("--------------------------------------");
		List<String> keys = new ArrayList<>(mapall.keySet());
		Collections.sort(keys);
		for (String key : keys) {
			System.out.println(String.format( " %s", mapall.get(key)));
		}
	}
	public void searchWriter() {
		//
		System.out.print("검색 writer> ");
		String writer = sc.next();
		
		Map<String, BoardDTO> boardDTO = br.findById(writer, 2);
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("--------------------------------------");
		List<String> keys = new ArrayList<>(boardDTO.keySet());
		Collections.sort(keys);
		for (String key : keys) {
//			boardDTO.get(key).increaseCnt();
			System.out.println(String.format( " %s", boardDTO.get(key)));
		}
		
	}
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		Map<String, BoardDTO> boardDTO = br.findById(bno, 1);
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("--------------------------------------");
		if (boardDTO == null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			for (String k : boardDTO.keySet()) {
				boardDTO.get(k).increaseCnt();
				System.out.println(boardDTO.get(k));
			}
		}
	}
	public void update() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next();
		sc.nextLine();
		Map<String, BoardDTO> b = br.findById(bno, 1);
		if (b == null) {
			System.out.println("조회할 수 없는 글번호 입니다");
		} else {
//			BoardDTO boardDTO = new BoardDTO();
			
			for(String bkey : b.keySet()) {
				System.out.print("수정할 제목> ");
				b.get(bkey).setTitle(sc.nextLine());
				System.out.print("수정할 작성자> ");
				b.get(bkey).setWriter(sc.next());
				sc.nextLine();
				if (br.update(b.get(bkey), bno)) {
					System.out.println("업데이트 성공");
				} else {
					System.out.println("업데이트 실패");
				}
			}
						
			
		}
	}
	public void delete() {
		System.out.print("삭제할 글번호> ");
		String bno = sc.next();
		sc.nextLine();
		if (br.delete(bno)) {
			System.out.println("삭제완료");
		} else {
			System.out.println("삭제실패");
		}
	}

}
//	keys.sort(Collections.reverseOrder());
//
//	System.out.println("==Key 값 기준으로 내림차순 정렬==");
//	for (String key : keys) {
//		System.out.println(String.format("Key : %s, Value : %s", key, mapall.get(key)));
//	}

//	System.out.println(mapall);

//	for (Map<String, BoardDTO> b : list) {
////		mapall.get(b).print();
////		System.out.println(b);
//		System.out.println(b.toString());

//	for (String b : mapall.keySet()) {
////		mapall.get(b).print();
////		System.out.println(b);
//		System.out.println(mapall.get(b));
//	}
//}