import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class abc extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
            IOException {
        String acceptLanguage = req.getHeader("Accept-Language");
        String acceptCharset = req.getHeader("Accept-Charset");

        res.getOutputStream().println("acceptLanguage: " + acceptLanguage);
        res.getOutputStream().println("acceptCharset" + acceptCharset);
    }
}