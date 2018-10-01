public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Jack London", "jack@gmail.com", 'M');
        System.out.println(a);
        a.setEmail("jack@mail.ru");
        System.out.println(a);
    }
}
