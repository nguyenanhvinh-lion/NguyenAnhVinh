
package myPackages;

public class OtoKhach extends OtoDulich{
    // Attributes
    public float UuDai;
    
    // Constructor
    public OtoKhach(){
       System.out.println("O to khach:");
    }
    public OtoKhach(String TenSalon, String MaHang, String TenHang, float DonGia, int SoLuong, float Thue, float UuDai, float KhuyenMai, int SoCho){
        super(TenSalon, MaHang, TenHang, DonGia, SoLuong, Thue, KhuyenMai, SoCho);
        this.UuDai = UuDai; 
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
    }
   
    @Override
    public float TinhTien(){
        float TienHoaDon ;
        TienHoaDon = (DonGia * SoLuong) - UuDai + (DonGia * SoLuong)*Thue;
        return TienHoaDon;
    }
}
