package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.beans.BloodBank;

@Repository
public class BloodBankDAOImpl implements IBloodBankDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public void createDonor(BloodBank d) {
		// TODO Auto-generated method stub
		template.update("insert into donor values(" + d.getId() + ",'"
				+ d.getName() + "','" + d.getBlood_grp() + "')");

	}

	@Override
	public List<BloodBank> getAllDonors() {
		// TODO Auto-generated method stub
		return template.query("select * from donor",
				new RowMapper<BloodBank>() {

					@Override
					public BloodBank mapRow(ResultSet rs, int rownum)
							throws SQLException {
						// TODO Auto-generated method stub
						BloodBank e = new BloodBank();
						e.setId(rs.getInt("id"));
						e.setName(rs.getString("name"));
						e.setBlood_grp(rs.getString("bloodgrp"));
						return e;
					}

				});
	}



}
