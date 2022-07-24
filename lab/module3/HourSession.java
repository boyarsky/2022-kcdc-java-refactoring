package module3;

import java.time.LocalDate;
import java.util.Objects;

public final class HourSession extends Session {

    private LocalDate startTime;
    private LocalDate endTime;

    public HourSession(LocalDate startTime, LocalDate endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int getNumberMinutes() {
        return 60;
    }

    @Override
    public LocalDate getStartTime() {
        return startTime;
    }

    @Override
    public LocalDate getEndTime() {
        return endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourSession that = (HourSession) o;
        return Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        return "HourSession{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
