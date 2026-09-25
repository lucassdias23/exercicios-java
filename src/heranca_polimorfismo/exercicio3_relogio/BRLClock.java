package heranca_polimorfismo.exercicio3_relogio;

public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case USClock usClock -> {
                int h = usClock.getHour();
                boolean isPM = "PM".equals(usClock.getPeriodIndicator());

                if (isPM) {
                    this.hour = (h == 12) ? 12 : h + 12;
                } else {
                    this.hour = (h == 12) ? 0 : h;
                }
            }
            case BRLClock brlclock -> this.hour = brlclock.getHour();

        }

        return this;
    }
}