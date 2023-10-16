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
public class MathUtility {
    public static final double PI = 3.14;
    // C#: public const double Pi = 3.14; không cần chữ static mà vẫn là static nếu có từ khóa const 
    // const C# ~ final Java
    
    // hàm tính n! = 1,2,3,...n
    // Không có giai thừa của số âm, N < 0 không tính được
    // Nếu N quá lớn thì tràn kiểu long, long chỉ chịu được 18 số 0
    // 20! vừa đủ số 0, do đó: Không tính giai thừa từ 21 trở đi
    // 0! = 1! = 1 - Quy ước
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("invalid n. n must be "
                    + "between 0...20");
        }
        if(n == 0 || n == 1) {
            return 1; //nếu có thể kết thúc sớm, thỉ kết thúc ngay
        }
        // sống sót đến chỗ này, sure n = 2....20. Vì nếu không chết dọc đường ở 2 cụm if ở trên rồi
        // không cần else nếu trước đó xái RETURN
        long result = 10; //giai thừa khởi đầu là 1 
        // nhân dồn 2 3 4 5.... n vào biến này thì thành n!
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
