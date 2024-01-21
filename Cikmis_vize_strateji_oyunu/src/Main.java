//import java.math.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Avatar oyuncu1[]=new Avatar[5];
        Avatar oyuncu2[]=new Avatar[5];
        Random rnd=new Random();
        int puan1=0,puan2=0;
        int guc,tur;
        //Avatar i1[]=new Avatar[];
        //Avatar dizi[];
        //Avatar insan=new Avatar();

        for(int i=0;i<oyuncu1.length;i++)//tür ve gücü oto atanır
        {
            guc=1+rnd.nextInt(10);
            tur=1+rnd.nextInt(2);
            oyuncu1[i]=new Avatar(); // 1-10 , 1-2 ||*5
            oyuncu1[i].Setguc(guc);
            oyuncu1[i].SetTur(tur);
        }
        for(int i=0;i<oyuncu2.length;i++)//tür ve gücü oto atanır
        {
            guc=1+rnd.nextInt(10);
            tur=1+rnd.nextInt(2);
            oyuncu2[i]=new Avatar();
            oyuncu2[i].Setguc(guc);
            oyuncu2[i].SetTur(tur);
        }
        for (int i=0;i<oyuncu1.length;i++){
            System.out.println("Ilk oyuncu icin Tür:"+oyuncu1[i].GetTur()+ " Güç :"+oyuncu1[i].GetGuc());
        }
        for (int i=0;i<oyuncu2.length;i++){
            System.out.println("İkinci oyuncu icin Tür:"+oyuncu2[i].GetTur()+ " Güç :"+oyuncu2[i].GetGuc());
        }
       for(int i=0;i<oyuncu1.length;i++)
       {
           if(oyuncu1[i].GetTur()==oyuncu2[i].GetTur())
           {
               if(oyuncu1[i].GetGuc()>oyuncu2[i].GetGuc() )
               {
                   puan1+=oyuncu1[i].GetGuc()-oyuncu2[i].GetGuc();
               }
               else
               {
                   puan2+=oyuncu2[i].GetGuc()-oyuncu1[i].GetGuc();
               }
           }
           else
           {
               if(oyuncu1[i].GetTur()>oyuncu2[i].GetTur())
                   puan1+=10;
               else
                   puan2+=10;
           }
       }

        System.out.println("Oyuncu 1 pauni="+puan1);
        System.out.println("Oyuncu 2 pauni="+puan2);
        if(puan1>puan2)
            System.out.println("Kazanan birinci oyuncu");
        else
            if(puan1<puan2)
                System.out.println("Kazanan ikinci oyuncu");
            else
                System.out.println("Berabere");
    }

}
