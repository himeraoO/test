package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "БАРМАГЛОТ\n" +
                "\n" +
                "   Варкалось. Хливкие шорьки\n" +
                "   Пырялись по наве,\n" +
                "   И хрюкотали зелюки,\n" +
                "   Как мюмзики в мове.\n" +
                "\n" +
                "   О бойся Бармаглота, сын!\n" +
                "   Он так свирлеп и дик,\n" +
                "   А в глуше рымит исполин -\n" +
                "   Злопастный Брандашмыг!\n" +
                "\n" +
                "   Но взял он меч, и взял он щит,\n" +
                "   Высоких полон дум.\n" +
                "   В глущобу путь его лежит\n" +
                "   Под дерево Тумтум.\n" +
                "\n" +
                "   Он стал под дерево и ждет.\n" +
                "   И вдруг граахнул гром -\n" +
                "   Летит ужасный Бармаглот\n" +
                "   И пылкает огнем!\n" +
                "\n" +
                "   Раз-два, раз-два! Горит трава,\n" +
                "   Взы-взы - стрижает меч,\n" +
                "   Ува! Ува! И голова\n" +
                "   Барабардает с плеч!\n" +
                "\n" +
                "   О светозарный мальчик мой!\n" +
                "   Ты победил в бою!\n" +
                "   О храброславленный герой,\n" +
                "   Хвалу тебе пою!\n" +
                "\n" +
                "   Варкалось. Хливкие шорьки\n" +
                "   Пырялись по наве.\n" +
                "   И хрюкотали зелюки,\n" +
                "   Как мюмзики в мове. ";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}