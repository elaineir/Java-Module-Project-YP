public class Race {
    private String currentWinnerName = "";
    private int currentWinnerDistance = 0;
    private int durationHours = 24;

    void determineWinner(Car car) {
        int distance = durationHours * car.getSpeed();

        if (distance > currentWinnerDistance) {
            currentWinnerName = car.getName();
            currentWinnerDistance = distance;
        }
    }

    String getCurrentWinnerName() {
        return currentWinnerName;
    }
}
