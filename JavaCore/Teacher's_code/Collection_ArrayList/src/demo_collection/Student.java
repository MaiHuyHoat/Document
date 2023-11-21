/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_collection;

import java.util.Scanner;

/**
 *
 * @author truongtm
 */
public class Student {
    String rollNo;
    String name;
    int age;
    int score;

    public Student()
    {
        rollNo = "";
        name  = "";
        age =0;
        score = 0;
    }
    public Student(String rn, String n, int a, int s)
    {
        rollNo = rn;
        name = n;
        age = a;
        score = s;
    }

    public void input()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập mã sv:");
        rollNo = nhap.nextLine();
        System.out.println("Nhập họ tên:");
        name = nhap.nextLine();
        System.out.println("Nhập tuổi:");
        age = nhap.nextInt();
        System.out.println("Nhập điểm:");
        score = nhap.nextInt();
    }
    public void display()
    {
        System.out.println(rollNo + "\t" + name + "\t" + age + "\t" + score);
    }
}
