<DOCTYPE HTML>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<form action="updatecategory" method="post">
			<table>
				<tr>
					<th>categoryName</th>
					<td>
						<input type="text" name="categoryName" value="${requestScope.category.categoryName }">
					</td>
				</tr>
				<tr>
					<th>categoryDescription</th>
					<td>
						<textarea name="categoryDescription" >${requestScope.category.categoryDescription }</textarea>
					</td>
				</tr>
				<tr>
					<th>categoryCode</th>
					<td>
						<input type="text" name="categoryCode" value="${requestScope.category.categoryCode }">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Update">
						<input type="hidden" name="categoryId" value="${requestScope.category.categoryId }">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>