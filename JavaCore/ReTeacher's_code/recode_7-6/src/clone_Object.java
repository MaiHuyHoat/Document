/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class clone_Object implements Cloneable {
    int rollno;
    String name;

    public clone_Object(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

  public Object CloneTest() throws CloneNotSupportedException{
      return super.clone();
  }
    public static void main(String[] args) {
        while(true){
            try{
                clone_Object c1= new clone_Object(30,"mai huy hoat");
                clone_Object c2=(clone_Object)c1.CloneTest();
                System.out.println(c1.name+" "+c1.rollno);
                System.out.println(c2.name+" "+c2.rollno);
                break;
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Lỗi hệ thống. Thực hiện lại chương trình");
            }
        }
    }
}
