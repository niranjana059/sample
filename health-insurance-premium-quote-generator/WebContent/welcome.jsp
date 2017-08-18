<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>health-insurance-premium-quote-generator</title>
</head>
<body>
	<form action="generate_quote.do" method="GET">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" id="name"></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><select name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Others">Others</option>
				</select></td>
			</tr>

			<tr>
				<td>Age</td>
				<td><input type="text" name="age" id="age"></td>
			</tr>

			<tr>
				<td>Current Health :</td>
				<td></td>
			</tr>
			<tr>
				<td>Hypertension</td>
				<td><select name="hypertension">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>
			<tr>
				<td>Blood pressure</td>
				<td><select name="blood_pressure">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>
			<tr>
				<td>Blood sugar</td>
				<td><select name="blood_sugar">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>
			<tr>
				<td>Overweight</td>
				<td><select name="overweight">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>

			<tr>
				<td>Habits</td>
				<td></td>
			</tr>
			<tr>
				<td>Smoking</td>
				<td><select name="smoking">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>
			<tr>
				<td>Alcohol</td>
				<td><select name="alcohol">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>
			<tr>
				<td>Daily exercise</td>
				<td><select name="daily_exercise">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>
			<tr>
				<td>Drugs</td>
				<td><select name="drugs">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Generate Quote" /></td>
				<td><input type="reset" value="reset" /></td>
			</tr>
		</table>
	</form>
</body>
</html>