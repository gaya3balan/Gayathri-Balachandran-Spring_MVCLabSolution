<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" >

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	
<style>
	.tablehead {
		background-color: blue;
		text-align:center;
	}
	
	.tablehead tr{
		color:white;
		text-align:center;
	}
	.title-container{
		 background-color:pink;
		    width: 100vw;
            height:100px;  
            text-align:center;
	}
	
	.title-container h3{
		color:black;
		padding:35px;
		text-align:center;
	}
	
	
</style>

<title>Student List</title>
</head>

<body>
		<div class="title-container"> 
			<h3>STUDENT DEBATE PORTAL</h3>
		</div>
		
		<hr>

	<div class="container">
	  
	  

		<div>
			<a href="showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add Student </a>  
		</div> 

		<table class="table table-bordered table-striped">
			<thead class="tablehead">
				<tr>
				    <th style="width:auto;text-align:center">Student Id</th> 
					<th style="width:auto;text-align:center">Name</th> 
					<th style="width:auto;text-align:center">Department</th>
					<th style="width:auto;text-align:center">Country</th>
					<th style="width:auto;text-align:center">Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Students}" var="tempStudent">
					
					<tr>
					    <td style="width:auto;text-align:center"><c:out value="${tempStudent.id}" /></td>
						<td style="width:auto;text-align:center"><c:out value="${tempStudent.studentName}" /></td>
						<td style="width:auto;text-align:center"><c:out value="${tempStudent.studentDepartment}" /></td>
						<td style="width:auto;text-align:center"><c:out value="${tempStudent.country}" /></td>
						<td style="width:auto;text-align:center">
							<!-- Add "update" button/link --> <a
							href="showFormForUpdate?studentId=${tempStudent.id}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a href="/StudentDebateSolution1/students/delete?studentId=${tempStudent.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete ?'))) return false">
								Delete </a>
						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>
</body>
</html>