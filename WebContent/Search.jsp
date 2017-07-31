<%@page import="java.util.Iterator"%>
<%@page import="com.seed.bean.Intern"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script  src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>



<script>
$(document).ready(function(){
    $('#example').DataTable();
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<!-- jQuery library -->
<!-- Latest compiled JavaScript -->
<!-- <script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<title>Insert title here</title>
</head>
<body>
	<form class="form-inline" action="RegisterServlet">
		<div class="form-group">
			<label for="sel1">Select batch:</label> <select name="batch"
				class="form-control" id="sel1">
				<option>---select---</option>
				<option>scts81</option>
				<option>spic9</option>
				<option>spic5</option>
			</select>
		</div>
		<div class="form-group">
			<label for="sel1">Select batch:</label> <select name="track"
				class="form-control" id="sel1">
				<option>---select---</option>
				<option>java</option>
				<option>testing</option>
				<option>dotnet</option>
			</select>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>

	<div class="container">
		<h2>Table</h2>
		<p>The .table-responsive class creates a responsive table which
			will scroll horizontally on small devices (under 768px). When viewing
			on anything larger than 768px wide, there is no difference:</p>
		<div class="table-responsive">
			<table id="example" class="table">
				<thead>
					<tr>
						<th>name</th>
						<th>contactNo</th>
						<th>batch</th>
						<th>track</th>
						<th>email</th>
						<th>asn</th>
						<th>gender</th>
					</tr>
				</thead>
				<tbody>
					<% 
					 ArrayList<Intern> batchInterns1=  (ArrayList)session.getAttribute("batchInterns");	
					ArrayList<Intern> trackInterns1=  (ArrayList)session.getAttribute("trackInterns");
			        ArrayList<Intern> trackAndTrackInterns1=  (ArrayList)session.getAttribute("trackAndTrackInterns");
			       /*  System.out.print(ba); */
    if(batchInterns1!=null||(trackInterns1!=null)||(trackAndTrackInterns1!=null)){
    	//System.out.print(batchInterns1.toString());
    	Iterator it=null;
         if(batchInterns1!=null){
        it= batchInterns1.iterator();
        }  
         if(trackInterns1!=null){
        	it=trackInterns1.iterator();
        }  
        if(trackAndTrackInterns1!=null){
        	it=trackAndTrackInterns1.iterator();
        }  
        while(it.hasNext()){
        	 Intern intern=(Intern)it.next();
        	 
        
    %>
					<tr>
						<td><%= intern.getName() %></td>
						<td><%= intern.getContactNo() %></td>
						<td><%= intern.getBatch() %></td>
						<td><%= intern.getTrack() %></td>
						<td><%= intern.getEmailId() %></td>
						<td><%= intern.getAsn() %></td>
						<td><%= intern.getGender() %></td>

					</tr>
					<% 
          }
        }
      %>
				</tbody>
			</table>
		</div>
	</div>


</body>
</html>