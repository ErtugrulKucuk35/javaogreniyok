package javastart;

public class dongulervesorular {
public static void main (String[] args){
int a=100;
for(; a>0; a--) {
if(0!=(a%2) ){
	System.out.println("tek sayı = "+a);	
   
}

}

while (a<100) {
	if(0==(a % 2))
	   System.out.println("çift say = "+ a);	
	a++;
}


}
}
/* for dongusuyle tek sayıları ekrana yazdırma */