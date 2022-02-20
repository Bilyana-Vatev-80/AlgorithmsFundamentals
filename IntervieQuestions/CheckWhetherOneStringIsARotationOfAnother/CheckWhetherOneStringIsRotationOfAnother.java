package IntervieQuestions.CheckWhetherOneStringIsARotationOfAnother;

public class CheckWhetherOneStringIsRotationOfAnother {
    public static void main(String[] args) {
        /*
        If s1 and s2 are two given strings,
        then write a java program to check whether
         s2 is a rotated version of s1?
         */

        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";

        if(s1.length() != s2.length()){
            System.out.println("s2 is not rotated version of s1");
        } else {

            String s3 = s1 + s1;

            if(s3.contains(s2)){
                System.out.println("s2 is a rotated version of s1");
            } else {
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }
}
