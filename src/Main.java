public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int onlyMiles1 = service.calculate(20, 10_000);
        System.out.println(onlyMiles1);

        int onlyMiles2 = service.calculate(20, 200);
        System.out.println(onlyMiles2);

        int onlyMiles3 = service.calculate(20, 6_000);
        System.out.println(onlyMiles3);

        int onlyMiles4 = service.calculate(20, 124_020);
        System.out.println(onlyMiles4);

        int onlyMiles5 = service.calculate(20, 0);
        System.out.println(onlyMiles5);
    }
}
