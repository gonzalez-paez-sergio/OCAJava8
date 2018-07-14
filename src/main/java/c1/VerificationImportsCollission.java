package c1;

import java.util.Date;
import java.sql.*;
//The import java.sql.Date collides with another import statement
//import java.sql.Date;

public class VerificationImportsCollission {
	public static void main(String[] string) {
		/**
		 * if we do import both
		 * 
		 * import java.util.*;
		 * 
		 * import java.sql.*;
		 * 
		 * The type Date is ambiguous
		 */

		Date date = new Date();
		
		System.out.println(date);
	}
}