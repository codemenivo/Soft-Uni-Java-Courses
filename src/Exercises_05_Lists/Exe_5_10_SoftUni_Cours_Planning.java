package Exercises_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_10_SoftUni_Cours_Planning {
    public static void main(String[] args) {
        /* На първия входен ред ще получите първоначалния график на уроците и упражненията, които ще бъдат част от
        * следващия курс, разделени със запетая и интервал ", " . Преди да стартира курса трябва да се направят някои
        * промени. Докато не получите "course start" , ще получавате комнди за промени по графика. Възможните команди
        * са :  - Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist.
        *       - Insert:{lessonTitle}:{index} -insert the lesson to the given index, if it does not exist
        *       - Remove:{lessonTitle} -remove the lesson, if it exists
        *       - Swap:{lessonTitle}:{lessonTitle} -change the place of the two lessons, if they exist
        *       - Exercise:{lessonTitle} -add Exercise in the schedule right after the lesson index, if the lesson
        *   exists and there is no exercise already, in the following format "{lessonTitle}-Exercise".
        *   If the lesson doesn't exist, add the lesson in the end of the course schedule, followed by the Exercise.
        *   Всеки път, когато сменяте или премахвате урок, трябва да направите същото с упражненията, ако има такива,
        *  които следват уроците.
        *   Вход :
        *       •	On the first line -the initial schedule lessons -strings, separated by comma and space ", "
        *        •	Until "course start" you will receive commands in the format described above
        *   Изход :
        *       •	Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
        *        "{lesson index}.{lessonTitle}"
        *       •	Allowed working time / memory: 100ms / 16MB
        *
         * */

        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", +")).collect(Collectors.toList());
        String textLine = scanner.nextLine();

        while (!"course start".equals(textLine)) {
            String[] splitLine = textLine.split(":");
            String command = splitLine[0];
            String lessonTitle1 = splitLine[1];

            switch (command) {
                case "Add":
                    addTheLesson(schedule, lessonTitle1);
                    break;

                case "Insert":
                    int index = Integer.parseInt(splitLine[2]);

                    insertLessonTitleToTheIndex(schedule, lessonTitle1, index);

                    break;

                case "Remove":
                    removeLesson(schedule, lessonTitle1);
                    break;

                case "Swap":
                    String lessonTitle2 = splitLine[2];
                    swapThePlaceOfTwoLessons(schedule, lessonTitle1, lessonTitle2);
                    break;

                case "Exercise":
                    addExerciseInTheSchedule(schedule, lessonTitle1);
                    break;
            }




            textLine = scanner.nextLine();
        }

        printEndScheduieList(schedule);

    }

    private static void printEndScheduieList(List<String> schedule) {
        for (int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, schedule.get(i));
        }
    }

    private static void addExerciseInTheSchedule(List<String> schedule, String lessonTitle1) {
        String exercise = lessonTitle1 + "-Exercise";
        if (schedule.contains(lessonTitle1) && !schedule.contains(exercise)) {
            int index = schedule.indexOf(lessonTitle1);
            schedule.add(index + 1, exercise);

        } else if (!schedule.contains(lessonTitle1)) {
            schedule.add(lessonTitle1);
            schedule.add(exercise);
        }
    }

    private static void swapThePlaceOfTwoLessons(List<String> schedule, String lessonTitle1, String lessonTitle2) {
        if (schedule.contains(lessonTitle1) && schedule.contains(lessonTitle2)) {
          /* Ако не използваме метода .indexOf, работим с for цикъл и след като намерим индексите разменяме местата.
            int index1 = -1;
            int index2 = -1;
            for (int i = 0; i < schedule.size(); i++) {
                if (schedule.get(i).equals(lessonTitle1)) {
                    index1 = i;
                } else if (schedule.get(i).equals(lessonTitle2)) {
                    index2 = i;
                }
            }
           */

            int index1 = schedule.indexOf(lessonTitle1);
            int index2 = schedule.indexOf(lessonTitle2);
            schedule.set(index1, lessonTitle2);
            schedule.set(index2, lessonTitle1);

            String exercise1 = lessonTitle1 + "-Exercise";
            String exercise2 = lessonTitle2 + "-Exercise";

            if (schedule.contains(exercise1)) {
                schedule.remove(index1 + 1);
                schedule.add(index2 + 1, exercise1);
            }

            if (schedule.contains(exercise2)) {
            schedule.remove(index2 + 1);
            schedule.add(index1 + 1, exercise2);
            }


        }
    }

    private static void removeLesson(List<String> schedule, String lessonTitle1) {
        if (schedule.contains(lessonTitle1)) {
            schedule.remove(lessonTitle1);

            String exercise = lessonTitle1 + "-Exercise";
            if (schedule.contains(exercise)) {
                schedule.remove(exercise);
            }
        }
    }

    private static void insertLessonTitleToTheIndex(List<String> schedule, String lessonTitle1, int index) {
        if (!schedule.contains(lessonTitle1)) {
            schedule.add(index, lessonTitle1);
        }
    }

    private static void addTheLesson(List<String> schedule, String lessonTitle1) {
        if (!schedule.contains(lessonTitle1)) {
            schedule.add(lessonTitle1);
        }
    }
}
