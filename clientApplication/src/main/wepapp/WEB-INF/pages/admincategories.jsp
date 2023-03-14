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
			<c:forEach items="${categories}" var="categories" varStatus="st">
				<tr>
					<td>${st.count}</td>
					<td>${categories.categoryName}</td>
					<td>${categories.categoryDescription}</td>
					<td>${categories.categoryCode}</td>
					<td>
						<a href="editcategory?categoryId=${categories.categoryId}">EditCategory</a>
						<a href="deletecategory?categoryId=${categories.categoryId}">DeleteCategory</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>