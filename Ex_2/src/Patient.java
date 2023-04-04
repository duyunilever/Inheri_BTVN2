import java.util.Date;

public class Patient extends Person{
    private int numberDocument;
    private String dateIn;

    public Patient(int id, String name, int age, int numberDocument, String dateIn) {
        super(id, name, age);
        this.numberDocument = numberDocument;
        this.dateIn = dateIn;
    }

    public Patient(int numberDocument, String dateIn) {
        this.numberDocument = numberDocument;
        this.dateIn = dateIn;
    }

    public Patient() {
    }

    public int getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(int numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }
}
