package x;

import javax.swing.JOptionPane;

public class bagatur {
static void bas(String ekranyaz) {
	
	
	int length=ekranyaz.length();int x=0;
    int basimadet=length*5;int dongusuresi=0;
	
    while(dongusuresi<basimadet) {
	String a=ekranyaz.substring(0, x);
	System.out.println(a);
	dongusuresi++;x++;
	if(length==x) {
		while(x>0) {
		 a=ekranyaz.substring(0, x);
		System.out.println(a);
		x--;
		}
	}
	}
	
	
	
	// CharSequence daha detaylı ögrenilecek
	
	
	
   
}
	public static void main(String[] args) {
		String ekranyaz = "Bagatur Serdaroglu Kanalına "
				+ "Abone Olmayı Unutmayın ....";
        String isenger ="Bekir İsenger Arduino Kursuna Gelmeyi Unutmayın ....";
		int karekterinilkgectigiyer,c=2;
                    
		String az;
		int length=ekranyaz.length();
    //  String st1 = ekranyaz.format(" %d",length);	
		String kesyaz=ekranyaz.substring(3);
		String kalitim=ekranyaz.intern();/* stringi kopyalama*/
	    String degistirme=ekranyaz.replace("Bagatur","bagatur");/*degiştirme */
//		System.out.println
		boolean cont;CharSequence cs1;
		String st1="  Merhaba Java   ";int len =st1.length();System.out.println("dizi uzunlugu "+ len);
		karekterinilkgectigiyer =ekranyaz.indexOf('S'); 		
		az=ekranyaz.concat(isenger) ;
		System.out.println(az+"concat");
		String mrb="merhaba".concat("java");
		System.out.println(mrb+"concat +");
		char aa=st1.charAt(4);
		System.out.println(karekterinilkgectigiyer+"karekterin int indexi");
		System.out.println(aa+"int tipinden karekterin indexi");
	    String formath = st1.format("%d",1);
	    System.out.println(formath);
	    /*bu satırı incele 57 ve contains in anlamını */
	     cont=st1.contains(" zed ");
        System.out.println(cont);	
        Boolean b1,b2;
        boolean b3;
         b1=new Boolean(true);
         b2=new Boolean(false);
        b3=b1.equals(b2);
        boolean dolumu = st1.isEmpty();
        String replace=st1.replace("Mer", "mER");
        String trim=st1.trim();
        String[] splite=st1.split("e",2);
        int index=st1.indexOf("l",5);
        int indexsub=st1.indexOf("Java");
        System.out.println("dolumu : "+dolumu);
        System.out.println("boolean equeals object = "+ b3);
        System.out.println("replace komutu char ile kullanımı "+replace);
        System.out.println("trim komutu/"+trim+"/baştaki ve sondaki boşlukları kaldırır");
        System.out.println("string splite ı anlamak"+splite);
        System.out.println("indexof"+index+"indexof stirng "+indexsub);
        /*      String sifre = JOptionPane.showInputDialog("şifrenizi kaydedin");
      int	say =0;
      while(say<2) {s
    String test=JOptionPane.showInputDialog("şifre gir");
   boolean dogrumu=sifre.contains(test);
		   if(dogrumu==true ) {
			   	say=2;
			   System.out.println("şifre dogru");
}
		   else {
			   JOptionPane.showMessageDialog(null, "şifreyanlış", "tektardene",1);	   
			   }
      }
*/    
      	}

}
/* while(dongusuresi<basimadet);*/

       /* string metotları */

/* Dizi oluşturma Creating String 
 * String oluştrumanın en dogrudan yolu yazmaktır The most direct way to create a string is to write 
 * String str1 = "merhaba dünya"             
 *  
 * Başka bir string  nesnesi oluşturma Using another String object 
 * String str2 = new String(str1);
 * 
 * Yeni anahter kelime kullanma Using new Keyword 
 * String str3=new String("java");
 * 
 *Kullanma + operetör(birleştirme) Using + operator (concatenation)  
 *String str4 = str2  + str1 ;
 *
 * Dizgi uzunlugu  String Length
 * length () yötemi,dizi nesnesindeki karekter sayısını döndürür
 * String str1="Merhaba Java";
 * int len = str1.length();
 * System.out.println("dizgi uzunlugu " + len);
 * compile and running = 12
 * 
 * Dizileri birleştime  Concatenating String
 * String sınıfı iki diziyi birleştirmek için bir yöntem içerir 
 * String1.concat(string2);
 * String1 in içersine string2 dizisini ekler 
 * concat komutu aşagıdaki gibide kullanıla bilirnir
 * "merhaba".concat("java");
 * veya 
 * "merhaba"+"java"+"!";
 * şeklindede dizi birleştirile bilinir 
 * 
 * Dizi yötemleri String Methods
 * 
 *1 char charAt(int index);
 * return char value for the particular index
 * (belirli bir dizin için karekter degeri dondurur)
 * eger charAt i in ile kullanırmsam binnary karşılıgını verir
 * 
 * 
 *2 int length();
 * returns string length
 * dizinin kerekter sayısını veriri 
 *  
 *3 static String format(String,format,Object..args);
 * returns formatted string
 * biçimlendirilmiş dize döndürür
 * 
 *4 static String format(local ı,String format,Object..args);
 * retuns formatted string with given locale
 * verilen  yerel ayarlarla biçimlerndirilmiş dizi döndürür
 * 
 *5 String substring(int beginIndex);
 * returns substring for given begin index
 * verilen başlangıc dizini için alt dizi döndürür
 * 
 *6 String substring(int beginIndex,int endIndex);
 * returns sunstirng for given begin index and end index
 * verilen başlangıc dizini ve bitiş dizini için alt dize döndür
 * 
 *7 boolean contains(CharSequence);
 * retuns true or false after matching the sequence of char value
 * karekter degerleri dizesini eşleştirdikten sonra dogru veya yanlış döndürür
 * 
 *8 boolean cont;CharSequence cs1; burada iki adet degişken tanımladım 
 * bolean  cont ve CharSequence 
 * ardından cont=string.contains("aramak istedigim kelime ");
 * eger aramak istedigim kelime strin in içinde yer alıyorsa true eger yer almıyorsa false 
 * dondurur
 * 
 *9 static String join(CharSequence,delimiter,CharSquence elements );
 * returns a joined string
 * birleştirlmiş bir dize dondurur
 * 
 *10 boolean equals(Object another); 
 * checks the equality of string with object 
 * dizinin nesne ile eşitligini kontrol eder
 * 
 *11 boolean isEmpyt();
 *checks if string is empty
 *dizinin boş olup olmadıgını belirtir
 * 
 *12 string concat(Sting str);
 *concatinates specified string 
 *belirtilen dizeyi birleştirir
 *
 *13 string replace(char old,char new);
 *replaces all occurrences of specified char value
 *belirten karekter degerinin tüm tekrarlarını degiştirir	
 *
 *14 string replace(CharSequenc old,CharSequence new);
 *replaces all occurrences of specified CharSequence 
 *belirten CharSequence-ın tüm tekrarlarını degiştirir
 *
 *15 string trim();
 *retruns trimmed string omitting leading and trailing spaces
 *ön arka boşlukları atlayn kesilmiş dize döndürür
 *
 *16 string split(String regex);
 *returns splitted string matching regex
 *bölünmüş dize eşleşen normal ifade döndürür 
 *
 *17 string split(string regex ,int limit);
 *returns splitted string matching regex and limit
 *bölünmüş dize eşelen normal ifade ve sınır döndürür
 *
 *18 string intern();
 *returns interned string
 *stajyer dize döndürür
 *
 *19 string indexOf(int ch);
 *returns specified char value index 
 *belirtilen karekter degeri döndürülür 
 *
 *20 string indexOf(int ch,int fromIndex);
 *returns specified char value index starting with given index
 *verilen dizinden başlayarak belirtilen karekter degerini döndürür
 *
 *21 int indexOf(String subtring);
 *returns specified substring
 *belirtilen alt dize döndürür
 *
 *22 int indexOf(String subtring,int fromIndex);
 *retruns specified substring index starting with given index
 *verilen dizinden başlayarak belirilen alt dize dizinini döndürür
 *
 *23 string toLowerCase();
 *returns string in lowercase
 *dizeyi küçük harfle döndürür
 *
 *24 string toLowerCase(Locale );
 *retruns string in lowercase using specified locale 
 *dizeyi belirtilen yerel ayarı kullanarak küçük harfe döndürülür 
 *uppercase bunların tam tersi
 *
 *
 *25 string toUpperCase();
 *retruns string in uppercase 
 *
 *
 *26 string toUpperCase(Local );
 *retuns string in uppercase using specifed locale
 *
 */
 

   
