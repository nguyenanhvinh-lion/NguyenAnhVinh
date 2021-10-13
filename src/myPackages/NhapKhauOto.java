
package myPackages;
import java.util.Scanner;


public abstract class NhapKhauOto {
    // Attributes
    public final String TenSaLon = "ThangLong";
    public String MaHang;
    public String TenHang;
    public float DonGia;
    public int SoLuong;
    public float Thue;
    
    // Constructor
    public NhapKhauOto(){}
    public NhapKhauOto(String TenSalon, String MaHang, String TenHang, 
            float DonGia, int SoLuong, float Thue){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.Thue = Thue;
    }
    
    // Set - Get
    
    // 
    public void Nhap(){
        Scanner inp = new Scanner(System.in);
        System.out.print("\nNhap ma hang: ");
        this.MaHang = inp.nextLine();
        System.out.print("Nhap ten hang: ");
        this.TenHang = inp.nextLine();
        System.out.print("Nhap don gia: ");
        this.DonGia = inp.nextFloat();
        System.out.print("So luong: ");
        this.SoLuong = inp.nextInt();
        System.out.print("Thue: ");
        this.Thue = inp.nextFloat();
    }
    
    // Phuong thuc truu tuong tinh tien
    public abstract float TinhTien();
    
    // In hoa don
    // ToString
    public String ToString(){
        String str;
        str = "\n Ten salon: "+ this.TenSaLon
                + "\n Ma hang: "+ this.MaHang
                + "\n Ten hang: "+ this.TenHang
                + "\n Don gia: "+ this.DonGia
                + "\n So luong: "+ this.SoLuong
                + "\n Thue: "+ this.Thue
                + "\n Thanh tien: "+ TinhTien();             
        return str;
    }
}
