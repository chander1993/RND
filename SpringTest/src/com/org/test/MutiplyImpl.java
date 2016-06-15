package com.org.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MutiplyImpl implements IMultiply {
	
	@Resource
	Model m;
	

	
	public int multiply(int a, int b)
	{
		int c=1;
		c=m.a*m.b;
		return c;
	}

}
