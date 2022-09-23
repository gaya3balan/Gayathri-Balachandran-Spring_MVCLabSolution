<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Required meta tags -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	
	<style>
			
	.title-container{
		 background-color:yellow;
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
<title>Save Customer</title>


</head>
<body>
	<div class="title-container">
		<h3>STUDENT DEBATE PORTAL</h3>
	</div>	
	
		<hr>

	<div class="container">

        <br>
		
		<p class="h4 mb-4">Save Student</p>

		<form action="save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Student.id}" />

			<table class="formcontrols" > 
  
    <tr>
        <td>
            <label for="student_name">Student Name:</label>
        </td>
        <td  style="padding-left:100px;" text-align:center>
            <input id="student_name" input type="text" name="student_name" value="${Student.studentName}"  placeholder="Student Name"/>
            
        </td>
    </tr>
    
    <tr>
        <td>
            <label for="student_department">Student Department:</label>
        </td>
        <td  style="padding-left:100px;">
            <input id="student_department" input type="text" name="student_department" value="${Student.studentDepartment}" placeholder="Student Department"/>
        </td>
    </tr>


    <tr>
        <td>
            <label for="country">Country:</label>
        </td>
        <td  style="padding-left:100px;">
            <input id="country" input type="text" name="country" value="${Student.country}"  placeholder="Country"/>
        </td>
    </tr>
    
     <tr>
        <td>
            <label > </label>
             <label > </label>
              <label > </label>
        </td>
    </tr>

</table>
			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>
		
		 <br>
		 <br>
		 
		<a href="list">Back to Student List</a>

	</div>
	
</body>
</html>