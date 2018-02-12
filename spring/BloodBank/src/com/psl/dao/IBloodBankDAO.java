package com.psl.dao;

import java.util.List;

import com.psl.beans.BloodBank;

public interface IBloodBankDAO {
	void createDonor(BloodBank d);

	List<BloodBank> getAllDonors();

	
}
