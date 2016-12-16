package test01_transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
 
public class Test {
    // * JDBC �۾� �Ŵ���
    // 1. ����̹� �ε�
    // 2. Ŀ�ؼ� ����
    // 3. SQL �ۼ�
    // 4. PreparedStatement ����
    // 5. ���� ����
    // 6. ����� �ڵ鸵
    // 7. �ڿ��ݳ�
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        String sql = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
 
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/spring", "root", "sds902");
            con.setAutoCommit(false); // Ʈ����� ����
             
            sql = "update product set quantity=quantity-1 " 
            + "where product_num=2";
 
            pstmt1 = con.prepareStatement(sql);
            int result = pstmt1.executeUpdate();
 
            System.out.println("���� ���Ұ��:" + result);
 
            if(new Random().nextBoolean()){
                throw new SQLException("���α׷� �ߴܵ�!!");
            }
             
            sql = "insert into sale" + "(product_num,sale_date,buyer,sale_count)" 
            + "values(?,?,?,?)";
            pstmt2 = con.prepareStatement(sql);
 
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(now);
 
            pstmt2.setInt(1, 2); // 2�� ��ǰ �Ǹ���
            pstmt2.setString(2, currentTime);
            pstmt2.setString(3, "Yangyu"); // ������
            pstmt2.setInt(4, 1); // �Ǹż��� 1
 
            result = pstmt2.executeUpdate();

           
            System.out.println("�Ǹ����� ��� ���:" + result);
            con.commit(); // Ʈ����� �Ϸ� Ŀ��
       
        
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            con.rollback(); // ����� ���� ��ҽ�Ű��
            System.out.println("SQL ���� �߻�");
            e.printStackTrace();
        }
 
    }
}
