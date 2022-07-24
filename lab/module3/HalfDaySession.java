package module3;

import java.time.LocalDate;
import java.util.Objects;

public final class HalfDaySession extends Session {

    private LocalDate startTime;
    private LocalDate endTime;
    private int numBreaks;

    public HalfDaySession(LocalDate startTime, LocalDate endTime, int numBreaks) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.numBreaks = numBreaks;
    }

    @Override
    public int getNumberMinutes() {
        return 60 * 4;
    }

    @Override
    public LocalDate getStartTime() {
        return startTime;
    }

    @Override
    public LocalDate getEndTime() {
        return endTime;
    }

    public int numberBreaks() {
        return numBreaks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HalfDaySession that = (HalfDaySession) o;
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
