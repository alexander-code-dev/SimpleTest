package test;

import java.util.Arrays;
import java.util.Objects;

/**
 * Вопрос
 */
public class Question {

    private final String questionStr;
    private boolean userAnswerIsCorrect;
    private final Answer[] answers;

    public Question(String questionStr, Answer[] answers) {
        this.questionStr = questionStr;
        this.userAnswerIsCorrect = false;
        this.answers = answers;
    }

    /**
     * Строка вопроса
     * @return - возращает строку вопроса
     */

    public String getQuestionStr() {
        return questionStr;
    }

    /**
     * Коректен ли был ответ пользователя
     * @return да/нет
     */

    public boolean isUserAnswerIsCorrect() {
        return userAnswerIsCorrect;
    }

    /**
     * Установить ответ на вопрос
     * @param userAnswerIsCorrect
     */

    public void setUserAnswerIsCorrect(boolean userAnswerIsCorrect) {
        this.userAnswerIsCorrect = userAnswerIsCorrect;
    }

    /**
     * Ответы по вопросу
     * @return - список ответов
     */

    public Answer[] getAnswers() {
        return answers;
    }

    /**
     * Поиск коректного ответа
     * @return - возращает номер коректного ответа
     */

    public int getCorrectAnswerNumberInArray() {
        for (int i = 0; this.answers.length > i; i++) {
            if (this.answers[i].isCorrect()) {
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "test.Question{" +
                "questionStr='" + questionStr + '\'' +
                ", userAnswerIsCorrect=" + userAnswerIsCorrect +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return userAnswerIsCorrect == question.userAnswerIsCorrect && questionStr.equals(question.questionStr) && Arrays.equals(answers, question.answers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(questionStr, userAnswerIsCorrect);
        result = 31 * result + Arrays.hashCode(answers);
        return result;
    }
}
