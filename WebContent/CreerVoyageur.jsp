<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new Contact</title>
</head>
<form method="post" action="AddVoyageurServlet">
		<table>
			<tr>
				<th><h2>Entrez les informations du voyageurs</h2></th>
				<tr>
					<td> <i>Civilité : 

<select>
  <option value="mme">Madame</option>
  <option value="mr">Monsieur</option> </select></i>
					
					 </td>
				</tr>
				<tr>
					<td><i>Prénom : <input type="text" name="fname" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Nom : <input type="text" name="lname" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Age : <input type="text" name="age" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Numéro de pièce d'identité : <input type="text" name="cniID" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Email : <input type="text" name="email" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Adresse : <input type="text" name="rue" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Ville : <input type="text" name="ville" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Code Postal : <input type="text" name="cp" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Pays : <input type="text" name="pays" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Submit" /><input class="button" type="reset" value="Reset"></td>
				</tr>
			
		</table>
	</form>
</html>