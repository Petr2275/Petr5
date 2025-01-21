import java.time.LocalDate;

public class BioCarrot {
    public static void main(String[] args) {
        String selerName = ("Karel Novák");
        LocalDate dateOfBirth = LocalDate.of(1984,06,10);
        double contractsNnegotiatedSoFar = 15.254;
        double totalAmountOfCarrotsSoldInTons = 4.25;
        String pointOfSale = "Karlovy Vary";
        String carRegistracionPlate = ("4AX1924");
        double vehicleConsumptionInLiters = 12.5;

        System.out.println("Jnéno prodejce: " + selerName);
        System.out.println("Datum narození: " + dateOfBirth);
        System.out.println("Počet sjednaných smluv: " + contractsNnegotiatedSoFar);
        System.out.println("Prodaná mrkev v tunách: " + totalAmountOfCarrotsSoldInTons);
        System.out.println("Místo prodeje: " + pointOfSale);
        System.out.println("SPZ vozidla: " + carRegistracionPlate);
        System.out.println("Spotřeba vozidla v litrech: " + vehicleConsumptionInLiters);








    }
}