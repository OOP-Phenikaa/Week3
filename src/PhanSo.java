public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }

    public void rutGonPhanSo() {
        int ucln = ucln(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    public int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    public void nghichDaoPhanSo() {
        int temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }

    public void nhanPhanSo(PhanSo ps) {
        tuSo *= ps.tuSo;
        mauSo *= ps.mauSo;
    }

    public void chiaPhanSo(PhanSo ps) {
        tuSo *= ps.mauSo;
        mauSo *= ps.tuSo;
    }

    public void congPhanSo(PhanSo ps) {
        tuSo = tuSo * ps.mauSo + ps.tuSo * mauSo;
        mauSo *= ps.mauSo;
    }

    public void truPhanSo(PhanSo ps) {
        tuSo = tuSo * ps.mauSo - ps.tuSo * mauSo;
        mauSo *= ps.mauSo;
    }
}
