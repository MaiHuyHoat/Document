/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentList;

/**
 *
 * @author Administrator
 */
public class Demo {
    public static void main(String[] args) {
        StudentList sl = new StudentList();
        sl.inputList();
        sl.displayList();
        sl.sapxepTen();
        System.out.println("Sau khi sắp xếp:");
        sl.displayList();
    }
}
