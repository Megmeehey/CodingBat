public class test {
    public static void main(String[] args) {
        String a = "abcxaa";
        System.out.println(a);
        System.out.println(a.substring(0, 0));
        System.out.println(a.substring(0, 1));
        System.out.println(a.substring(0, a.indexOf("b")));
        System.out.println(a.substring(a.indexOf("b")));
        System.out.println(a.replaceFirst("a", ""));
    }
}
