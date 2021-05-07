<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Créer votre profil client</title>
</head>
<body>
<h1>Créez votre profil client</h1>
<form method="post" action="AddContactServlet">
		<table>
			<tr>
				<th><p>Entrez vos informations ci-dessous:</p></th>
				<tr>
					<td><i>Civilité <select id="civilite" name="civilite">
  					<option value="mme.">Madame</option>
  					<option value="m.">Monsieur</option></select></i></td>
				</tr>
				<tr>
					<td><i>Nom: <input type="text" name="fname" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Prénom: <input type="text" name="lname" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Email: <input type="text" name="email" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Adresse: <input type="text" name="rue" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Ville: <input type="text" name="ville" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Code Postal: <input type="text" name="codePostal" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Pays: <input type="text" name="pays" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Submit" /><input class="button" type="reset" value="Reset"></td>
				</tr>
			
		</table>
	</form>
	</body>
</html>