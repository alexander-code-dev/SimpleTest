import service.Answer;
import service.Question;
import service.SimpleTest;

public class Application {
    public static void main(String[] args) {
        // первый вопрос
        Answer answer1Question1 = new Answer("Васька", true);
        Answer answer2Question1 = new Answer("Володька", false);
        Answer[] answersQuestion1 = {answer1Question1, answer2Question1};
        Question question1 = new Question("Как звать тебя Васька?", answersQuestion1);

        // второй вопрос
        Answer answer1Question2 = new Answer("Упал с неба", true);
        Answer answer2Question2 = new Answer("С челябы", false);
        Answer answer3Question2 = new Answer("Сам не знаю", false);
        Answer[] answersQuestion2 = {answer1Question2, answer2Question2, answer3Question2};
        Question question2 = new Question("Откуда ты?", answersQuestion2);

        // третий вопрос
        Answer answer1Question3 = new Answer("жепа", true);
        Answer answer2Question3 = new Answer("да норм так", false);
        Answer[] answersQuestion3 = {answer1Question3, answer2Question3};
        Question question3 = new Question("И как там?", answersQuestion3);

        // тестируемся
        SimpleTest simpleTest = new SimpleTest(question1, question2, question3);
        simpleTest.runTest();
        simpleTest.printTotalQuestions();
        simpleTest.printCorrectAnswers();
    }
}
