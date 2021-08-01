

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UpdateMedicine")
public class UpdateMedicine extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int medicineID = Integer.parseInt(request.getParameter("medicineID"));
		String medicineName = request.getParameter("name");
		String medicineType = request.getParameter("type");
		double medicinePrice = Double.parseDouble(request.getParameter("price"));
		int medicineQuantity = Integer.parseInt(request.getParameter("quantity"));
		Medicine med = new Medicine();
		med.updateMedicine(medicineID,medicineName, medicineType, medicinePrice, medicineQuantity);
		RequestDispatcher rd = request.getRequestDispatcher("update_medicine.jsp"); 
		rd.forward(request, response);
		
	}

}
