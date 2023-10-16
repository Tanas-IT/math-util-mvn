/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanas.mathutil.core.test;

import com.tanas.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ASUS
 */
public class MathUtilityDDTTest {
    // Ta cần chuẩn bị bộ data để nhồi cào cái hàm qua 2 tham số đã chừa sẵn !!!
    // Kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh
    // để data ở riêng 1 chỗ, từ từ fill vào hàm so sánh
    // Kĩ thuật này gọi là DDT Data Driven Testing
    // Data thường sẽ để ở mảng 2 chiều
    // 1 cái là đầu vào N. 1 cái đầu ra EXPECTED
    // và có nhiều cặp như thế
    //  Kĩ thuật này còn gọi là tham số hóa kiểm thử
    // Đưa Data vào qua tham số hàm
    
    // mảng 2 chiều này sẽ nhồi vào hàm ở dưới
    public static Object[][] initData() {
        Object[][] dataSet = {{0,1},
                              {1,1},
                              {3,6},
                              {4,24},
                              {5,120}};
        
        return dataSet;
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
