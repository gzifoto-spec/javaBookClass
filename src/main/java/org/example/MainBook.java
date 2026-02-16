package org.example;

import org.example.book.Book;

public class MainBook {

    private static Object book2;

    public static void main(String[] args) {
        Book book1 = new Book("Ciberíada",
                "Lem, Stanislaw",
                "Fábulas de robots para no robots",
                "978-84-9104-173-3",
                13.95f);

        System.out.println(book1.overview());

        Book book2 = new Book("El apoyo mutuo",
                "Kropotkin, Piotr",
                "Un factor de la evolución",
                "978-84-9404-041-2",
                10.00f);

        System.out.println(book2.overview());

        Book book3 = new Book("A esmorga",
                "Blanco Amor, Eduardo",
                "Metáfora dun mundo sórdido e miserento do que non están exentos a imaxinación, a fantasía e o devezo dunha vida fermosa e mellor",
                "978-84-9865-321-2",
                16.45f);

        System.out.println(book3.overview());

        Book book4 = new Book("El ocaso de los ídolos",
                "Nietzsche, Friedrich",
                "Cómo se filosofa a martillazos",
                "978-84-9066-145-1",
                10.40f);

        System.out.println(book4.overview());

        Book book5 = new Book("Florilegio de la lengua atea",
                "Ferreras, Juan Ignacio",
                "Curso acelerado de ateísmo",
                "978-84-8218-031-1",
                4.00f);

        System.out.println(book5.overview());

        Book book6 = new Book("Discurso sobre o filho da puta",
                "Pimenta, Alberto",
                "O pequeno filho-da-puta é sempre um pequeno filho-da-puta; mas não há filho-da-puta, por pequeno que seja, que não tenha a sua própria grandeza, diz o pequeno filho-da-puta",
                "978-98-9830-603-6",
                10.97f);

        System.out.println(book6.overview());

        Book book7 = new Book("The Anarchist Cookbook",
                "Powell, William",
                "This book is not for children or morons",
                "978-09-6230-320-3",
                22.00f);

        System.out.println(book7.overview());

    }




}