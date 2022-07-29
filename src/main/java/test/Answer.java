package test;

import java.util.Objects;

/**
 * Ответ
 */
public class Answer {

    private final String answerStr;
    private final boolean isCorrect;

    public Answer(String answerStr, boolean isCorrect) {
        this.answerStr = answerStr;
        this.isCorrect = isCorrect;
    }

    /**
     * Текст ответа
     * @return - строка ответа
     */
    public String getAnswerStr() {
        return answerStr;
    }

    /**
     * Признак коректного ответа
     * @return да/нет
     */
    public boolean isCorrect() {
        return isCorrect;
    }

    @Override
    public String toString() {
        return "test.Answer{" +
                "answerStr='" + answerStr + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return isCorrect == answer.isCorrect && Objects.equals(answerStr, answer.answerStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerStr, isCorrect);
    }
}
