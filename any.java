package jeonggeun.spring.all;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class any {
	public void add(UserVO user)throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/XEPDB1","mytest","mytest");
		PreparedStatment ps = c.prepareStatment(
				"insert into myuser(id,name,pass) values(???)");
		ps.setString(1,user.getId());
		ps.setString(2,user.getName());
		ps.setString(3,user.getPass());
		ps.executeUpdate();
		ps.close();
		c.close();
	}
	public UserVO get(String id) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/XEPDB1","mytest","mytest");
		PreparedStatment ps = c
				.prepareStatment("select * from myuser where id =?");
		ps.setString(1,id);
		ResultSet rs = ps.executeQuery();
		re.next();
		UserVO user = new UserVO();
		User.setId(rs.getString("id"));
		User.setName(rs.getString("name"));
		User.setpass(rs.getString("pass"));
		rs.close();
		ps.close();
		c.close();
		return user;
				
	}

}
*/