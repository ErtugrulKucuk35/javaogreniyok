package x;

public class stringmetots {
static char karsiligi; static int binarrycode;
	public static void main(String[] args) {
	boolean ilkm;int sayac=0; int  binarrycode=0;
	String mainst1=("  merhaba benim adım Ertuğrul Küçük ben yazılım mühendisi olmayı istiyorum");
	int uzunluk=mainst1.length();
	mainst1=mainst1.substring(0);
	mainst1=mainst1.replace("Küçük", "KÜÇÜK");
	ilkm=mainst1.contains("m");
	while(sayac<uzunluk) {
    binarrycode=mainst1.charAt(sayac);
    karsiligi=mainst1.charAt(sayac);
	sayac++;
	System.out.println("txt binarrycode : "+binarrycode+ " : karşılıgı : "+ karsiligi);
	}
	System.out.println("txt uzunlugu = "+uzunluk+" txt içerigi : "+mainst1 + " txtnin ilk harfi : "+ilkm);
    System.out.println("txt  harfi "+ karsiligi);	
	}

}
