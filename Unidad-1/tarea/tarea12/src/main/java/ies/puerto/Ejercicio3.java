package ies.puerto;

public class Ejercicio3 {
    //Desarrolla un programa que cuente el número de vocales en una cadena de texto.

    public static void main(String[] args) {
        String letra=("You're wearing my old clothes, but you, you wear it better\n" +
                "And every time I see your face, the moon should be jealous\n" +
                "And I keep talking to the wall 'til he's a friend of mine\n" +
                "I call you every hour just to tell you that I'm losing my mind\n" +
                "Now I know you're sleeping\n" +
                "Where I'm supposed to be in\n" +
                "Wish I could've stayed\n" +
                "Only thing that keeps us apart\n" +
                "Is seven thousand miles, running like a mad dog\n" +
                "Only thing that keeps us apart\n" +
                "Is a different timezone\n" +
                "So fuck what I'm dreaming, this fame has no meaning\n" +
                "I'm coming home\n" +
                "Only thing that keeps us apart\n" +
                "Is a different timezone\n" +
                "Tomorrow I got another plane, I'm not gonna take it\n" +
                "Instead, I'm gonna fly straight to you, I paid double for the tickets\n" +
                "And I don't give a shit about the contracts that I signed\n" +
                "And they can say whatever, we'll be making love, I'm fucking you tonight\n" +
                "Now I know you're sleeping\n" +
                "Where I'm supposed to be in\n" +
                "Wish I could've stayed\n" +
                "Only thing that keeps us apart\n" +
                "Is seven thousand miles, running like a mad dog\n" +
                "Only thing that keeps us apart\n" +
                "Is a different timezone\n" +
                "So fuck what I'm dreaming, this fame has no meaning\n" +
                "I'm coming home\n" +
                "Only thing that keeps us apart\n" +
                "Is a different timezone\n" +
                "So fuck what I'm dreaming, this fame has no meaning\n" +
                "I'm coming home\n" +
                "Only thing that keeps us apart\n" +
                "Is a different timezone");
        letra=letra.toLowerCase();
        int counter=0;
        for (int i = 0; i < letra.length(); i++) {
            if (letra.charAt(i)=='a' ||letra.charAt(i)=='e'||letra.charAt(i)=='i' ||letra.charAt(i)=='o'||letra.charAt(i)=='u'){
                counter++;
            }
        }
        System.out.println("Hay "+counter+" vocales");
    }
}
