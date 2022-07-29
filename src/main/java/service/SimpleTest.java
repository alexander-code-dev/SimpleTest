package service;

import java.util.Scanner;

public class SimpleTest {
    private final Question[] questions;
    private final Scanner scanner;

    public SimpleTest(Question ... questions) {
        this.questions = questions;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Тестируемся
     */

    public void runTest() {
        for (Question question : questions) {

            System.out.println(question.getQuestionStr());
            Answer[] answers = question.getAnswers();
            for (int a = 1; answers.length >= a; a++) {
                System.out.println(a + ". " + answers[a - 1].getAnswerStr());
            }
            System.out.println("Что ответите?");

            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (question.getCorrectAnswerNumberInArray() == userAnswer) {
                    System.out.println("Правельно");
                    question.setUserAnswerIsCorrect(true);
                } else {
                    System.out.println("Не правельно");
                    question.setUserAnswerIsCorrect(false);
                }
            } else {
                System.out.println("Вы ввели фигню какуето а не цифру");
                break;
            }
        }
    }

    /**
     * Принтим коректные ответы
     */

    public void printCorrectAnswers() {
        int correctAnswers = 0;
        for (Question question:questions) {
            if (question.isUserAnswerIsCorrect())
                correctAnswers++;
        }
        System.out.println("Колличество правельных ответов - "+correctAnswers);
    }

    /**
     * Принтим количество вопросов
     */

    public void printTotalQuestions() {
        System.out.println("Всего заданно вопросов - "+questions.length);
    }
}
