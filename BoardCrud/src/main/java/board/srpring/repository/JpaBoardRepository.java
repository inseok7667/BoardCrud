package board.srpring.repository;

import java.io.File;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import board.srpring.domain.Board;
import board.srpring.domain.FileDTO;
import board.srpring.util.MD5Generator;

@Repository
public class JpaBoardRepository implements BoardRepository{

private final EntityManager em;   //jpa는 entity매니저를 통해 모든게 동작한다.
	
	public JpaBoardRepository(EntityManager em) {
		this.em = em;
	}
	
	
	@Override
	public List<Board> getBoardList() {
		List<Board> result = em.createQuery("select m from Board m" , Board.class)
				.getResultList();
		
		System.out.println("jpa result = " + result);
		return result;
	}


	@Override
	public void boardSave(Board board) {
		em.persist(board);
		
	}


	@Override
	public void boardDelete(Board board) {
		Query query = em.createQuery("delete from Board m where m.id = :id ");
		query.setParameter("id", board.getId());
		query.executeUpdate();
		
	}


	@Override
	public void boardFileSave(Board board, MultipartFile uploadFile) {
		 FileDTO filedto = new FileDTO();
		em.persist(board);	
		try {
			System.out.println("try catch 진입.");
			String orignfile = uploadFile.getOriginalFilename();
	        String filename = new MD5Generator(orignfile).toString();
	        /* 실행되는 위치의 'files' 폴더에 파일이 저장됩니다. */
	        String filepath = System.getProperty("user.dir") + "\\files";
	        if (!new File(filepath).exists()) {
                try{
                    new File(filepath).mkdir();
                }
                catch(Exception e){
                    e.getStackTrace();
                }
            }
	        String savepath = filepath + "\\" + filename;
            uploadFile.transferTo(new File(savepath));
	       
	        filedto.setId(board.getId());
	        filedto.setFilename(filename);
	        filedto.setFilepath(filepath);
	        filedto.setOrignfile(orignfile);
	        em.persist(filedto);
		}catch(Exception e){
			e.printStackTrace();
        }
		
		
		
		
		
	}





	
	
	

}
