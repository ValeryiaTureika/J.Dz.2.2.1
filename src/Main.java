public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int onlyMiles1 = service.calculate(10_000);
        System.out.println("Цена билета: 10 000 рублей; " + "Начисленные мили за билет: " + onlyMiles1);

        int onlyMiles2 = service.calculate(200);
        System.out.println("Цена билета: 200 рублей; " + "Начисленные мили за билет: " + onlyMiles2);

        int onlyMiles3 = service.calculate(6_000);
        System.out.println("Цена билета: 6 000 рублей; " + "Начисленные мили за билет: " + onlyMiles3);

        int onlyMiles4 = service.calculate(124_020);
        System.out.println("Цена билета: 124 020 рублей; " + "Начисленные мили за билет: " + onlyMiles4);

        int onlyMiles5 = service.calculate(0);
        System.out.println("Цена билета: 0 рублей; " + "Начисленные мили за билет: " + onlyMiles5);
    }
}
