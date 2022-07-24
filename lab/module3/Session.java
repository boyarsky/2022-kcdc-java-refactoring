package module3;

import java.time.LocalDate;

public abstract class Session {
    public abstract int getNumberMinutes();
    public abstract LocalDate getStartTime();
    public abstract LocalDate getEndTime();
}