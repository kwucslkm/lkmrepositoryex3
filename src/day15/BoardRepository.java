package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepository {
//	private List<BoardDTO> list = new ArrayList<>();
	private Map<String, BoardDTO> mapr = new HashMap<>();

	public boolean save(BoardDTO boardDTO) {
		boolean a = true;
		if (boardDTO != null) {
			mapr.put(boardDTO.getBno(), boardDTO);
		} else {
			a = false;
			System.out.println("null chk~");
		}
		return a;

//		boolean a = list.add(boardDTO); 
//		return a;
	}

	public Map<String, BoardDTO> findAll() {

		return mapr;
	}

	public Map<String, BoardDTO> findById(String bno, int chksearch) {
		Map<String, BoardDTO> mapf = new HashMap<>();
		if (chksearch == 1) {
			for (String b : mapr.keySet()) {
				if (mapr.get(b).getBno().equals(bno)) {
					mapf.put(b, mapr.get(b));
					return mapf;
				}
			}
		} else {
			for (String b : mapr.keySet()) {
				if (mapr.get(b).getWriter().equals(bno)) {
					mapf.put(b, mapr.get(b));
				}
			}
			return mapf;
		}

		return null;
	}

	public boolean update(BoardDTO boardDTO, String bno) {
		for (String b : mapr.keySet()) {
			if (mapr.get(b).getBno().equals(bno)) {
				mapr.get(b).setTitle(boardDTO.getTitle());
				mapr.get(b).setWriter(boardDTO.getWriter());
//				b.setTitle(boardDTO.getTitle());
//				b.setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}

	public boolean delete(String bno) {
		for (String b : mapr.keySet()) {
			if (mapr.get(b).getBno().equals(bno)) {
				mapr.remove(b);
				return true;
			}
		}
		return false;
	}

}
//
//private List<BoardDTO> list = new ArrayList<>();
//private Map<Long, BoardDTO> mapR = new HashMap<>();
//
//
//public boolean save(BoardDTO boardDTO) {
//	boolean a = list.add(null); 
//	return a;
//}
//
//public List<BoardDTO> findAll(){
//	return list;
//}
//public BoardDTO findById(String bno) {
//	for(BoardDTO b : list) {
//		if(b.getBno().equals(bno)) {
//			return b;
//		}
//	}
//	return null;
//}
//public boolean update(BoardDTO boardDTO, String bno) {
//	for(BoardDTO b : list) {
//		if(b.getBno().equals(bno)) {
//			b.setTitle(boardDTO.getTitle());
//			b.setWriter(boardDTO.getWriter());
//			return true;
//		}
//	}
//	return false;
//}
//public boolean delete(String bno) {
//	for(BoardDTO b : list) {
//		if(b.getBno().equals(bno)) {
//			list.remove(b);
//			return true;
//		}
//	}
//	return false;
//}
//
//
//
