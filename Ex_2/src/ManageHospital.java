import javax.print.Doc;

public class ManageHospital {
        public Doctor [] InfoDoctor(){
            Doctor [] doctors = new Doctor[2];
            doctors [0] = new Doctor(123,"Nguyễn Văn A",26,"Tiêu hóa",5);
            doctors [1] = new Doctor(456, "Nguyễn Văn B", 28, "Phụ sản", 10);
            return doctors;
        }
        public Patient [] InfoPatient(){
            Patient [] patients = new Patient[2];
            patients [0] = new Patient(678,"Trần Văn C",11,100001,"20/10/2023");
            patients [1] = new Patient(91011,"Phạm Thị D", 26, 100002,"12/03/2022");
            return patients;
        }
        public void printInfoDoctor (Doctor[]doctors){
            for (Doctor x:doctors) {
                System.out.println("ID: " + x.getId() + " - Tên: " + x.getName() + " - Tuổi: " + x.getAge() + " - Chuyên khoa: " + x.getDepartment() + " - Thời gian làm việc: " + x.getWorkTime() + " năm");
            }
        }
        public void printInfoPatinent (Patient[]patients){
            for (Patient y:patients) {
                System.out.println("ID: " + y.getId() + " - Tên: " + y.getName() + " - Tuổi: " + y.getAge() + " - Số hồ sơ: " + y.getNumberDocument() + " - Ngày nhập viện: " + y.getDateIn());
            }
        }
}
