package simpleServer;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpServerStandard {

    private static final String INDEX_HTML = "<html>\n" +
            "<head>\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n" +
            "    <title>Hello</title>\n" +
            "<script>\n"+
            "var request;\n"+
            "function sendInfo()\n"+
            "{\n"+
            "var v=document.vinform.t1.value;\n"+
            "var url=\"test?val=\"+v;\n"+

            "if(window.XMLHttpRequest){\n"+
            " request=new XMLHttpRequest();\n"+
            "}\n"+
            "else if(window.ActiveXObject){\n"+
            "   request=new ActiveXObject(\"Microsoft.XMLHTTP\");\n"+
            "}\n"+

            "try\n"+
            "{\n"+
            "request.onreadystatechange=getInfo;\n"+
            "request.open(\"POST\",url,true);\n"+
            "request.send();\n"+
            " }\n"+
            "   catch(e)\n"+
            "   {\n"+
            "       alert(\"Unable to connect to server\");\n"+
            "    }\n"+
            "}\n"+

            "function getInfo(){\n"+
            "   if(request.readyState==4){\n"+
            "       var val=request.responseText;\n"+
            "       document.getElementById('amit').innerHTML=val;\n"+
            "   }\n"+
            "}\n"+

            "</script>\n"+
            "</head>\n" +
            "<body>\n" +
            "<h2>Hi There!</h2>\n" +
            "<br>\n" +
            "<form name=\"vinform\">"+
            "<input type=\"text\" name=\"t1\">"+
            "<input type=\"button\" value=\"ShowTable\" onClick=\"sendInfo()\">"+
            "</form>"+
            "<span id=\"amit\"> </span>\n"+
            "</body>\n" +
            "</html>";


    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = INDEX_HTML;
            if (isAjaxRequest(t)) {
                String val = getVal(t);
                response = val +" FOUND IT" + new Date();
            }
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    private static boolean isAjaxRequest(HttpExchange t) {
        for (Map.Entry<String, List<String>> stringListEntry : t.getRequestHeaders().entrySet()) {
            String key = stringListEntry.getKey();
            if (key.equalsIgnoreCase("X-Requested-With")) {
                return stringListEntry.getValue().contains("XMLHttpRequest");
            }
        }
        return false;
    }

    private static String getVal(HttpExchange t) {
        String query = t.getRequestURI().getQuery();
        if(query != null ) {
            Matcher matcher = Pattern.compile(".*val=(.*)^?.*").matcher(query);
            if (matcher.find()) {
                String val = matcher.group(1);
                System.out.println(val);
                return val;
            }
        }
        return null;
    }
}
