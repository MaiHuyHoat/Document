/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentList;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class Student {
    String rollNo;
    String name;
    int age;
    int score;
    public void input()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma SV:") ;
        rollNo = nhap.nextLine();
        System.out.print("Nhap hoten:") ;
        name = nhap.nextLine();
        System.out.print("Nhap tuoi:") ;
        age = nhap.nextInt();
        System.out.print("Nhap diem:") ;
        score = nhap.nextInt();
    }
    public void display()
    {
        System.out.println(rollNo + "\t" + name + "\t" + age + "\t" + score);

    }
}
