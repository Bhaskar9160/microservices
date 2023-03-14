<DOCTYPE HTML>
<html>
	<head>
		<title>AddProduct</title>
	</head>
	<body>
		<form action="addproduct" method="post">
			<table>
				<tr>
					<th>ProductName</th>
					<td>
						<input type="text" name="productName">
					</td>
				</tr>
				<tr>
					<th>ProductCode</th>
					<td>
						<input type="text" name="productCode">
					</td>
				</tr>
				<tr>
					<th>ProductDescription</th>
					<td>
						<textarea name="productDescription"></textarea>
					</td>
				</tr>
				<tr>
					<th>ProductImageName</th>
					<td>
						<input type="text" name="productImageName">
					</td>
				</tr>
				<tr>
					<th>CategoryId</th>
					<td>
						<input type="text" name="categoryId">
					</td>
				</tr>
				<tr>
					<th>ProductStatus</th>
					<td>
						<input type="text" name="productStatus">
					</td>
				</tr>
				<tr>
					<th>SubCategoryId</th>
					<td>
						<input type="text" name="subCategoryId">
					</td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="submit" value="AddProduct">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>