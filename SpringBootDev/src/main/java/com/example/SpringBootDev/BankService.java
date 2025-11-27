package com.example.SpringBootDev;

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
	// Inside public class BankService { ... }

	// Update method
	public Bank updateBank(int accountID, Bank updatedBankDetails) {
	    // Find the existing entity by ID
	    return bankrepository.findById(accountID)
	        .map(existingBank -> {
	            // Update the fields on the existing entity
	            existingBank.setBalance(updatedBankDetails.getBalance());
	            existingBank.setAccountNumber(updatedBankDetails.getAccountNumber());
	            existingBank.setAccountHolderName(updatedBankDetails.getAccountHolderName());
	            
	            // Save and return the updated entity
	            return bankrepository.save(existingBank);
	        })
	        .orElseThrow(() -> new RuntimeException("Bank Account not found with ID: " + accountID));
	}

	// Delete method
	public void deleteBank(int accountID) {
	    if (!bankrepository.existsById(accountID)) {
	        throw new RuntimeException("Bank Account not found with ID: " + accountID);
	    }
	    bankrepository.deleteById(accountID);
	}
	
	// Inside public class BankService { ... }

	// Read all method
	public java.util.List<Bank> getAllBanks() {
	    return bankrepository.findAll();
	}

	// Read by ID method
	public Bank getBankById(int accountID) {
	    return bankrepository.findById(accountID)
	        .orElseThrow(() -> new RuntimeException("Bank Account not found with ID: " + accountID));
	}
}