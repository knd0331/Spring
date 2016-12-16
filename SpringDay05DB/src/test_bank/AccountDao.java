package test_bank;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vo.AccountVO;

//1.���� ���� 2.�Ա� 3.��� 4.��ȸ 5.�۱�

public class AccountDao {

	private JdbcTemplate jdbcTemplate;

	public AccountDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// ����
	public int insert(AccountVO account) {
		String sql = "insert into account(account_num,name,password,price)values(?,?,?,?)";
		return jdbcTemplate.update(sql, account.getAccountNum(), account.getName(), account.getPassword(),
				account.getPrice());
	}

	// �Ա�
	public int deposit(int accountNum, int money) {

		String sql = "update account set price=price+? where account_num=?";
		return jdbcTemplate.update(sql, money, accountNum);

	}

	// ���
	public int withdraw(int accountNum, int money) {
		String sql = "update account set price=price-? where account_num=?";
		return jdbcTemplate.update(sql, money, accountNum);
	}

	// ��ȸ
	public AccountVO select(int accountNum) {
		String sql = "select * from account where account_num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<AccountVO>() {
			
			@Override
			public AccountVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				AccountVO account = new AccountVO();
				account.setAccountNum(rs.getInt("account_num"));
				account.setName(rs.getString("name"));
				account.setPassword(rs.getString("password"));
				account.setPrice(rs.getInt("price"));
				return account;
			}
		}, accountNum);
	}

}
