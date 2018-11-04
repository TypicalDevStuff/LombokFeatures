import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
class Rider {

    private String firstName;

    private String secondName;

    private Bicycle ownedBicycle;

    public void changeWheel(@NonNull final Wheel wheel) {
        if (!ownedBicycle.getWheel().equals(wheel)) {
            ownedBicycle.setWheel(wheel);
        }
    }
}
