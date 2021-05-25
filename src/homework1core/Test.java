package homework1core;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        Random random = new Random();

        Activity[] activity = new Activity[3];

        int distance = random.nextInt(20);
        int heigth = random.nextInt(10);
        activity[0] = new Human("Иван", distance, heigth);

        distance = random.nextInt(15);
        heigth = random.nextInt(6);
        activity[1] = new Robot("F1", distance, heigth);

        distance = random.nextInt(15);
        heigth = random.nextInt(6);
        activity[2] = new Cat("Тим", distance, heigth);

        Obstacles[] obstacles = new Obstacles[6];

        boolean isTreadmill;
        for (int i = 0; i < obstacles.length; i++) {
            distance = random.nextInt(15);
            isTreadmill = random.nextBoolean();
            if (isTreadmill) {
                obstacles[i] = new Treadmill("Treadmill" + i, distance);
            } else {
                obstacles[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < activity.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {

                result = obstacles[j].moving(activity[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Пройдено");
            } else {
                System.out.println("Не пройдено!");
            }
        }
    }


}


