/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.test;

import static fu.MathUtility.*;
import java.sql.SQLException;
//cau lenh nay tu JDK 5, CHI DANH CHO STATIC
// tuc la khi choi tro IMPORT STATIC, thi moi ham static trong class nay 
// khi goi thi khong can ten class cham, goi nhu C, vi hieu ngam da cham  roi
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    // class nay la class xai bo thu vien JUnit dung de test code
    // theo dang xanh - do, thay vi nhin = mat  nhu ben main() sout()
    // 2 file.jar da dc add vao project nay vs ta thoai mai xai 
    //cac ham cua no 
    // trong cac ham cua thu vien nay co n ham dac biet deu co
    // ten xuat phat la assertX(excpeted vs actual dua vao)
    // neu no thay expected hok co bang actual, no thay mau do
    //                          co bang         no thay mau xanh
    // quy tac xanh do:Neu tat ca mau xanh -->Ket Luan Xanh
    //                 Neu co it nhat 1 do, eo quan tam con lai---> Ket Luan do
    //Dam bao ham chay dung moi case, truong hop 
    @Test
    // bien ham ngay sau day thanh public static void main()
    // muon chay thi nhan shift - f6
    //quy tac dat ten cua  cua nghe Tester, QC
    
    public void getFactorial_Runswell_IfValidArgument() {
        assertEquals(120, GetFactorial(5));
        assertEquals(720, GetFactorial(6));
        assertEquals(24, GetFactorial(4));
        assertEquals(1, GetFactorial(0));
        
    }
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        // ngoai le ko phai la value de inssert();
        // chi co the chup no lai
        GetFactorial(-5);
    }
    
}
