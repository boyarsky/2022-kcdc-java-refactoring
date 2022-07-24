package module2;

public class WeatherEmergency {

    private static class Tornado extends WeatherEmergency {
        public void goToShelter() {
            System.out.println("Go to tornado shelter");
        }
    }

    private static class Hurricane extends WeatherEmergency {
        public void evacuate() {
            System.out.println("Evacuate inland");
        }
    }

    private static class Earthquake extends WeatherEmergency {
        public void dropCoverHold() {
            System.out.println("Drop! Cover! Hold!");
        }
    }


    public static void main(String[] args) {
        handle(new Tornado());
        handle(new Hurricane());
        handle(new Earthquake());
    }

    public static void handle(WeatherEmergency emergency) {
        if (emergency instanceof Tornado) {
            Tornado t = (Tornado) emergency;
            t.goToShelter();
        } else if (emergency instanceof Hurricane) {
            Hurricane h = (Hurricane) emergency;
            h.evacuate();
        } else if (emergency instanceof Earthquake) {
            Earthquake e = (Earthquake) emergency;
            e.dropCoverHold();
        } else {
            throw new IllegalStateException("Unexpected emergency. Panic!");
        }
    }
}

