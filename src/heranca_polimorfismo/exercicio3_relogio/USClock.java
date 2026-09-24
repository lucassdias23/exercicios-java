package heranca_polimorfismo.exercicio3_relogio;

public non-sealed class USClock extends Clock{

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay() {
        this.periodIndicator = "AM";
    }

    @Override
    public void setHour(int hour) {

        int h = hour % 24;

        if (h == 0) {
            this.hour = 12;
            setBeforeMidDay();
            return;
        }

        if (h == 12) {
            this.hour = 12;
            setAfterMidDay();
            return;
        }

        if (h > 12) {
            this.hour = h - 12;
            setAfterMidDay();
            return;
        }

        this.hour = h;
        setBeforeMidDay();
    }

    @Override
    Clock convert(final Clock clock) {

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
}
