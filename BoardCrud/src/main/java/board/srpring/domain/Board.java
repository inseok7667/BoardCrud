package board.srpring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity    //jpa가 관리하는 entity , 기본값은 클래스명
@SequenceGenerator (
		name = "BOARD_SEQ_GENERATOR",
	    sequenceName = "BOARD_SEQ",	//매핑할 데이터 베이스 스퀀스 이름
	    initialValue=1, allocationSize=1)
public class Board {

	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "BOARD_SEQ_GENERATOR") // id++ 자동생성
	private int id;
	
	private String title;
	
	private String content;
	
	@Column(name = "cretdt", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP" )
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date date;
	
//	private MultipartFile uploadFile;
//	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
//	public MultipartFile getUploadFile() {
//		return uploadFile;
//	}
//	public void setUploadFile(MultipartFile uploadFile) {
//		this.uploadFile = uploadFile;
//	}
	
	
	

}
