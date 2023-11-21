/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentList;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList L1 = new ArrayList();
        ArrayList<Student> L2 = new ArrayList<Student>();
        Student s1 = new Student();
        L1.add(s1);
        L2.add(s1);
        Student s2 = (Student)L1.get(0);
        Student s3 = L2.get(0);
    }
}
