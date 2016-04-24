package testsel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class createbranch {

	static App newapp = new App();
	
	
@BeforeClass
public static void setup(){
	
	newapp.initialise();
	
}

@Before
public void init() {
	
	newapp.loginlink();
	newapp.logincheck();
	
}

@Test
public void branchverify() throws InterruptedException {
	

	newapp.entityclick();
	//Thread.sleep(10000);
	newapp.branchcreate();
	//Thread.sleep(1000);
	//newapp.branchsearch();
	//newapp.branchedit();
	
	
}

@After
public void cleardata() {
	
	//newapp.branchdelete();
	
}

@AfterClass
public static void teardown() {
	
	newapp.endprocess();
}

	
}
