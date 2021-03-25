package f.a.a.a.a.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public HttpURLConnection f2863a;

    /* renamed from: b  reason: collision with root package name */
    public OutputStream f2864b = this.f2863a.getOutputStream();

    /* renamed from: c  reason: collision with root package name */
    public PrintWriter f2865c;

    public b(String requestURL, String charset, String username, String password) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(requestURL).openConnection();
        this.f2863a = httpURLConnection;
        httpURLConnection.setRequestMethod("POST");
        this.f2863a.setUseCaches(false);
        this.f2863a.setDoOutput(true);
        this.f2863a.setDoInput(true);
        this.f2863a.setRequestProperty("Host", "host");
        this.f2863a.setRequestProperty("Accept", "application/json, text/plain, */*");
        this.f2863a.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        this.f2863a.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36 Edg/83.0.478.37");
        this.f2863a.setRequestProperty("username", username);
        this.f2863a.setRequestProperty("password", password);
        this.f2863a.getOutputStream().close();
        this.f2865c = new PrintWriter((Writer) new OutputStreamWriter(this.f2864b, charset), true);
    }

    public List<String> a() {
        List<String> response = new ArrayList<>();
        this.f2865c.append((CharSequence) "\r\n").flush();
        PrintWriter printWriter = this.f2865c;
        printWriter.append((CharSequence) ("--" + ((String) null) + "--")).append((CharSequence) "\r\n");
        this.f2865c.close();
        int status = this.f2863a.getResponseCode();
        if (status == 200) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.f2863a.getInputStream()));
            while (true) {
                String line = reader.readLine();
                if (line != null) {
                    response.add(line);
                } else {
                    reader.close();
                    this.f2863a.disconnect();
                    return response;
                }
            }
        } else {
            throw new IOException("Server returned non-OK status: " + status);
        }
    }
}
