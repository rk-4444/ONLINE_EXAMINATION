package online_examination;

public class Question {
    int id;
    String ques;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String correctOpt;
    String userAns="";
    

    public Question(int Id,String quest, String optA, String optB, String optC, String optD, String corr) {

        id = Id;
        ques = quest;
        optionA = optA;
        optionB = optB;
        optionC = optC;
        optionD = optD;
        correctOpt = corr;
    }
}
