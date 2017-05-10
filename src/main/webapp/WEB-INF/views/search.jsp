<%@include file="/WEB-INF/common/header.jspf"%>

    <form:form commandName="car" method="post">


        <form:label path="company">Company:</form:label>
        <form:select path="company" id="companyForm" onchange="unable('#modelForm')">
            <option value="NONE">---</option>
            <c:forEach var="car" items="${list}">
                <form:option value="${car.company}">${car.company}</form:option>
            </c:forEach>
        </form:select>

        <form:label path="model">Model:</form:label>
        <form:select path="model" id="modelForm" disabled="true" onchange="unable('#yearForm')">
            <option value="NONE">---</option>
            <c:forEach var="car" items="${list}">
                <form:option value="${car.model}" data-chained="${car.company}">${car.model}</form:option>
            </c:forEach>
        </form:select>


        <form:label path="year">Year:</form:label>
        <form:select path="year" id="yearForm" disabled="true">
            <option value="NONE">---</option>
            <% for (int i = 1995; i < 2017; ++i) { %>
            <form:option value="<%= i%>"><%= i%></form:option>
            <%}%>
        </form:select>

    <input type="submit" value="Go searching">
    </form:form>

</div>
<script src="/resources/jquery-3.2.1.min.js"></script>
<script src="/resources/jquery.chained.js"></script>
<script src="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script>
   function unable(current){$(current).removeAttr("disabled");}
    $("#modelForm").chained("#companyForm");
</script>
</body>
</html>
