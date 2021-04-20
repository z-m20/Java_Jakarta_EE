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

public class HelloWorldJSP extends HttpServlet {
	
	req.getRequestDispatcher("/jsp/target.jsp").forward(req, resp);
}
