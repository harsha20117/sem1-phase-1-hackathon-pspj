import java.util.Scanner;
public class q2c {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter morning energy(kWh): ");
        double morningEnergy = s.nextDouble();
        System.out.print("Enter evening energy(kWh): ");
        double eveningEnergy = s.nextDouble();
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total energy generated: "+totalEnergy+" kWh");
        s.close();
    }
}