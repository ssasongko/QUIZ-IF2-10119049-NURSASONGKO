package quiz.if2.pkg10119049.nursasongko;

/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program Kasir Potong Rambut.
 */

public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
   
    @Override
    public void displayService() {
        System.out.printf("#************************#\n");
        System.out.printf("#**Rock n Roll Haircut**#\n");
        System.out.printf("#**Service List**#\n");
        System.out.printf("1. Haircut : IDR 45k\n");
        System.out.printf("2. Haircut + Hairwash : IDR 55k\n");
        System.out.printf("3. Hairwash Only : IDR 15k\n");
        System.out.printf("#************************#\n");
        System.out.printf("Choose (1/2/3) : ");
    }

    @Override
    public float getPrice(int serviceItem) {
        if(serviceItem == 1){
            return priceService = 45000;
        }
        else if(serviceItem == 2){
            return priceService = 55000;
        }
        else{
            return priceService = 15000;
        }
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.equals("yes") ||(statusMember.equals("YES"))){
            return true;
        }
        if(statusMember.equals("no") ||(statusMember.equals("NO"))){
            return false;
        }
        return false;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember == true){
            return discount = (float) (parServicePrice * 0.10);
        }
        return discount = 0;
    }
    
   public float getTotalPay(float priceService, float discount) {
      return priceService - discount;
   }
}
