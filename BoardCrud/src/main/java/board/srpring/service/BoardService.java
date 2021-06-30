package board.srpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import board.srpring.domain.Board;
import board.srpring.repository.BoardRepository;

@Service
@Transactional
public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;
	
	public List<Board> getBoardList(){
		
		List<Board> result = boardRepository.getBoardList();
		return result;
	}
	
	public void BoardSave(Board board) {
		boardRepository.boardSave(board);
		
	}
	
	public void BoardDelete(Board board) {
		boardRepository.boardDelete(board);
	}
	public void BoardFileSave(Board board,MultipartFile uploadFile) {
		System.out.println("BoardFileSave 수행");
		boardRepository.boardFileSave(board, uploadFile);
		
	}

}
