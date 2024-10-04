package BloodDataChallenge;

public class BloodData {
    private String bloodType;
    private String rhFactor;

    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public String getBlood() {
        return bloodType;
    }

    public void setBlood(String bloodType) {
        if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
            this.bloodType = bloodType;
        } else {
            System.out.println("Invalid blood type. Please enter A, B, AB, or O.");
        }
    }

    public String getRH() {
        return rhFactor;
    }

    public void setRH(String rhFactor) {
        if (rhFactor.equals("+") || rhFactor.equals("-")) {
            this.rhFactor = rhFactor;
        } else {
            System.out.println("Invalid Rh factor. Please enter + or -.");
        }
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
