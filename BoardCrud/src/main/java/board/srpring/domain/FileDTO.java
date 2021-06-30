package board.srpring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    //jpa가 관리하는 entity , 기본값은 클래스명
@Table(name = "boardfile")
public class FileDTO {
	
	@Id
	@Column(name = "fileid")
	private int id ; 

	private String filename;
	
	private String orignfile;
	
	private String filepath;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getOrignfile() {
		return orignfile;
	}

	public void setOrignfile(String orignfile) {
		this.orignfile = orignfile;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	

}
