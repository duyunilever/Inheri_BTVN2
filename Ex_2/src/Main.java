public class Main {
    public static void main(String[] args) {
        ManageHospital manageHospital = new ManageHospital();
        Doctor [] doctors = manageHospital.InfoDoctor();
        Patient [] patients = manageHospital.InfoPatient();
        manageHospital.printInfoDoctor(doctors);
        manageHospital.printInfoPatinent(patients);
    }
}