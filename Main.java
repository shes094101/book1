import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) { //輸入迴圈
            System.out.println("輸入第" + (i + 1) + "本書名、ISBN碼、價格、類型、出版社、總頁數");
            books[i] = new Book(src.next(), src.next(), src.nextFloat(), src.next(), src.next(), src.next());
        }
        System.out.println("已將資料全數輸入完畢");

        boolean x = true;
        while (x) {
            System.out.println("請問要搜索哪一本書呢?" + "\n" + "請輸入書名、ISBN碼其中一項");
            String scn = src.next();
            for (int i = 0; i < 5; i++) {
                if (books[i].getName().equals(scn) || books[i].getIsbn().equals(scn)) {
                    books[i].showAll();
                } else {
                    System.out.println("查無此書");
                }
                x = false;
            }
        }
    }
}