package org.kodluyoruz;

/**
 * Bu sınıf bir ekran kartını temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her ekran kartının Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 4 GB, 8 GB vs.
 *      - Renk skalası (bits) (int türünde) Örnek: 128 bits, 256 bits vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class GPU extends Hardware
{
    private int memory;
    private int bits;

    public int getMemory() {
        return memory;
    }
    public int getBits(){
        return bits;
    }

    public void setBits(int bits){
        this.bits=bits;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public void setBrand( String brand) {
        this.brand=brand;
    }

    @Override
    public void setPower(int power) {
        this.power=power;
    }


    @Override
    public double setPrice(double price) {
         this.price = price;
         double newprice2=this.price;
         if(getMemory()>8){
             for(int i=2;i<getMemory();i+=2){
                 newprice2+=250;
             }
        }
         if(getMemory()>128){
            for(int i=64;i<getBits();i+=64){
                newprice2+=400;
            }
        }
        return newprice2;
    }


    /*
     * Eğer ekran kartının hafızası 8 GB'tan fazlaysa, her 2 GB için fiyatı 250 TL artar.
     * Eğer ekran kartının renk skalası 128 bits'ten fazlaysa, her 64 bits için fiyatı 400 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */


}
