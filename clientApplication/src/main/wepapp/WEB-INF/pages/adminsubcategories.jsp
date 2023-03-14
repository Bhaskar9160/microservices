<DOCTYPE HTML>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<table>
			<tr>
				<th>SNO</th>
				<th>CategoryName</th>
				<th>CategoryDescription</th>
				<th>CategoryCode</th>
				<th></th>
			</tr>
			<c:forEach items="${subCategories}" var="subcategories" varStatus="st">
				<tr>
					<td>${st.count}</td>
					<td>${subcategories.subCategoryName}</td>
					<td>${subcategories.subCategoryDescription}</td>
					<td>${subcategories.subCategoryCode}</td>
					<td>
						<a href="editsubcategory?subCategoryId=${subcategories.subCategoryId}">EditSubCategory</a>
						<a href="deletesubcategory?subCategoryId=${subcategories.subCategoryId}">DeleteSubCategory</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>