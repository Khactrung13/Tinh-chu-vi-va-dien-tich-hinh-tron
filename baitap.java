/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.baitap1.donglenh.chuong1;


import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class baitap {
public static double tinhDienTich(double r) {
        return r * r * 3.14;
    }
    public static double tinhChuVi(double r){
        return r * 2 * 3.14;
    }
    public static void main(String[] args) {

        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        r = scanner.nextDouble();
        System.out.println("Diện tích hình tròn là: " + tinhDienTich(r));
        System.out.println("Chu vi hình tròn là: "+ tinhChuVi(r));


    }


    


 

