/**
Insert first input string inside the brackets, near the number, which equals to
the second input parameter (template is set to GSTRING_TEMPLATE static
property). Example:
Task11.gstring("test", 2) == "1() 2(test) 3()"
*/

package groovylab

class Task11 {
    private static final String GSTRING_TEMPLATE = "1() 2() 3()"

    public static String gstring(String text, int num) {
        def arr = []
        for(int x = 1; x <= 3; x++)
            x == num ? arr.add(x.toString() + "(" + text + ")") : arr.add(x.toString() + "()")  
        return arr.join(" ")
    }
}
