/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Socios;
import modelo.SociosDao;

/**
 *
 * @author carlo
 */
public class SociosController extends HttpServlet 
{
    
     public SociosController() 
    {
        super();        
    }
    

    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         SociosDao sociosDao=null;
            try 
	    {
	    sociosDao=new SociosDao();
	    } 
	    catch (ClassNotFoundException e) 
            {	
	    e.printStackTrace();
	    }
        
        String accion;
        RequestDispatcher dispatcher=null;
        accion=request.getParameter("accion");
        if(accion==null||accion.isEmpty())
        {
            dispatcher=request.getRequestDispatcher("vistas/socios.jsp");            
        }
        
		else if(accion.equals("modificar"))
		{
			dispatcher=request.getRequestDispatcher("vistas/modificar.jsp");
		}
		else if(accion.equals("actualizar"))
		{                        
                        int id=Integer.parseInt(request.getParameter("id"));
                        String nombre=request.getParameter("nombre");
                        String apellido=request.getParameter("apellido");
                        
                        String localidad=request.getParameter("localidad");            
                        LocalDate fecha =LocalDate.parse(request.getParameter("fnac"));                 
                        String email=request.getParameter("email");
                        String telefono=request.getParameter("telefono");                                    
                        Socios s1=new Socios(id,nombre,apellido,localidad,fecha,email,telefono,true);
		        sociosDao.ActualizarSocios(s1);			
			dispatcher=request.getRequestDispatcher("vistas/socios.jsp");			
		}
		else if(accion.equals("eliminar"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
                        sociosDao.EliminarSocio(id);			
			dispatcher=request.getRequestDispatcher("vistas/socios.jsp");
		}
		else if(accion.equals("nuevo"))
		{
			dispatcher=request.getRequestDispatcher("vistas/nuevo.jsp");
		}
		else if(accion.equals("insert"))
		{
			String nombre=request.getParameter("nombre");
                        String apellido=request.getParameter("apellido");
                        
                        String localidad=request.getParameter("localidad");            
                        LocalDate fecha =LocalDate.parse(request.getParameter("fnac"));                 
                        String email=request.getParameter("email");
                        String telefono=request.getParameter("telefono");                                     
                        Socios s1=new Socios(0,nombre,apellido,localidad,fecha,email,telefono,true);
		        sociosDao.InsertSocios(s1);		
			dispatcher=request.getRequestDispatcher("vistas/socios.jsp");
		}        
        dispatcher.forward(request, response); 
    }

        
        
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        doGet(request,response); 
    }

   
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}
