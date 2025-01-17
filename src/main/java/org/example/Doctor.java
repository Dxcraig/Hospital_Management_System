package org.example;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private int patientsTreated;

    public Doctor(String doctorId, String name, String specialization){
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getDoctorId(){
        return doctorId;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public int getPatientsTreated(){
        return patientsTreated;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPatientsTreated(int patientsTreated) {
        this.patientsTreated = patientsTreated;
    }
    public void treatPatient(){
        patientsTreated++;
        System.out.println("Total patients treated: " + patientsTreated);
    }
}
