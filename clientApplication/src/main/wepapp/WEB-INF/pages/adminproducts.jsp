<DOCTYPE HTML>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<table>
			<tr>
				<th>SNO</th>
				<th>ProductName</th>
				<th>productCode</th>
				<th>ProductDescription</th>
				<th>ProductImageName</th>
				<th>CategoryId</th>
				<th>SubCategoryId</th>
				<th>ProductStatus</th>
				
				<th></th>
			</tr>
			<c:forEach items="${products}" var="products" varStatus="st">
				<tr>
					<td>${st.count}</td>
					<td>${products.productName}</td>
					<td>${products.productDescription}</td>
					<td>${products.productCode}</td>
					<td>${products.productImageName}</td>
					<td>${products.categoryId }</td>
					<td>${products.subCategoryId }</td>
					<td>${products.productStatus }</td>
					<td>
						<a href="editproduct?productId=${products.productId}">EditProduct</a>
						<a href="deleteproduct?productId=${products.productId}">DeleteProduct</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>