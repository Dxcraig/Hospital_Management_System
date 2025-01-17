package org.example;

public class Main {
    public static void main(String[] args) {
       Patient pm = new Patient ("P001", "John Smith", 45, "Fever");
       Doctor dm = new Doctor ("D101", "Dr. Alice", "General Medicine");
       pm.updateDiagnosis("Flu");
       dm.treatPatient();
       pm.setAge(-45);
       pm.setDiagnosis("");
    }
}