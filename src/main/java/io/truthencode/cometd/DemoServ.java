package io.truthencode.cometd;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;

public class DemoServ extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException,IOException
    {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw=res.getWriter();//get the stream to write the data

//writing html in the stream
        String name=req.getParameter("name");
        pw.println("Welcome "+name);
    }}