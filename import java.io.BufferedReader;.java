import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
  public String execCmd(String cmd) {
    try {
        Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
        String line = null;
        StringBuffer sb = new StringBuffer();
        sb.append(cmd);
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
}
