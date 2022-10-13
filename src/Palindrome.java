public class Palindrome {
    public static void main (String[] args)
    {
        for (int i = 0; i < args.length; i++) //метод length-возвращает длину строки
        {
            String s = args[i];
            System.out.print(s + " ");
            System.out.println(isPalindrome(s));
        }
    }

    //переворачиваем строку (делаем реверс)
    public static String reverseString(String strings)
    {
        String reverse = "";
        for (int i = 0; i < strings.length(); i++)
        {
            reverse += strings.charAt(strings.length()-i -1);
        }
        return reverse;
    }

    //сравниваем реверс с исходной строкой
    public static boolean isPalindrome(String s)
    {
        return (s.equals(reverseString(s))); // equals для проверки значения равенства
    }

}
