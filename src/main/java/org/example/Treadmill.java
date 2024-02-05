package org.example;

class Treadmill {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void pass(Participant participant) {
        participant.run(distance);
    }
}