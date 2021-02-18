package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Logic.palindromo;

public class Optimistic {
	
	@Test
	public void whenPalindrom_thenAccept() {
	    palindromo palindromeTester = new palindromo();
	    assertTrue(palindromeTester.isPalindrome("neon"));
	}
	    
	
	@Test
	public void whenNotPalindrom_thanReject() {
	    palindromo palindromeTester = new palindromo();
	    assertFalse(palindromeTester.isPalindrome("arte"));
	} 

} 
