package jeonggeun.spring.web.common;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import jeonggeun.spring.web.board.BoardVO;
import jeonggeun.spring.web.common.JDBCUtil;
@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private final String BOARD_INSERT = "insert into myboard(seq,title,writer,content)"
	+"values((select nvl(max(seq),0)+1 from myboard),?,?,?)";
	private final String BOARD_UPDATE = "update myboard set title=?,"+"content=? where seq=?";
	private final String BOARD_DELETE = "delete myboard where seq=?";
	private final String BOARD_GET = "select * from myboard where seq=?";
	private final String BOARD_LIST = "select * from myboard order by seq desc";
	public void insertBoard(BoardVO vo) {
		System.out.println("JDBC로 insertBoard()기능 처리");
		try {
				conn = JDBCUtil.getConnection();
				pstmt = conn.prepareStatement(BOARD_INSERT);
				pstmt.setString(1,vo.getTitle());
				pstmt.setString(2,vo.getWriter());
				pstmt.setString(3, vo.getContent());
				pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	public void updateBoard(BoardVO vo) {
		System.out.println("JDBC로 updateBoard() 기능 처리");
		try {
				conn = JDBCUtil.getConnection();
				pstmt = conn.prepareStatement(BOARD_UPDATE);
				pstmt.setString(1,vo.getTitle());
				pstmt.setString(2, vo.getContent());
				pstmt.setInt(3, vo.getSeq());
				pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	public void 
}
