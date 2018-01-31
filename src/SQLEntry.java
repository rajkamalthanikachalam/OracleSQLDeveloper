import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import utils.propertyReader;

public class SQLEntry {
	
	private static final String FILEPATH = null;
	private static final String STRINGCONNECTIONDB = null;
	private static final String USERNAME = null;
	private static final String PASSWORD = null;
	private static final String SQLQUERY = null;
	
		
	public static void sqlentry(String FILEPATH,String STRINGCONNECTIONDB, String USERNAME, String PASSWORD, String SQLQUERY) throws IOException, ParseException{
	
				
		  new propertyReader();
		
		  /*String[] filePath =       new String[] {"../OracleSQLDeveloper/Result/Output.csv"};
		  String[] driverDB =       new String[] {"oracle.jdbc.driver.OracleDriver"};
		  String[] stringConnDB =   new String[] {"jdbc:oracle:thin:@gdcx21-scan.statestr.com:1521/ESP.BUAT.AIS_QA_LOAD"};
		  String[] userDB =         new String[] {"XXXXx"};
		  String[] passDB =         new String[] {"XXXXX"};
		  String[] charSep =        new String[] {";"};
		  Boolean colomn =   		new Boolean (true);
		  String[] queryDB =        new String[] {"User Query"};*/
		 
		  //Predefined
		  String[] driverDB     =   new String[] {"oracle.jdbc.driver.OracleDriver"};
		  String[] charSep      =   new String[] {","};
		  Boolean colomn        =   new Boolean (true);
		  //User Input
		  String[] filePath     =   new String[] {propertyReader.FILEPATH};
		  String[] stringConnDB =   new String[] {propertyReader.STRINGCONNECTIONDB };
		  String[] userDB       =   new String[] {propertyReader.USERNAME};
		  String[] passDB       =   new String[] {propertyReader.PASSWORD};
		  String[] queryDB      =   new String[] {propertyReader.SQLQUERY};
		  		  
		try{
		    System.out.println("---------------File exist?------------" + filePath[0]);
		    File fileTemp = new File(filePath[0].toString());
		    if (fileTemp.exists())
		    { 
		        fileTemp.delete();
		        System.out.println("---------------DELETE FILE------------" + filePath[0] );
		    } 
		   System.out.println("QUERY: ---->"+ queryDB[0].toString());
		 
		   ExportQueryToCsv exp = new ExportQueryToCsv(filePath,driverDB,stringConnDB,userDB,passDB,queryDB, colomn,charSep); 
		   if (fileTemp.exists())
		   { 
		     System.out.println("---File created---" + filePath[0]);
		   }

		}catch(Exception e){
		         e.printStackTrace();
		}

	}

public static void main(String[] args) throws IOException, ParseException {
	
	sqlentry(FILEPATH, STRINGCONNECTIONDB, USERNAME, PASSWORD, SQLQUERY);
}
}