public class Q1Main {
    public static void main(String[] args) {
        QuestionOne q1 = new QuestionOne();
        q1.A = 12;//        Since A is set as final variable which is being charged.
        q1.b = 12;
        q1.c = 12;//Since c is set private which can’t access it in public.
        q1.methodOne(12);//methodOne is a private method that can’t access it in public.
        q1.methodOne();
        System.out.println(q1.methodTwo());
        q1.b = q1.methodTwo();//Q1.b assess a wrong data type which is required to input float.
    }
}
