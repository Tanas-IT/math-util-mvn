/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanas.mathutil.core.test;

import com.tanas.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    // TEST CASE TEMPLATE / STRUCTURE
    // ID | Description | STEPS/PROCEDURES | EXPECTED RESULT | STATUS (PASSED/FAILED) | 

// Test case #1 : Verify the getFactorial () function with n = 0
// Steps/Procedures :
//      1. Given n = 0
//      2. Call / Invoke getFactorial(int n=0)
// Expected Result:
//              The method getFactorial(n = 0) must return 1
//                      as the result 0 ! == 1
// Status: PASSED | FAILED chờ lúc chạy hàm mới biết trạng thái đúng sai 
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    /*Test Case #2: Verify the getFactorial() function with n = 1
    Steps/Procedures: 
            1. Given n = 1
            2. Call/Invoke getFactorial(int n)
    Expected Result:
                    The method getFactorial(n = 1) must return 1
                    as the result 1! = 1
    Status: PASSED | FAILED
     */
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    /* Test case #3: Verify the getFactorial() with n = 6
    Steps/ Procedures:
            1. Given n = 6
            2. Call/Invoke the getFactorial(int n) 
    Expected Result:
            The method getFactorial(n = 6) must return 720
            as the result 6! = 720
    Status: PASSED | FAILED
     */
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }

}
