package com.example.SpringBootDev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	private BankRepository bankrepository;
	
	// insert method
	public Bank savebank(Bank bank)
	{
		return bankrepository.saveAndFlush(bank);
	}
	
	 // get all data method
	public List<Bank> getAllBankData()
	{
		return bankrepository.findAll();
	}
	
	// get bank by id method
	public Bank getBankbyId(int id)
	{
		return bankrepository.findById(id).orElse(null);	
	}
	
	// update method
	public Bank updateBank(int id, Bank bank)
	{
		Bank existingBank=bankrepository.findById(id).orElse(null);
		if(existingBank!=null)
		{
			existingBank.setAccountHolderName(bank.getAccountHolderName());
			existingBank.setAccountNumber(bank.getAccountNumber());
			existingBank.setAccountID(bank.getAccountID());
			existingBank.setBalance(bank.getBalance());
			return bankrepository.saveAndFlush(existingBank);
		}
		else
		{
			return null;
		}
	}
	
	// delete by id
	public void deleteBank(int id)
	{
		bankrepository.deleteById(id);
	}
	
	// add multiple bank records
	public List<Bank> addmultipleBanks(List<Bank> banks)
	{
		return bankrepository.saveAll(banks);
	}
}