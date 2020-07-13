package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Çekirdek sayısı (cores) (int türünde)
 *      - Thread sayısı (threads) (int türünde)
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware {
    private int cores;
    private int threads;


    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }


    @Override
    public double setPrice(double price) {
        this.price = price;
        double newprice = this.price;
        if (getCores() >= 6) {
            newprice += (newprice * 0.3);
            return newprice;
        }
        return newprice;
    }

    /*
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

}
