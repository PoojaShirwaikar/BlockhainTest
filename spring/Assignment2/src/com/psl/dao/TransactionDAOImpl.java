package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.beans.Transaction;
import com.psl.beans.User;

public class TransactionDAOImpl extends JdbcDaoSupport implements
		ITransactionDAO {
//	private JdbcTemplate template;
//
//	public JdbcTemplate getTemplate() {
//		return template;
//	}
//
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//	}

	@Override
	public void withdraw(User u, int amount) {
		// TODO Auto-generated method stub
		if (amount > u.getBalance()) {
			System.out.println("UnSufficient Balance");
		} else {
			// int bal = u.getBalance() - amount;

			String sql = "insert into transaction values(" + u.getId() + ","
					+ amount + ",'withdraw')";
			String sql1 = "update user set balance=balance-" + amount
					+ " where id=" + u.getId();
			System.out.println(sql);
			System.out.println(sql1);
			getJdbcTemplate().update(sql);
			getJdbcTemplate().update(sql1);
		}
	}

	@Override
	public void deposit(User u, int amount) {
		// TODO Auto-generated method stub
		// int bal = (u.getBalance()) + amount;
		// System.out.println(bal);
		String sql = "insert into transaction values(" + u.getId() + ","
				+ amount + ",'deposit')";
		getJdbcTemplate().update(sql);
		String sql1 = "update user set balance=balance+" + amount
				+ " where id=" + u.getId();
		System.out.println(sql);
		System.out.println(sql1);
		getJdbcTemplate().update(sql1);

	}

	@Override
	public List<Transaction> ministatement(User u) {
		return getJdbcTemplate().query(
				"select * from transaction where id=" + u.getId() + " limit 5",
				new RowMapper<Transaction>() {

					@Override
					public Transaction mapRow(ResultSet rs, int rowNo)
							throws SQLException {
						// TODO Auto-generated method stub
						Transaction t = new Transaction();
						t.setAction(rs.getString("action"));
						t.setAmt(rs.getInt("amount"));
						t.setU(u);
						return t;
					}

				});
	}

	@Override
	public void createUser(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into user values(" + u.getId() + ",'"
				+ u.getName() + "'," + u.getAccno() + "," + u.getBalance()
				+ ")";
		System.out.println(sql);
		getJdbcTemplate().update(sql);

	}

}