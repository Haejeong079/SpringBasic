package inhatc.cse.spring.di.properties;

import java.util.ArrayList;

public class MyInfo {
    private String name;
    private double height;
    private double weight;
    private ArrayList<String> hobbys;
    private BMICalc bmiCalc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(ArrayList<String> hobbys) {
        this.hobbys = hobbys;
    }

    public BMICalc getBmiCalc() {
        return bmiCalc;
    }

    public void setBmiCalc(BMICalc bmiCalc) {
        this.bmiCalc = bmiCalc;
    }

    @Override
    public String toString() {
        return "MyInfo{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hobbys=" + hobbys +
                ", bmiCalc=" + bmiCalc +
                '}';
    }

    public MyInfo(String name, ArrayList<String> hobbys) {
        this.name = name;
        this.hobbys = hobbys;
    }
}