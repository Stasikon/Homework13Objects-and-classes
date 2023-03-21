public class Main {
   public static void main(String[] args) {
       Author keyes = new Author("Дэниел", "Киз");
       Book multipleMindsofBilly = new Book("Множественные умы Билли Миллигана", keyes, 1970);
       System.out.println(multipleMindsofBilly);
       Author melnikova = new Author("Мария ", "Мельникова");
       Book psychologyFingers = new Book("Психология на пальцах", melnikova, 2019);
       System.out.println(psychologyFingers);
       psychologyFingers.setPublishYear(2019);
       System.out.println(psychologyFingers);
       Author linehan = new Author("Марша", "Линехан");
       Book borderlinePersonalityDisorder = new Book("Когнитивно-поведенческая терапия пограничного расстройства личности", linehan, 1993);
       System.out.println(borderlinePersonalityDisorder);
       Book theBlackCollar1 = new Book("Когнитивно-поведенческая терапия пограничного расстройства личности", linehan, 1993);
       System.out.println(theBlackCollar1.equals(borderlinePersonalityDisorder));
       System.out.println(theBlackCollar1.equals(psychologyFingers));
       System.out.println(borderlinePersonalityDisorder.hashCode());
   }
}
