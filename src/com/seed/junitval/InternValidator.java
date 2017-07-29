package com.seed.junitval;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.seed.bean.Intern;
import com.seed.model.RegisterAndSearchIntern;


public class InternValidator {
    private RegisterAndSearchIntern ri;
	Intern intern;
	
	@Before
	public void init(){
		ri=new RegisterAndSearchIntern();
	}
	                      
	@Test
	public void searchBatchTest(){
		String batch="scts81";
		
	    ArrayList<Intern> expecteds=new ArrayList<>();
		//Intern intern=new Intern("jayendra", "9405309551", "kambli.jayendra@gmail.com", 184267, "scts81", "java", "male");
		//Intern intern2=new Intern("pratik","8759374593", "pratik@gmail.com ",184268, "scts81", "java", "male");
		
		//expecteds.add(intern);
		//expecteds.add(intern2);
		//ArrayList<Intern> actuals=new ArrayList<Intern>();
		assertEquals(expecteds, ri.searchByBatch(batch));
	}
	
}
