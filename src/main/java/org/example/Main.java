package org.example;

public class Main {
    public static void main(String[] args) {

        // Task one
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // Task two
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameToUpperCase);

        // Task three
        fullName = "Иванов Семён Семёнович";
        String correctFullName = fullName.replaceAll("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника — " + correctFullName);
    }
}