
package online_examination;

public class Captcha {
    public String generateCaptcha() {
         String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYW";
        String captcha = "";
        int len=8;
        while(len>0) {
            int num = (int) (Math.random()*1000) ;
            captcha+=s.charAt(num%52);
            --len;
        }
        return captcha;
    }
}
