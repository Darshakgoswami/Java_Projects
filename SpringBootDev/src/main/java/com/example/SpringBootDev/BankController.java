package com.example.SpringBootDev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PutMapping;    
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping; // <- ADD THIS IMPORT

@RestController
@RequestMapping("/api/v1")
public class BankController {
	@Autowired
	private BankService bankservice;
	
	@PostMapping("/Bank")
	public ResponseEntity<Bank> saveBank(@RequestBody Bank bank)
	{
		Bank newBank = bankservice.savebank(bank);
		return ResponseEntity.ok(bank);
		
	}
	// Inside public class BankController { ... }

	// PUT Mapping for Update operation
	@PutMapping("/Bank/{id}")
	public ResponseEntity<Bank> updateBank(@PathVariable(value = "id") int accountID, 
	                                       @RequestBody Bank bankDetails) {
	    try {
	        Bank updatedBank = bankservice.updateBank(accountID, bankDetails);
	        return ResponseEntity.ok(updatedBank);
	    } catch (RuntimeException e) {
	        // Return 404 Not Found if the account doesn't exist
	        return ResponseEntity.notFound().build();
	    }
	}

	// DELETE Mapping for Delete operation
	@DeleteMapping("/Bank/{id}")
	public ResponseEntity<?> deleteBank(@PathVariable(value = "id") int accountID) {
	    try {
	        bankservice.deleteBank(accountID);
	        // Return 204 No Content for successful deletion
	        return ResponseEntity.noContent().build();
	    } catch (RuntimeException e) {
	        // Return 404 Not Found if the account doesn't exist
	        return ResponseEntity.notFound().build();
	    }
	}
	// Inside public class BankController { ... }

	// GET Mapping for Read All operation
	@GetMapping("/Bank")
	public java.util.List<Bank> getAllBanks() {
	    return bankservice.getAllBanks();
	}

	// GET Mapping for Read by ID operation
	@GetMapping("/Bank/{id}")
	public ResponseEntity<Bank> getBankById(@PathVariable(value = "id") int accountID) {
	    try {
	        Bank bank = bankservice.getBankById(accountID);
	        return ResponseEntity.ok(bank);
	    } catch (RuntimeException e) {
	        return ResponseEntity.notFound().build();
	    }
	}
}