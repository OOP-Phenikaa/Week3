package BAI1;

import java.util.Scanner;
public class PhanSoTest {
    public static void main(String[] args) {
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Phan So Thu Nhat : ");
        int tuSo = sc.nextInt();
        int mauSo = sc.nextInt();
        PhanSo ps1 = new PhanSo(tuSo, mauSo);
        System.out.print("Nhap Phan So Thu Hai : ");
        tuSo = sc.nextInt();
        mauSo = sc.nextInt();
        PhanSo ps2 = new PhanSo(tuSo, mauSo);
        System.out.println("1. Cong Hai Phan So");
        System.out.println("2. Tru Hai Phan So");
        System.out.println("3. Nhan Hai Phan So");
        System.out.println("4. Chia Hai Phan So");
        System.out.print("Nhap Lua Chon : ");
        key = sc.nextInt();
        switch (key){
            case 1:
                ps1.congPhanSo(ps2);
                break;
            case 2:
                ps1.truPhanSo(ps2);
                break;
            case 3:
                ps1.nhanPhanSo(ps2);
                break;
            case 4:
                ps1.chiaPhanSo(ps2);
                break;
            default:
                System.out.println("Nhap Sai");
                break;
        }
        ps1.inPhanSo();
    }
}
