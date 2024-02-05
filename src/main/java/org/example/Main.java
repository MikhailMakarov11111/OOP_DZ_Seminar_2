package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание участников
        Participant[] participants = {
                new Human("Иван", 500, 1),
                new Cat("Барсик", 200, 2),
                new Robot("Робот", 1000, 3)
        };

        // Создание препятствий
        Object[] obstacles = {
                new Treadmill(400),
                new Wall(1),
                new Treadmill(800),
                new Wall(2)
        };

        // Прохождение препятствий участниками
        for (Participant participant : participants) {
            boolean canContinue = true;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    ((Treadmill) obstacle).pass(participant);
                } else if (obstacle instanceof Wall) {
                    ((Wall) obstacle).pass(participant);
                };
            };
        };
    };
}