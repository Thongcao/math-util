/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu;

/**
 *
 * @author Admin
 */
public class MathUtility {
    //fake class Math gong nhu that
    //Math.sqrt().abs().pow().sin.PI
    public static final double PI = 3.1415; 
// XAIMathUtility.PI
// ham tinh n!=1.2.3....n
    // trong do ko  co giai thua am , >20 tran kieu long
    // quy uoc 0!=1!=1;
        
    public static  long GetFactorial (int n){
        if(n<0||n>20) 
            throw new IllegalArgumentException("n must be between 0...20");
        if(n==0||n==1)
            return 1;//ko xai else,co else tru diem
                      // 1 lenh trong if khong xai ngoac
                      //doan nay n=2..20
        long result=1;
        for(int i=2;i<=n;i++){
            result *=1;
            //nhan don ve resxult
        }
        return result;
    }
}
// ta tu tin ham ta chay ngon 
// nhung team can chung minh dieu do, dam bao chat luong code 
// ta muon chung minh ham chay dung hay khong ta can test thu
// vi du goi ham getFactorial(voi cac so khac nhau dua vao)
// getF(-5),getF(-1),grtF(0),getF(5),getF(20),getF(21),...
// cac gia ytri dau vao dai dien cho viec xai ham
// ta con goi la test cases, cac tinh nang can test , cac tinh huong xai ham
// 1.du kien ham tra ve gia tri gi khi ham chay voi 1 dau  vao nao do
//   du kien ham se tra ve gia tri , toi goi la EXPECTED VALUE
// 2.ham khi chay voi 1 dau vao nao do , thi no se oi/return  ve 1 VALUE
//   cai value tra ve ve cua ham khi chay dc goi la ACTUAL VALUE

// nghe test chinh la so sanh coi EXCEPTED VALUE co bang voi ACTUAL VALUE ko
//Neu co bang ,ham dung cho case/tinh huong nay
// Neu khong bang , ham tinh toan sai hoac ki vong sai

// Lam sao de test ham coi co tot ko, EXPECTED == ACTUAL
//hai ky thuat dc ap dung
//ky thuat 1: nhin bang mat hoacc so sanh tung cap expected vs actual chinh la
//              ky thuat sout






// tuong duong cau:  ham toi chay ngon lam, dung 99,9% lau lau sai ti
// noi cau do : ham ko dang tin cay de xai
// ky thuat 2 nay dung mau sac, muon lam the thi phai xai thu vien bo sung them bo sung