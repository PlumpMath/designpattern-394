package com.joseoliveros;

public class CallMe implements InterestingEvent {

    private EventNotifier en;

    public CallMe() {
        en = new EventNotifier(this);
        en.doWork();
    }

    @Override
    public void interestingEvent() {
        System.out.println("hice algo");
    }
}
