public class Main {
    public static void main(String[] args) {

        //question 1
        Word word = new Word("כלב", "dog");
        System.out.println(word.toString());


        //question 2

        //א
        //2. אחד ריקה ואחד שמקבלת 2 מספרים ממשיים

        //ב
        //1 ומקבלת 2 מספרים שלמים

        //ג
        //


        //question 3

        //א
        //השיטה מדפיסה 10 כוכביות בטור

        //ב
        //הפונקציה מקבלת מספר שלם ובודקת כמה פעמים הוא מתחלק ב-3 ללא שארית. לתשובה שמתקבלת מוסיפים 1
        //אם המספר קטן מאפס הלולאה לא רצה והמשתנה C יישאר אפס
        // הערה: הלולאה מתחילה בi=0 ולכן המשתנה c עולה ב-1 כבר בהתחלה

        //ג
        //הפונקציה מקבלת מספר שלם, אם הוא גדול מאפס הלולאה נכנסים ללופ אינסופי מכיוון שכל מספר חיובי לחלק ל-10 עדיין יישאר חיובי
        //אם המספר שווה או קטן לאפס הלולאה לא רצה וC יישאר אפס


        //question 4
        Book b1 = new Book("Oliver Twist", "Charles Dikens", 200);
        System.out.println(b1);
        System.out.println("Book name: " + b1.getName());
        System.out.println("Book author: " + b1.getAuthor());
        System.out.println("Book pages: " + b1.getNumberOfPages());
    }
}