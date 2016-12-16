package test01_transaction2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductDAO {

	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/spring";
	private static final String DB_ID = "root";
	private static final String DB_PW = "sds902";

	private Connection con = null;

	////////////////////////////////////////////////////////

	// ����̹� jar ���� �ε��� �����ڿ��� 1���� ����.
	public ProductDAO() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}

	public void startTransaction() {
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);// Ŀ�ؼ� ����
			con.setAutoCommit(false);// Ʈ����� ����
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			e.printStackTrace();
		}
	}

	public void commitTransaction() {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("Ŀ�� ����");
			e.printStackTrace();
		}
	}

	public void rollbackTransaction() {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("�ѹ� ����");
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Ŀ�ؼ� ���� ����");
				e.printStackTrace();
			}
		}
	}

	////////////////////////////////////////////////////////
	public int updateProductQuantity(int productNum, int quantity) {
		PreparedStatement pstmt = null;
		int result = 0;

		String sql = "update product set quantity=quantity-? " + "where product_num=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, quantity);
            pstmt.setInt(2, productNum);
            result = pstmt.executeUpdate();  
		
		} catch (SQLException e) {
			System.out.println("updateProductQuantity ����");
			e.printStackTrace();
		}
		return result;
	}

	public int insertSaleRecord(int productNum,Date saleDate,
            String buyer,int saleCount) {
		 {
		        PreparedStatement pstmt = null;
		        int result = 0;
		        try {
		            String sql = "insert into sale" + 
		            "(product_num,sale_date,buyer,sale_count)" + 
		            "values(?,?,?,?)";
		 
		            pstmt = con.prepareStatement(sql);
		             
		            SimpleDateFormat sdf = 
		                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		            String currentTime = sdf.format(saleDate);
		             
		            pstmt.setInt(1, productNum); // ��ǰ ��ȣ
		            pstmt.setString(2, currentTime);
		            pstmt.setString(3, buyer); // ������
		            pstmt.setInt(4, saleCount); // �Ǹż��� 
		            result = pstmt.executeUpdate();
		        } catch (SQLException e) {
		            System.out.println("insertSaleRecord ����");
		            e.printStackTrace();
		        }
		        return result;
		    }

	}

}