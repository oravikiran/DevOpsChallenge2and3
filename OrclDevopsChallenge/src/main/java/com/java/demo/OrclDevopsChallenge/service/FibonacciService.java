package com.java.demo.OrclDevopsChallenge.service;

import java.util.LinkedList;
import java.util.List;

import com.java.demo.OrclDevopsChallenge.dto.FibonacciDto;

public class FibonacciService {

	public static FibonacciDto getFibonacciSeries(Integer range){

		List<Integer> sequence = new LinkedList<>();

		Integer n1=0,n2=1,n3,i,sum=0;    

		for(i=1;i<=range;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;
			sequence.add(n3);
			sum+=n3;
			n1=n2;    
			n2=n3;    
		}  
		
		return new FibonacciDto(range, sequence, sum);
	}

}
