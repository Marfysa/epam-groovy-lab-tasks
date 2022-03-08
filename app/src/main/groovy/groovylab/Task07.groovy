/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
        if (s.length()==0) return "";
        List arr = s.split(" ")
        def result = []
        for ( def i in arr ){
            if (i.length() <= 2){
                if (i.length() <= 1) { result << (int) w[0] }
                else {result << (int) i[0] + i[1]}
            }
            else {     
                result << (int) i[0] + i[-1] + i[2..-2] + i[1]
            }
        }
        return result.join(" ")
    }
}
