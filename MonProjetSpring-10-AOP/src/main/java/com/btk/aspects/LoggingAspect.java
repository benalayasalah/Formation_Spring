package com.btk.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	
	
	
	@Before(value = "execution(* com.btk.service.Calcul.*(..))")
	public void logBefore(JoinPoint point) {
		System.out.println(">>>    LOG input method : >>>>>>" + point.getSignature().getName());
	}

//	@After(value = "execution(* com.btk.service.Calcul.*(..))")
//	public void logAfter(JoinPoint point) {
//		System.out.println(">>>    LOG output method : >>>>>>" + point.getSignature().getName());
//	}

	@AfterReturning(value = "execution(* com.btk.service.Calcul.*(..))", returning = "resultat")
	public void logAfter(JoinPoint point, int resultat) {
		System.out.println(
				">>>    LOG output method : >>>>>>" + point.getSignature().getName() + " le résultat est :" + resultat);
	}

}
