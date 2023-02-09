package bai2;

public class AlbumCD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int  soBaiHat;
    private float giaThanh;

    public AlbumCD(int maCD, String tuaCD, String caSy, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }


    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    public String toString(){
        return maCD +" "+tuaCD+" "+caSy+" "+soBaiHat+" "+giaThanh;
    }

    public static void main(String[] args) {
        AlbumCD A = new AlbumCD(22,"haha","Thang",22,2000);
        System.out.println(A);
    }
}
