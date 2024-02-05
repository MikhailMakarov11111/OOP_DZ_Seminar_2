package org.example;

class Robot extends Participant {
    public Robot(String name, int runLimit, int jumpLimit) {
        super(name, runLimit, jumpLimit);
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(name + " успешно прыгнул на " + height + " метров");
        } else {
            System.out.println(name + " не смог прыгнуть на " + height + " метров");
        }
    }
}