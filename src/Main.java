import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book("Beyaz Zambaklar Ülkesinde", 80, "sdsdf", 1978);
        Book b2 = new Book("Kırmızı Zambaklar Ülkesinde", 79, "sdsdf", 1978);
        Book b3 = new Book("Siyah Zambaklar Ülkesinde", 83, "sdsdf", 1978);
        Book b4 = new Book("Mavi Zambaklar Ülkesinde", 81, "sdsdf", 1978);
        Book b5 = new Book("Yeşil Zambaklar Ülkesinde", 82, "sdsdf", 1978);
        
        HashSet<Book> hs = new HashSet<>();
        
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        hs.add(b4);
        hs.add(b5);
        
        TreeSet<Book> b = new TreeSet<>(hs);
        TreeSet<Book> c = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        
        Iterator<Book> it=b.iterator();
        Scanner input = new Scanner(System.in);
        System.out.println("How to sort?");
        System.out.println("Alphabetical (1) / Page Number (2)");
        int a = input.nextInt();
        
        switch(a){
            case 1:
            it = c.iterator();
            break;

            case 2:
            it = b.iterator();
            break;
        }
        
        while(it.hasNext()){
            System.out.println(it.next().name);
        }
    }
}
