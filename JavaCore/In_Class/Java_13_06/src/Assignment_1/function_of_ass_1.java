/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hoatd
 */
public class function_of_ass_1 {

    HashMap<String, Generate> listAllBook;
    

    public function_of_ass_1() {
        this.listAllBook = new HashMap();
     
    }

    public int chooseType() {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại tài liệu: \n"
                + "1.	Sách\n"
                + "2.	Tạp chí\n"
                + "3.	Báo");
    
        chon = sc.nextInt();
        return chon;

    }
    public void display(){
      Set<Map.Entry<String,Generate>> list=this.listAllBook.entrySet();
      for(Map.Entry<String,Generate> i:list){
        i.getValue().display();
      }
    }
    public boolean searchBymaTl(String ma) {
        Set<String> keyset = this.listAllBook.keySet();
        for (String key : keyset) {
            if (key.equalsIgnoreCase(ma)) {
                return true;
            }

        }
        return false;
    }

    public void addDocument() {
        int chon;
        do {
            chon = this.chooseType();

            switch (chon) {
                case 1:
                    Book b = new Book();
                    b.add();
                    this.listAllBook.put(b.maTL, b);
                    
                    System.out.println("Thêm đối tượng thành công");
                    break;
                case 2:
                    Magazine m = new Magazine();
                    m.add();
                    this.listAllBook.put(m.maTL, m);
              
                    System.out.println("Thêm đối tượng thành công");
                    break;
                case 3:
                    Newspaper n = new Newspaper();
                    n.add();
                    this.listAllBook.put(n.maTL, n);
                 
                    System.out.println("Thêm đối tượng thành công");
                    break;
                default:
                    System.out.println("Nhập sai chọn lựa mời chọn lại");
            }
        } while (chon != 1 && chon != 2 && chon != 3);
    }
    public void remove(){
        Scanner sc= new Scanner(System.in);
        String maXoa;
        
        System.out.println("Nhập mã tài liệu cần xoá: ");
        maXoa=sc.nextLine();
        if(this.searchBymaTl(maXoa)){
            this.listAllBook.remove(maXoa);
            System.out.println("Xoá tài liệu thành công");
        }
        else System.out.println("Xoá tài liệu thất bại ");
    }
    public void search(){
        Scanner sc= new Scanner(System.in);
        String maTK;
        int chon;
        do{
        System.out.println("Chọn loại tài liệu tìm kiếm: ");
         chon=this.chooseType();
        System.out.println("Nhập mã tài liệu: ");
        maTK=sc.nextLine();
        switch(chon){
            case 1:// tìm kiếm mã tài liệu của Sách.
                if(this.searchBymaTl(maTK)){
                    if(this.listAllBook.get(maTK).L==1){
                        System.out.println("Đã tìm thấy thông tin tài liệu.");
                        this.listAllBook.get(maTK).display();
                        
                    }
                    else
                        System.out.println("Mã tài liệu không phải của sách .");
                }
                else System.out.println("Không tồn tại mã tài liệu nào như thế");
                break;
            case 2:// tìm kiếm mã tài liệu của tạp chí.
                    if(this.searchBymaTl(maTK)){
                    if(this.listAllBook.get(maTK).L==2){
                        System.out.println("Đã tìm thấy thông tin tạp chí.");
                        this.listAllBook.get(maTK).display();
                        
                    }
                    else
                        System.out.println("Mã tài liệu không phải của tạp chí .");
                }
                else System.out.println("Không tồn tại mã tài liệu nào như thế");
                break;
            case 3://tìm kiếm mã tài liệu của báo.
                    if(this.searchBymaTl(maTK)){
                    if(this.listAllBook.get(maTK).L==3){
                        System.out.println("Đã tìm thấy thông tin của báo.");
                        this.listAllBook.get(maTK).display();
                        
                    }
                    else
                        System.out.println("Mã tài liệu không phải của báo .");
                }
                else System.out.println("Không tồn tại mã tài liệu nào như thế");
                break;
            default:
                System.out.println("Lỗi chương trình do chọn sai. Mời chọn lại.");
        }}while(chon!=1&&chon!=2&&chon!=3);
    }

}
