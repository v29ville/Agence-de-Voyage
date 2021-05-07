<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new Contact</title>
</head>
<form method="post" action="AddContactServlet">
		<table>
			<tr>
				<th><h2>Voici un premier exemple de composant web avec un servlet</h2></th>
				<tr>
					<td><i>ID: <input type="text" name="id" size="25"></i></td>
				</tr>
				<tr>
					<td><i>First Name: <input type="text" name="fname" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Last Name: <input type="text" name="lname" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Email: <input type="text" name="email" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Submit" /><input class="button" type="reset" value="Reset"></td>
				</tr>
			
		</table>
	</form>
</html>