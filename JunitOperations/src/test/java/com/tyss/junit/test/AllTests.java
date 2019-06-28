package com.tyss.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BooleanOperationTest.class, MathOppTest.class, StringMathOppMultiValueTest.class,
		StringOperationTest.class })

public class AllTests {

}
