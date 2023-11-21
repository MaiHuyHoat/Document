
import java.util.ArrayList;

public class ArrayListDemo {

    public ArrayListDemo() {
       

    }

    public static void main(String[] args) {
        
        //Khai bao doi tuong kieu ArrayList
        ArrayList al = new ArrayList();
        
        //Khai bao cac doi tuong se dua mang
        Integer i = new Integer(2);
        Double d = new Double(3);
        String s = "Vien CNTT";
        Student stu = new Student("A0711L01", "NVA", 20, 80);
        //chen cac doi tuong tren vao mang al
        al.add(i);
        al.add(d);
        al.add(s);
        al.add(stu);
        //lay ve so luong phan tu cua mang
        int size = al.size();
        System.out.println("size="+size);

        //vong lap hien thi cac phan tu cua mang al
        System.out.println("Cac phan tu cua mang (dung vong lap thong thuong):");
        for(int j = 0; j < size;j++){
            System.out.println(al.get(j));
        }

        //CO THE SU DUNG VONG LAP SAU
        System.out.println("Vong lap for(Object obj:al) ");
        for (Object obj:al){
            System.out.println(obj);
        }
        //Gan gia tri 5 cho phan tu tai vi tri 1 (phan tu thu 2 trong mang)
        al.set(1, 5);
        int i1 = (Integer)al.get(1);
        
        System.out.println("phan tu thu 1 la:" + i1);
        String x = (String)al.get(2);
        System.out.println("x = "+x);
        System.out.println("IsEmpty?: "+al.isEmpty());
        
        //tim xem mang co chua 1 phan tu hay ko?
        boolean contain = al.contains("Vien CNTT");
        System.out.println("is contain?:"+contain);
        //Xoa 1 phan tu tai vi tri so 3 (phan tu thu 4) khoi mang
        al.remove(3);
        System.out.println("So phan tu con lai la:" + al.size());
  
    }
}
 
class Student {

    String rollNo;
    String name;
    int age;
    int score;

    public Student(String rn, String n, int a, int s) {
        this.rollNo = rn;
        this.name = n;
        this.age = a;
        this.score = s;
    }

    public void display() {
        System.out.println(rollNo + "\t" + name + "\t" + age + "\t" + score);
    }
    @Override
    public String toString(){
      return rollNo + "\t" + name + "\t" + age + "\t" + score;
    }

}