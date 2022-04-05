package ua.lviv.iot.laba1;

public class Main {
    public static void main(String[] args) {
        Interview interview1 = new Interview();
        Interview interview2 = new Interview("Interviewer Name 2");
        Interview interview3 = new Interview("Interviewer Name 3", 2);
        System.out.println("Interview 1:");
        System.out.println(interview1);
        System.out.println("\nInterview 2:");
        System.out.println(interview2);
        System.out.println("\nInterview 3:");
        System.out.println(interview3);
        System.out.println("");
        System.out.println(Interview.getJobName());


    }
}
