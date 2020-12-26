package com.kodilla.stream;

public class ForumStats {
    public static void main(String[] args) {
        double taskOne = UsersRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(taskOne);

        double taskTwo = UsersRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(taskTwo);
    }
}
