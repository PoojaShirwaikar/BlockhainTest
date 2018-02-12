package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.BloodBank;
import com.psl.dao.IBloodBankDAO;

@Service
public class BloodBankService {
	@Autowired
	private IBloodBankDAO dao;

	public IBloodBankDAO getDao() {
		return dao;
	}

	public void setDao(IBloodBankDAO dao) {
		this.dao = dao;
	}

	public void createDonor(BloodBank e) {
		dao.createDonor(e);

	}

	public List<BloodBank> getAllDonors() {
		return dao.getAllDonors();
	}
}
