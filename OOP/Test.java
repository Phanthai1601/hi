package OOP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        for(int i=0; i<n; i++) {
            SinhVien tmp = new SinhVien(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(tmp);
        }
        Collections.sort(sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getNam() != o2.getNam()) {
                    return o1.getNam() - o2.getNam();
                }
                if(o1.getThang() != o2.getThang()) {
                    return o1.getThang() - o2.getThang();
                }
                if(o1.getNgay() != o2.getNgay()) {
                    return o1.getNgay() - o2.getNgay();
                }
                return o1.getMaNv().compareTo(o2.getMaNv());
            }
        });
        for(int i=0; i<sv.size(); i++) {
            System.out.println(sv.get(i));
        }
    }
}
class SinhVien {
    private String maNV, hoTen, gioiTinh, ngaySinh;
    private String diaChi, maThue, ngayKi;
    public SinhVien(int stt, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKi) {
        super();
        this.maNV = String.format("%05d", stt);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKi = ngayKi;
    }
    public String chuanHoa(String x) {
        StringBuilder sb = new StringBuilder(x);
        if(sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        x = sb.toString();
        return x;
    }
    public int getNgay() {
        String t = chuanHoa(ngaySinh).substring(0, 2);
        return Integer.parseInt(t);
    }
    public int getThang() {
        String t = chuanHoa(ngaySinh).substring(3, 5);
        return Integer.parseInt(t);
    }
    public int getNam() {
        String t = chuanHoa(ngaySinh).substring(6, chuanHoa(ngaySinh).length());
        return Integer.parseInt(t);
    }
    public String getMaNv() {
        return this.maNV;
    }
    @Override
    public String toString() {
        return maNV + " " +hoTen + " " + gioiTinh + " " + chuanHoa(ngaySinh) + " " + diaChi + " " + maThue + " " + chuanHoa(ngayKi);
    }
}
