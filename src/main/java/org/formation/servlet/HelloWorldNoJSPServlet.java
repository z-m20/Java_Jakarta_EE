package org.formation.servlet;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.PushBuilder;

// c'est mal, des balises Html et java 
@WebServlet("/HelloWorldNoJSP")
public class HelloWorldNoJSPServlet extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);

        try {
            writer.println("Hello the world !");
        } catch (Exception e) {
            e.printStackTrace();
        }

        writer.println(PAGE_FOOTER);
        writer.close();
    }

}