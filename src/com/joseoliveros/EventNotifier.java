package com.joseoliveros;

public class EventNotifier {

    private InterestingEvent ie;
    private boolean somethingHappened;

    public EventNotifier(InterestingEvent ie) {

        this.ie = ie;
        somethingHappened = true;
    }

    public void doWork() {
        if (somethingHappened) {
            ie.interestingEvent();
        }
    }
}
