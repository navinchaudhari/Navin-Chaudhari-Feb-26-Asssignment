package hms;

public class PatientMain {
    public static void main(String[] args) {
        ContactDetails cd1 = new ContactDetails("451236", "New Jersy");
        Patient p1 = new Patient(1, "Jake", 23, "TB", cd1);

        ContactDetails cd2 = new ContactDetails("856974", "Tokyo");
        Patient p2 = new Patient(2, "Ziang",65,"blockage" ,cd2);

        ContactDetails cd3 = new ContactDetails();
        Patient p3 = new Patient();

        ContactDetails cd4 = new ContactDetails();
        Patient p4 = new Patient();

        p1.displayDetails();
        p2.displayDetails();

        System.out.println("Total Patient: " + Patient.totalPatient);

    }
}
