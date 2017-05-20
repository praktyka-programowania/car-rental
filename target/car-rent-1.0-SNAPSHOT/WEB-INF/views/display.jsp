<%@include file="/WEB-INF/common/header.jspf"%>
<h1>${error}</h1>
<c:choose>
    <c:when test="${list.size() > 0}">
        <table class="table">
            <thead>
            <tr>
                <th>Company</th>
                <th>Model</th>
                <th>Year</th>
                <th>Price</th>
            </tr>
            </thead>
            <c:forEach items="${list}" var="car">
                <tbody>
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
                            <div class="form-group">
                                <input type="hidden" value="${car.id}">
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-primary" value="Like this">
                            </div>
                        </form>
                    </td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <a href="/search">Back</a>
    </c:otherwise>
</c:choose>
<%@include file="/WEB-INF/common/footer.jspf"%>
