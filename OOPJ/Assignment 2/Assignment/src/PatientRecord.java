public class PatientRecord {
    int patientID;
    String patientName;
    int age;
    String disease;

    public PatientRecord() {
    }

    public PatientRecord(int patientID, String patientName, int age, String disease) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    void printDetails() {
        System.out.println("========================================");
        System.out.println("    Patient Details");
        System.out.println("ID      : " + patientID);
        System.out.println("Name    : " + patientName);
        System.out.println("Age     : " + age);
        System.out.println("Disease : " + disease);
        if (checkSeniorCitizen()) System.out.println(patientName + " is a Senior Citizen");
        else System.out.println(patientName + " is not a Senior Citizen");
        System.out.println("========================================");
    }

    boolean checkSeniorCitizen() {
        if (age >= 60) return true;
        return false;
    }

    public static void main(String[] args) {
        PatientRecord p1 = new PatientRecord(123, "Jake", 35, "Fever");
        PatientRecord p2 = new PatientRecord(124, "Karl", 65, "Blockage");
        PatientRecord p3 = new PatientRecord(352, "King", 46, "TB");

        p1.printDetails();
        p1.checkSeniorCitizen();

        p2.printDetails();
        p2.checkSeniorCitizen();

        p3.printDetails();
        p3.checkSeniorCitizen();

    }
}
