/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Admin
 */
public class ComputerScience extends AbsProfile {
    protected double hp1;
    protected double hp02;
    protected double hp03;
    protected double DTL;
    protected String HocLuc;

    public double getHp1() {
        return hp1;
    }

    public void setHp1(double hp1) {
        this.hp1 = hp1;
    }

    public double getHp02() {
        return hp02;
    }

    public void setHp02(double hp02) {
        this.hp02 = hp02;
    }

    public double getHp03() {
        return hp03;
    }

    public void setHp03(double hp03) {
        this.hp03 = hp03;
    }

    public double getDTL() {
        return DTL;
    }

    public void setDTL(double DTL) {
        this.DTL = DTL;
    }

    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }
    
    public ComputerScience(double hp1, double hp02, double hp03, double DTL, String HocLuc) {
        this.hp1 = hp1;
        this.hp02 = hp02;
        this.hp03 = hp03;
        this.DTL = DTL;
        this.HocLuc = HocLuc;
    }

    public ComputerScience(double hp1, double hp02, double hp03, int stt, String firstname, String lastname, String adress, String phone, String email) {
        super(stt, firstname, lastname, adress, phone, email);
        this.hp1 = hp1;
        this.hp02 = hp02;
        this.hp03 = hp03;
    }
    
    @Override
    public double gpa() {
         return (hp1+hp02+hp03)/3;
    }

    @Override
    public String HL() {
        if(gpa()>=8.5) return "Xuat sac";
        else if(gpa()>=8) return "Gioi";
        else if(gpa()>=6.5) return "Kha";
        else return "Trung binh";
    }

    @Override
    public String toString() {
        return super.toString()+"HOCPHAN01 : "+this.hp1+"\n"
               + "HP02 : "+this.hp02+"\n"+"HP03 : "+this.hp03+"\n"+gpa()+"\n"+HL()+"\n";
    }
    
    
}
