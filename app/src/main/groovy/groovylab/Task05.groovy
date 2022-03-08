/**
Define, whether input string have a Ip format. Example:
Task05.isSublist("10.0.152.164") == true
*/

package groovylab

class Task05 {
    public static boolean isIp(String ip) {
        return ip ==~ /^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/
    }
}
