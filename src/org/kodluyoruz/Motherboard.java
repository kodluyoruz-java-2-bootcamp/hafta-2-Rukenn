package org.kodluyoruz;

/**
 * Bu sınıf bir anakartı temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her anakartın Hardware sınıfındakilere ek olarak 3 özelliği vardır:
 *      - İşlemci mimarisi, yani hangi marka işlemcilere uygun olduğu (cpuArchitect) (String türünde) Örnek: AMD veya Intel
 *      - WiFi olup olmadığı (wifiIncluded) (boolean türünde)
 *      - Bluetooth olup olmadığı (bluetoothIncluded) (boolean türünde)
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class Motherboard extends Hardware
{
    private String cpuArchitect;
    private boolean wifiIncluded;
    private boolean bluetoothIncluded;

    public String getCpuArchitect() {
        return cpuArchitect;
    }
    public void setCpuArchitect(String cpuArchitect) {
        this.cpuArchitect = cpuArchitect;
    }

    public boolean getWifiIncluded() {
        return wifiIncluded;
    }
    public void setWifiIncluded(boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public boolean getBluetoothIncluded() {
        return bluetoothIncluded;
    }
    public void setBluetoothIncluded(boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
    }

    @Override
    public void setBrand(String brand) {
        this.brand=brand;
    }

    @Override
    public double setPrice(double price) {
       this.price=price;
       double newprice3=this.price;
       if(getWifiIncluded())
           newprice3+=250;
       if(getBluetoothIncluded())
           newprice3+=100;
        return price;
    }

    @Override
    public void setPower(int power) {
        this.power=power;
    }



    /*
     * Eğer anakartın üzerinde WiFi chipset'i varsa anakartın fiyatı 250 TL artar.
     * Eğer anakartın üzerinde bluetooth chipset'i varsa anakartın fiyatı 100 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

}
