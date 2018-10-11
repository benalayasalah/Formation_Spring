package com.btk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
    
    	
    	List<Integer> nombres = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	
    	
    	//Afficher les nombres pairs avec un style impératif
    	
//    	for (Integer nb : nombres) {
//    		if (nb % 2 ==0 ) {
//    			System.out.println(nb + " est PAIR ! ");
//    		}
//			
//		}
    	
    	
    	List<Integer> pairs = nombres.stream()
    								 .filter(x -> x%2  ==0)
    								 .collect(Collectors.toList());
    	
//    	for (Integer integer : pairs) {
//    		System.out.println(integer + " est pair");
//    	}
    	pairs.forEach(System.out::println);
    	
    }
}
