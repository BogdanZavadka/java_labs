package ua.lviv.iot.laba1;

public record Interview(String interviewerName, double duration, boolean success, String intervieweeName, int intervieweeAge, int intervieweeExperience) {

    final static String jobName = "FrontEnd";

    public Interview() {
        this("Interviewer Name 1");
    }

    public Interview(String interviewerName){
        this(interviewerName, 1);
    }

    public Interview(String interviewerName, double duration){

        this(interviewerName, duration, true, "Interviewee Name 1", 21, 1);
    }

    @Override
    public String toString(){
        return "Interviewer Name: " + interviewerName + "\nduration: " + duration +
                "\nwas interview successful: " + success + "\nInterviewee Name: " +
                intervieweeName + "\nInterviewee age: " + intervieweeAge + "\nInterviewee experience: " +
                intervieweeExperience;
    }

    public static String getJobName(){
        return jobName;
    }



}
