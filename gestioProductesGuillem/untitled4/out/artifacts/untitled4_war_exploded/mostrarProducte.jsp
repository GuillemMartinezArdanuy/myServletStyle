<%--
  Created by IntelliJ IDEA.
  User: T0kT0k Guillem Ardanuy
  Date: 21/05/2020
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>



<%@ page import="clases.GestioProductes" %>
<%@ page import="clases.Producte" %>
<%@ page import="java.util.ArrayList" %>
<% String id=request.getParameter("id"); // absorvim el id que pasem per parametre%>

<%GestioProductes gestionemProductes = new GestioProductes(); %>


<%ArrayList<Producte> totsElsProductesEnMemoria=gestionemProductes.setArrayListProductesCreats();%>


<%
    if(totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).getProducte_proximitat().equals("si")){
        //double preuOriginal= totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).getPreu();
        //float preuNou=preuOriginal*0.9;
        totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).setPreu(totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).getPreu()*0.9);    // modifiquem el preu
    }
    if(totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).getProducte_proximitat().equals("no")){
        //double preuOriginal= totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).getPreu();
        //float preuNou=preuOriginal*0.9;
        totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).setPreu(totsElsProductesEnMemoria.get(Integer.parseInt(id)-1).getPreu()*1.15);    // modifiquem el preu
    }

%>
<%=totsElsProductesEnMemoria.get(Integer.parseInt(id)-1)%>