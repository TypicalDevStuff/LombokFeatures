import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Bicycle {

    private String name;

    private BigDecimal value;

    private Wheel wheel;
}