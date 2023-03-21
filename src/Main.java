public class Main {
    public static void main(String[] args) {
        Author keyes = new Author("Дэниел", "Киз");
        Book multipleMindsofBilly = new Book("Множественные умы Билли Миллигана", keyes, 1970);
        System.out.println(multipleMindsofBilly.getBookName() + ", " + keyes.getName() + " " + keyes.getSurname() + ", " + multipleMindsofBilly.getPublishYear());
        Author melnikova = new Author("Мария ", "Мельникова");
        Book psychologyFingers = new Book("Психология на пальцах", melnikova, 2019);
        System.out.println(psychologyFingers.getBookName() + ", " + melnikova.getName() + " " + melnikova.getSurname() + ", " + psychologyFingers.getPublishYear());
        psychologyFingers.setPublishYear(2019);
        System.out.println(psychologyFingers.getBookName() + ", " + melnikova.getName() + " " + melnikova.getSurname() + ", " + psychologyFingers.getPublishYear());
        Author linehan = new Author("Марша", " Линехан");
        Book borderlinePersonalityDisorder = new Book("Когнитивно-поведенческая терапия пограничного расстройства личности", linehan, 1983);
        System.out.println(borderlinePersonalityDisorder.getBookName() + ", " + linehan.getName() + " " + linehan.getSurname() + ", " + borderlinePersonalityDisorder.getPublishYear());
    }
}