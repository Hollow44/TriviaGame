public class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(int answer) {
        if (answer == correctAnswer) {
            return true;
        } return false;
    }

}