<%@include file="/WEB-INF/common/header.jspf"%>
<table>
    <c:forEach items="${list}" var="car">
        <tr>
            <td>
                ${car.company}
            </td>
            <td>
                    ${car.model}
            </td>
            <td>
                    ${car.year}
            </td>
            <td>
                    ${car.price}
            </td>
            <td>
                <form method="post" action="/rent">
                    <input type="hidden" value="${car.id}">
                    <input type="submit" value="Pay it">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<%@include file="/WEB-INF/common/footer.jspf"%>
