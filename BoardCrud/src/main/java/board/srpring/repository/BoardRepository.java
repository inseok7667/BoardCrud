package board.srpring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import board.srpring.domain.Board;

@Repository
public interface BoardRepository {
	
	public List<Board> getBoardList();
	
	public void boardSave(Board board);
	
	public void boardDelete(Board board);
	
	public void boardFileSave(Board board , MultipartFile uploadFile);

}
