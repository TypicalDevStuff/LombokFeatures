import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "size")
class Wheel {

    private int size;

    private String type;
}
