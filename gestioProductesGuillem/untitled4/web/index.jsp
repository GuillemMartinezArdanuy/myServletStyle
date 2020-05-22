<%--
  Created by IntelliJ IDEA.
  User: T0kT0k Guillem Ardanuy
  Date: 21/05/2020
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="clases.GestioFitxers"%>
<%@ page import="clases.Producte"%>
<%@ page import="clases.GestioProductes" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <% GestioFitxers fitxer= new GestioFitxers();%>

  <%GestioProductes gestionemProductes = new GestioProductes(); %>


<%ArrayList<Producte> totsElsProductesEnMemoria=gestionemProductes.setArrayListProductesCreats();%>


  </div>
<br>
    <ul>

      <%
    try
    {
          if(request.getParameter("enviar")==null){
            out.println("tots");
            for (int i=0;i<totsElsProductesEnMemoria.size();i++)
            { // mostrem no caduquen
              out.println("<li> <a href=mostrarProducte.jsp?id="+totsElsProductesEnMemoria.get(i).getId()+">"+totsElsProductesEnMemoria.get(i).toString()+"</a></li>");
            }
          }

          else if (request.getParameter("selector").equals("caduquen"))
          {
            out.println("caduquen");
              for (int i=0;i<totsElsProductesEnMemoria.size();i++)
              { // mostrem tots els productes
                if(totsElsProductesEnMemoria.get(i).getTipus().equals("cad"))
                {
                  out.println("<li> <a href=mostrarProducte.jsp?id="+totsElsProductesEnMemoria.get(i).getId()+">"+totsElsProductesEnMemoria.get(i).toString()+"</a></li>");
                }
              }
          }
           else if (request.getParameter("selector").equals("no_caduquen"))
           {
            out.println("no caduquen");
              for (int i=0;i<totsElsProductesEnMemoria.size();i++)
              { // mostrem no caduquen
                if(totsElsProductesEnMemoria.get(i).getTipus().equals(""))
                {
                  out.println("<li> <a href=mostrarProducte.jsp?id="+totsElsProductesEnMemoria.get(i).getId()+">"+totsElsProductesEnMemoria.get(i).toString()+"</a></li>");
                }
              }
           }
          else
            {
              out.println("tots");
              for (int i=0;i<totsElsProductesEnMemoria.size();i++)
                { // mostrem no caduquen
                  out.println("<li> <a href=mostrarProducte.jsp?id="+totsElsProductesEnMemoria.get(i).getId()+">"+totsElsProductesEnMemoria.get(i).toString()+"</a></li>");
                }
              }
    } // fi try
    catch (Exception e){
      //out.println("error ho diu la excepcio");
    }
  %>




</ul>


    <form action = "index.jsp" method = "POST" >
      <input type="radio" id="tots" name="selector" value="tots"/>
      <label for="tots"> Tots</label>

      <input type="radio" id="caduquen" name="selector" value="caduquen"/>
      <label for="caduquen"> caduquen </label>

      <input type="radio" id="no_caduquen" name="selector" value="no_caduquen"/>
      <label for="no_caduquen"> no_caduquen </label>

      <input type = "submit"  name="enviar" value="enviar" />
    </form>


</body>

</html>
