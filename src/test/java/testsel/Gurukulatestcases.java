package testsel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Gurukulatestcases extends App {

	static App newapp = new App();
	static testmethods testm; 
	
@org.testng.annotations.BeforeClass
public static void setup(){
	
	testm = new testmethods();
	
	//newapp.initialise();
	
}



@org.testng.annotations.Test
public void branchverify() throws InterruptedException {
	
//	newapp.entitycheckforbranch();
	testm.entityclick(driver);
	testm.branchclick(driver);
	//testm.branchcreate(driver);
	//testm.branchsearch(driver);
	
	
	
}

@After
public void cleardata() {
	
	//newapp.branchdelete();
	
}

@AfterClass
public static void teardown() {
	
	//newapp.endprocess();
}

	
}
