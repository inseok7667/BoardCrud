package board.srpring.controller;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;

import board.srpring.domain.Board;
//import board.srpring.domain.FileM;
import board.srpring.service.BoardService;


@RequestMapping
@Controller
public class BoardController { 
	
	private static final Logger LOGGER = LogManager.getLogger(BoardController.class);
	
	@Autowired
	BoardService boardService;
	
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/board")
	@ResponseBody
	public List<Board> boardApi() {
		
		System.out.println("boardapi");
		List<Board> getList = boardService.getBoardList();
		return getList;
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/board/save")
	@ResponseBody
	public void boardSave(@RequestParam("title")String title , @RequestParam("content") String content , @RequestParam(required = false) MultipartFile uploadFile) {	
		
		Board board = new Board();
		board.setTitle(title);
		board.setContent(content);
	
		if(uploadFile != null) {
			boardService.BoardFileSave(board,uploadFile);
		}else{
			boardService.BoardSave(board);
		}

	}

	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value = "/board/detail/delete")
	@ResponseBody
	public void boardDelete(@RequestBody Board board) {
		boardService.BoardDelete(board);
	}

}
