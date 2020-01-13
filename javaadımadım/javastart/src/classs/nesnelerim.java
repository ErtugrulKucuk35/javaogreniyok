package classs;

public class nesnelerim {
/*nesnerler*/
	/* fonksiyonlar*/
      int speed=0;
    	int gearup=0;
    void changespeed(int newValue) {
     	speed=newValue;
    }
    	void changegearup(int gearupdown) {
    	gearup=gearupdown;
    	}
    	 void goster(  ) {
System.out.println("speed : "+speed+"gear : "+gearup);
    	}
	public int toplamafonkisyonu(int a ,int b){
		
 	int sonuc =a+b;
 		
 		return sonuc ;
	}
	public int cikarma (int a,int b) {
		int sonuc=a-b;
	System.out.println("hesaplama = "+sonuc);
		return sonuc ;
	}
}
    