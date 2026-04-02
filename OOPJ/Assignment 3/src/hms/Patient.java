package hms;

public class Patient {
    int patientID;
    String patientName;
    int age;
    String disease;
    ContactDetails contactDetails;

    static int totalPatient;

    public Patient() {
        totalPatient++;
    }

    public Patient(int patientID, String patientName, int age, String disease, ContactDetails contactDetails) {
        totalPatient++;
        this.contactDetails = contactDetails;
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    boolean isSeniorCitizen() {
        if (age >= 60)
            return true;
        return false;
    }

    void displayDetails() {
        System.out.println("----------------------------------------------");
        System.out.println("  ** Patient Report **");
        System.out.println("Patient ID    : " + patientName);
        System.out.println("Name          : " + patientID);
        System.out.println("Age           : " + age);
        System.out.println("Disease       : " + disease);
        System.out.println("Contact No    : " + contactDetails.contactNo);
        System.out.println("Address       : " + contactDetails.add);
        System.out.println(isSeniorCitizen() ? "Senior Citizen": "Not Senior Citizen");
        System.out.println();

    }

}
