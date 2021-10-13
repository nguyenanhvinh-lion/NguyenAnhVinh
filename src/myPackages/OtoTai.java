
package myPackages;


public class OtoTai extends NhapKhauOto{
    // Attributes
    public float GiamGia;
    public float TrongTai;
    
    // Constructor
    public OtoTai(){
       System.out.println("O to tai:");
    }
    public OtoTai(String TenSalon, String MaHang, String TenHang, 
            float DonGia, int SoLuong, float Thue, float GiamGia, float TrongTai){
        super(TenSalon, MaHang, TenHang, DonGia, SoLuong, Thue);
        this.GiamGia = GiamGia;
        this.TrongTai = TrongTai;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
    }
    
    // Ham tinh phu tai
    public float TinhPt(){
        float pt;
        if(this.TrongTai <= 3.6 ){
            pt = 200/100;
        }
        else{
            pt = 150/100;
        }
        return pt;
    }
    @Override
    public float TinhTien(){
        float TienHoaDon ;
        TienHoaDon = (DonGia - GiamGia)*SoLuong + (DonGia * SoLuong)*TinhPt() - (DonGia * SoLuong *Thue);
        return TienHoaDon;
    }
    
}
