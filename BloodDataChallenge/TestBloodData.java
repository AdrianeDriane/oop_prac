package BloodDataChallenge;

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BloodData patient = new BloodData();

        System.out.print("Enter Blood Type: ");
        String bloodType = scan.nextLine();
        patient.setBlood(bloodType);

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scan.nextLine();
        patient.setRH(rhFactor);

        patient.displayBloodInfo();
    }
}
