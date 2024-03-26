package inhatc.cse.spring.di.multixml;

public class Family {

    private String papaName;

    private String maniName;

    private String sisterName;

    private String brotherName;

    public Family(String papaName, String maniName) {
        this.papaName = papaName;
        this.maniName = maniName;
    }

    public String getPapaName() {
        return papaName;
    }

    public void setPapaName(String papaName) {
        this.papaName = papaName;
    }

    public String getManiName() {
        return maniName;
    }

    public void setManiName(String maniName) {
        this.maniName = maniName;
    }

    public String getSisterName() {
        return sisterName;
    }

    public void setSisterName(String sisterName) {
        this.sisterName = sisterName;
    }

    public String getBrotherName() {
        return brotherName;
    }

    public void setBrotherName(String brotherName) {
        this.brotherName = brotherName;
    }
}
