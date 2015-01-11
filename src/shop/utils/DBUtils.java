/**
 * 
 */
package shop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ctd
 *
 */
public class DBUtils {


	
	private static final String CONN_STR="jdbc:mysql://root:3306/db_supershop";
	private static final String USERNAME="root";
	private static final String PWD="123456";
		
	private static DBUtils me=new DBUtils();
	
	private DBUtils() {}
	
	public static DBUtils getInstance()
	{
		return me;
	}

    /**
     * 获得连接。
     * @return
     */
    public Connection getConn()
    {

        Connection conn=null;

        try {
            Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");
            conn = DriverManager.getConnection("proxool.supershop-ds");
//			Class.forName("com.mysql.jdbc.Driver");
//			conn=DriverManager.getConnection(CONN_STR, USERNAME, PWD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    /**
     * 释放连接。
     * 
     * @param conn
     * @param pstmt
     * @param rset
     */
    public void ReleaseRes(Connection conn,PreparedStatement pstmt,ResultSet rset)
    {
        try{
            if(rset!=null) rset.close();
            if(pstmt!=null) pstmt.close();
            if(conn!=null)  conn.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

