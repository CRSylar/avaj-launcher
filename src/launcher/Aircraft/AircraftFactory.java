package launcher.Aircraft;

import java.util.UUID;

public class AircraftFactory {
    public static Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinate){

        return switch (p_type) {
            case "Helicopter" -> new Helicopter(1, p_name, p_coordinate);
            case "Baloon" -> new Baloon(1, p_name, p_coordinate);
            case "JetPlane" -> new JetPlane(1, p_name, p_coordinate);
            default -> throw new RuntimeException();
        };
    }
}
