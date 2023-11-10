/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Running {
    public static void main(String [] args){
        
    
    Scanner sc= new Scanner(System.in);
    /*int i=0;
    Profile sd01= new Profile(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(sd01.toString());
    */
    List<Profile> arr= new ArrayList<>();
        System.out.print("Nhap vao so luong hoc sinh : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Profile temp=new Profile(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            arr.add(temp);
        }
        for(Profile x : arr){
            System.out.println(x.toString());  
        }
        //in ra danh sach thoa man adress bat ky
        String findadress=sc.nextLine();
        for(Profile x:arr){
            if(findadress.equals(x.getAdress())){
                System.out.println(x.toString());
            }
        }
 }
}