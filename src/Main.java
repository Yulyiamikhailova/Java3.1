public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price1 = 10_000;
        int price2 = 100_000;

        int miles1 = service.calculate(price1);
        System.out.println(miles1 + "миль");

        int miles2 = service.calculate(price2);
        System.out.println(miles2 + "миль");
    }
}
