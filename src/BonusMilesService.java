public class BonusMilesService {
    public int calculate(int priceOfOneBonusMile, int ticketPrice) {
        int onlyMiles = ticketPrice / priceOfOneBonusMile;
        return onlyMiles;
    }
}
