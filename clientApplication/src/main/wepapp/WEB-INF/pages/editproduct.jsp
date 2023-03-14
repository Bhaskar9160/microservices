<DOCTYPE HTML>
<html>
	<head>
		<title>AddProduct</title>
	</head>
	<body>
		<form action="addproduct" method="post" >
			<table>
				<tr>
					<th>ProductName</th>
					<td>
						<input type="text" name="productName" value="${requestScope.category.productName }">
					</td>
				</tr>
				<tr>
					<th>ProductCode</th>
					<td>
						<input type="text" name="productCode" value="${requestScope.category.productCode }">
					</td>
				</tr>
				<tr>
					<th>ProductDescription</th>
					<td>
						<textarea name="productDescription">${requestScope.category.productDescription }</textarea>
					</td>
				</tr>
				<tr>
					<th>ProductImageName</th>
					<td>
						<input type="text" name="productImageName" value="${requestScope.category.productImageName }">
					</td>
				</tr>
				<tr>
					<th>CategoryId</th>
					<td>
						<input type="text" name="categoryId" value="${requestScope.category.categoryId }">
					</td>
				</tr>
				<tr>
					<th>ProductStatus</th>
					<td>
						<input type="text" name="productStatus" value="${requestScope.category.productStatus }">
					</td>
				</tr>
				<tr>
					<th>SubCategoryId</th>
					<td>
						<input type="text" name="subCategoryId" value="${requestScope.category.subCategoryId }">
					</td>
				</tr>
				<tr>
					<td colspan="2" value="update">
					<input type="submit" value="AddProduct">
					<input type="hidden" name="productId" value="${requestScope.category.productId }">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>