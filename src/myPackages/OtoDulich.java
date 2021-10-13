
package myPackages;
import java.util.Scanner;

public class OtoDulich extends NhapKhauOto {
    // Attributes
    public float KhuyenMai;
    public int SoCho;
    
    // Constructor
    public OtoDulich(){
       System.out.println("O to du lich:");
    }
    public OtoDulich(String TenSalon, String MaHang, String TenHang, 
            float DonGia, int SoLuong, float Thue, float KhuyenMai, int SoCho){
        
        super(TenSalon, MaHang, TenHang, DonGia, SoLuong, Thue);
        this.KhuyenMai = KhuyenMai;
        this.Thue = Thue;
    }
    
    @Override
    public void Nhap(){
        Scanner inp = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap khuyen mai: ");
        this.KhuyenMai = inp.nextFloat();
        System.out.print("Nhap so cho: ");
        this.SoCho = inp.nextInt();
    }
    
    @Override
    public float TinhTien(){
        float TienHoaDon ;
        TienHoaDon =(DonGia * SoLuong) - (DonGia * SoLuong * KhuyenMai) + (DonGia * SoLuong)*Thue;
        return TienHoaDon; 
    }
}
