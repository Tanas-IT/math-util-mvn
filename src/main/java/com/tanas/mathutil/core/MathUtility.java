/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanas.mathutil.core;

/**
 *
 * @author ASUS
 */
// Class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
// Cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm, mà không cần lưu trữ gì hết, cái đó nên là static
// Đồ nào mà là STATIC thì gọi trực tiếp qua tên class
// Không bao giờ gọi STATIC qua con đường NEW!!!!!!!!


// hàm tính n! = 1,2,3,...n
    // Không có giai thừa của số âm, N < 0 không tính được
    // Nếu N quá lớn thì tràn kiểu long, long chỉ chịu được 18 số 0
    // 20! vừa đủ số 0, do đó: Không tính giai thừa từ 21 trở đi
    // 0! = 1! = 1 - Quy ước
    
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20) {
//            throw new IllegalArgumentException("invalid n. n must be "
//                    + "between 0...20");
//        }
//        if(n == 0 || n == 1) {
//            return 1; //nếu có thể kết thúc sớm, thỉ kết thúc ngay
//        }
//        // sống sót đến chỗ này, sure n = 2....20. Vì nếu không chết dọc đường ở 2 cụm if ở trên rồi
//        // không cần else nếu trước đó xái RETURN
//        long result = 10; //giai thừa khởi đầu là 1 
//        // nhân dồn 2 3 4 5.... n vào biến này thì thành n!
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }

public class MathUtility {
    public static final double PI = 3.14;
    // C#: public const double Pi = 3.14; không cần chữ static mà vẫn là static nếu có từ khóa const 
    // const C# ~ final Java
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("invalid n. n must be "
                    + "between 0...20");
        }
        if(n == 0 || n == 1) {
            return 1; //nếu có thể kết thúc sớm, thỉ kết thúc ngay
        }
       return n * getFactorial(n-1);
    }
}
// Đệ quy - Recursion
// Búp bê Nga - đệ quy là gọi lại chính mình với quy mô nhỏ hơn
// Nhỏ đến một mức thì dừng lại
// 5! = 1.2.3.4.  5
// 5! = 4! x 5 = 5 x 4!
// 4! = 1.2.3.  4
// 4! = 3! x 4 = 4 x 3!
// 3!           =  3 x 2!
// 2!           =  2 x 1! DỪNG NGAY
// N!           =  N X (N-1) !!!!!



// Kĩ thuật kiểm thử hồi quy - REGRESSION TEST
// Test lại những thứ đã từng test để xác nhận nó có ổn không
// Tại sao phải test lại???
// 1. Anh em fix bug sẽ phải sửa code
// 2. Anh em tối ưu, chỉnh sửa code để code đẹp hơn, chạy tốt hơn, nhanh hơn
// 3. Anh em thêm hàm mới, method mới

// khi sửa code, phải test lại để đảm bảo nó vẫn ngon, vẫn xanh
// Nếu test = tay cự kì mất sức, coi chừng sai sót
// Nếu có test script, ta chỉ việc run, và nhìn vào màu đưa ra
// Nếu màu xanh, code chỉnh sửa ổn, vì thỏa EXPECTED == ACTUAL
// Nếu màu đỏ, code không ổn, sửa tiếp cho đến khi nào ổn
// Ta test lại mà chỉ càn nhìn màu -> Nhanh, không hao sức, chính xác 
// Miễn đủ TEST CASE, TEST SCRIPT

// Test lại những thứ đã từng test gọi là test hồi quy Regression 

 