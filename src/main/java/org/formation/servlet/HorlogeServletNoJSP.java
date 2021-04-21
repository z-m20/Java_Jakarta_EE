package org.formation.servlet;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.PushBuilder;

// c'est mal, des balises Html et java 
@WebServlet("/HorlogeNoJSP")
public class HorlogeServletNoJSP extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";
    
    String getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);
       

        try {
            writer.println("Bienvenue, on est le "+getDateTime());
        } catch (Exception e) {
            e.printStackTrace();
        }

        writer.println(PAGE_FOOTER);
        writer.close();
    }

}