package quiz.if2.pkg10119049.nursasongko;

import java.util.Scanner;

/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program Kasir Potong Rambut.
 */

public class QUIZIF210119049NURSASONGKO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // object scanner
        ServicePrice sp1 = new ServicePrice();
        Customer cs1 = new Customer();
        
        System.out.printf("Program Kasir Rock n Roll Haircut\n");
        System.out.printf("Customer Name : "); cs1.setName(scan.nextLine());
        System.out.printf("Customer Email : "); cs1.setEmail(scan.next());
       
        sp1.displayService();
        sp1.getPrice(scan.nextInt());
        System.out.printf("Are You Member ? (yes/no) : "); cs1.setMember(sp1.checkMemberStatus(scan.next()));
        
        System.out.println(cs1.isMember());
         
        System.out.printf("#*****************************#\n");
        System.out.printf("#******CUSTOMER INVOICE*******#\n");
        System.out.printf("Date Transaction : %s\n", cs1.currentTime());
        System.out.printf("Service Price :  Rp.%.1f\n",sp1.getPriceService());
        System.out.printf("Discount :  Rp.%.1f\n",sp1.getSale(cs1.isMember(), sp1.getPriceService()));
        System.out.printf("Total Pay :  Rp.%.1f\n",sp1.getTotalPay(sp1.getPriceService(),sp1.getSale(cs1.isMember(), sp1.getPriceService())));
    }
    
}
