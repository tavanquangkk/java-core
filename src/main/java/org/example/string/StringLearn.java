package org.example.string;

public class StringLearn {

    public static void main(String[] args) {
        String s1 = "welcome to quang jav";
        System.out.println(s1.charAt(16));
        System.out.println(s1.length());
        String s2 = s1 + ", I am 18 years old";
        System.out.println(s2);
        int age = 25;
        String name = "quang teo";
        // format method
        String s3 = String.format("xin chao %s, toi %d tuoi roi",name,age);
        System.out.println(s3);

        String q1 = "hello gpt";
        String q2 = q1;
        String q3 = q1.intern();

    }
}
