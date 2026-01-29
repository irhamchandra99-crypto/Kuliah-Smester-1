public class PraktikEx8 {
    public static void main (String[] args){
    //    seeMovie(5.0, 5.0);    
        seeMovie(13.0, 5.0);    
        seeMovie(9.0, 3.5);    
        seeMovie(15.0, 1.0);    
        
        
    }
    public static void seeMovie(double cost, double rating){
        if((cost <= 5.00) || (rating == 5.0 && cost <= 12.0) ){
            System.out.println("Very");
        }else if((cost >= 12.0 && rating == 5.0) ||(cost >= 5.0 && cost <= 11.99 && rating >= 2.0 && rating <= 4.0 ) ){
            System.out.println("Sort-of");
        }else {
            System.out.println("Not");
        }
        
    }
}

/*
Anda berpikir untuk pergi bersama teman-teman Anda ke bioskop. Tulislah metode Java seeMovie yang menerima dua parameter: harga tiket dalam dolar, dan jumlah bintang yang diterima film tersebut dari 5 bintang. Metode ini akan mencetak seberapa tertarik Anda (sangat, agak, atau tidak). Gunakan kriteria berikut:
- Anda suka dengan harga murah. Film apa pun yang harganya kurang dari $5.00 adalah film yang sangat ingin Anda tonton.
- Anda tidak menyukai film yang mahal. Anda tidak tertarik untuk menonton film seharga $12.00 atau lebih, kecuali jika film tersebut mendapatkan 5 bintang (itupun Anda hanya agak tertarik).
- Anda menyukai kualitas. Anda sangat tertarik untuk menonton film bintang 5 dengan harga di bawah $12.00.
- Anda cukup tertarik untuk menonton film dengan harga antara $5.00 - $11.99 yang juga memiliki 2-4 bintang.
- Anda tidak tertarik untuk menonton film lain yang tidak dijelaskan sebelumnya.

 */