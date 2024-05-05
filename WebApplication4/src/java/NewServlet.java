import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // Obtener el parámetro "nombre" de la solicitud
        String nombre = request.getParameter("username");
        String contra = request.getParameter("contra");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<style> body {\n" +
"            margin: 0;\n" +
"            font-family: Courier, sans-serif;\n" +
"        }\n" +
"        .container {\n" +
"            width: 90%;\n" +
"            margin-left: 3%;\n" +
"        }"
                    + "header {\n" +
"    background-color: #d5e2cd;\n" +
"    color: #000000;\n" +
"    padding: 10px 0;\n" +
"}\n" +
"\n" +
"header h1 {\n" +
"    margin: 0;\n" +
"    font-size: 24px;\n" +
"}\n" +
"\n" +
"nav ul {\n" +
"    list-style-type: none;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"}\n" +
"\n" +
"nav ul li {\n" +
"    display: inline;\n" +
"    margin-right: 20px;\n" +
"}\n" +
"\n" +
"nav ul li a {\n" +
"    color: #000000;\n" +
"    text-decoration: none;\n" +
"}\n" +
"\n" +
"footer {\n" +
"    background-color: #d5e2cd;\n" +
"    color: black;\n" +
"    text-align: center;\n" +
"    padding: 10px 0;\n" +
"    position: fixed; \n" +
"    bottom: 0; \n" +
"    width: 100%; \n" +
"}"
                    + ""
                    + ".contenido\n" +
"{\n" +
"    margin: 12% 0 0 32%;\n" +
"    font-size: 23px;\n" +
"}</style>");
            
            
            out.println("<header>\n" +
"    <div class=\"container\">\n" +
"        <h1>Banco ABC</h1>\n" +
"        <nav>\n" +
"            <ul>\n" +
"                <li><a href=\"#\">Inicio</a></li>\n" +
"                <li><a href=\"#\">Ingresar</a></li>\n" +
"            </ul>\n" +
"        </nav>\n" +
"    </div>\n" +
"</header>");
            out.println("<div class=\"contenido\">");
            out.println("<h1>LOS DATOS ENVIADOS:</h1>");
            // Verificar si el nombre no es nulo y no está vacío
            if (nombre != null && !nombre.isEmpty() && contra != null && !contra.isEmpty()) {
                out.println("<p>¡Hola, su usuario es " + nombre + "!</p>");
                out.println("<p>Y su contraseña es " + contra + "!</p>");
            } else {
                out.println("<p>No se proporcionó uno de los datos.</p>");
            }
            out.println("</div>");
            
            
            out.println("<footer>\n" +
"    <div class=\"container\">\n" +
"        <p>&copy; 2024 Banco ABC. Todos los derechos reservados.</p>\n" +
"    </div>\n" +
"</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
