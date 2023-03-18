package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "БАРМАГЛОТ <br>" +
                "<br>" +
                "   Варкалось. Хливкие шорьки <br>" +
                "   Пырялись по наве, <br>" +
                "   И хрюкотали зелюки, <br>" +
                "   Как мюмзики в мове. <br>" +
                "<br>" +
                "   О бойся Бармаглота, сын! <br>" +
                "   Он так свирлеп и дик, <br>" +
                "   А в глуше рымит исполин - <br>" +
                "   Злопастный Брандашмыг! <br>" +
                "<br>" +
                "   Но взял он меч, и взял он щит,<br>" +
                "   Высоких полон дум. <br>" +
                "   В глущобу путь его лежит <br>" +
                "   Под дерево Тумтум. <br>" +
                "<br>" +
                "   Он стал под дерево и ждет. <br>" +
                "   И вдруг граахнул гром - <br>" +
                "   Летит ужасный Бармаглот <br>" +
                "   И пылкает огнем! <br>" +
                "<br>" +
                "   Раз-два, раз-два! Горит трава, <br>" +
                "   Взы-взы - стрижает меч, <br>" +
                "   Ува! Ува! И голова <br>" +
                "   Барабардает с плеч! <br>" +
                "<br>" +
                "   О светозарный мальчик мой! <br>" +
                "   Ты победил в бою! <br>" +
                "   О храброславленный герой, <br>" +
                "   Хвалу тебе пою! <br>" +
                "<br>" +
                "   Варкалось. Хливкие шорьки <br>" +
                "   Пырялись по наве. <br>" +
                "   И хрюкотали зелюки, <br>" +
                "   Как мюмзики в мове. ";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.close();
    }

    public void destroy() {
    }
}