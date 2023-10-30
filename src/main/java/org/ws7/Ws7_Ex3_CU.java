package org.ws7;

import java.util.ArrayList;

public class Ws7_Ex3_CU {

    String nameCU;
    ArrayList<Ws7_Ex3_Mark> marks;
    int totalStudents;

    public Ws7_Ex3_CU(String nameCU, int totalStudents){

        this.nameCU = nameCU;
        this.marks = new ArrayList<>();
        this.totalStudents = totalStudents;

    }

    public String getNameCU() {
        return nameCU;
    }

    public void setNameCU(String nameCU) {
        this.nameCU = nameCU;
    }

    public ArrayList<Ws7_Ex3_Mark> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Ws7_Ex3_Mark> marks) {
        this.marks = marks;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public void insertMarkCU(int number, double mark ){
        marks.add(new Ws7_Ex3_Mark(number, mark));
    }

    public double searchStudent (int numStudent){
        for (Ws7_Ex3_Mark mark: marks) {
            if(mark.getNumStudent() == numStudent){
                return mark.getMark();
            }
        }
        return -1;
    }

    public double averageCU(){
        double average = 0;
        for (Ws7_Ex3_Mark mark: marks) {
            average+= mark.getMark();
        }
        return average/marks.size();
    }

    public boolean isApproved(int numStudent){
        for (Ws7_Ex3_Mark mark: marks) {
            if(mark.getNumStudent() == numStudent && mark.getMark()>=9.5){
                return true;
            }
        }
        return false;
    }
}
