/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tanas.mathutil.main;

import com.tanas.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Test case #1 xem mô tả chi tiết ở phần ghi chú
       int n = 0; // hàm ý kiểm tra 0!
       long expected = 1; // hàm ý rằng, hy vọng rằng n = 0! phải trả về 1
       long actual = MathUtility.getFactorial(n); // thực tế là mấy, gọi hàm là biết ngay
       
       // so sánh giữa expected == actual hay không
        System.out.println(n +  "! -> expected: " + expected + " | actual: " + actual);
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n); // 5!
        System.out.println(n +  "! -> expected: " + expected + " | actual: " + actual);
    }
    
}

// Dân DEV viết ra code: hàm, class, đồng thời phải có trách nhiệm test code của hắn làm ra

// Làm sao test code của chính mình
// Có 3 cách:
// Cách 1: In ra màn hình kết quả xử lí của hàm
// Cách 2: In ra LOG FILE
// Cách 3: Dùng đồ chơi bên ngoài đem vào - Thư viện đem vào!!!!

// Nhưng dù kiểm thử thế nào thì cũng gồm 3 công việc
// 1. Thiết kế TEST CASE
// 2. Thực thi TEST CASE - TEST RUN
// 3. Ghi BUG nếu có = LOG BUG

// Test Case là: Bộ data đưa vào app để xem app hành xử đúng không 
//               Kèm Thêm EXPECTED VALUE để xem App trả vể đúng không
//               Kèm thêm hướng dẫn sử dụng app với data đưa vào
//               kèm thêm trạng thái của TEST CASE: APP đúng hay sai

// Cấu trúc 1 TEST CASE như sau:
// (Dùng trong thực tế đi làm, và dùng trong bài thi PE)

// Một TEST CASE gồm những INFO sau:
// TEST CASE ID | TEST CASE DESCRIPTION | STEPS/PROCEDURES
// EXPECTED RESULT | STATUS (PASSED | FAILED)

// TEST CASE là tình huống xài app với bộ data đưa vào và giá trị kì vọng app phải trả về
// Giờ ta muốn test hàm getF() ta phải thiết kế các test case coi xem hàm trả về đúng không


// TEST CASE #1: VERIFY getFactorial(with n = 0) check 0! correct or not?
// TEST STEPS/ PROCEDURES
//          1. Given n = 0
//          2. Call/invoke getFactorial(n = 0)

// EXPECTED RESULT:
//          The method must return 1 as the result of 0!

// STATUS: PASSED | FAILED, just waiting the method returns value
//                  ĐOÁN XEM !!!!!


// Câu 3 bài thi PE viết ra khoảng 10 cái TEST CASE như trên

// TEST CASE #2: VERIFY getFactorial(with n = 5) check 5! correct or not?
// TEST STEPS/ PROCEDURES
//          1. Given n = 5
//          2. Call/invoke getFactorial(n = 5)

// EXPECTED RESULT:
//          The method must return 120 as the result of 5!

// STATUS: PASSED | FAILED, just waiting the method returns value
//    