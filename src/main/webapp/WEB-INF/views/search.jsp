<%@include file="/WEB-INF/common/header.jspf"%>
    <form:form commandName="car" method="post">
        <form:label path="company">Company</form:label>
        <form:input path="company" type="text" required="required"/>
        <form:label path="model">Model</form:label>
        <form:input path="model" type="text"/>
        <form:label path="year">Year</form:label>
        <form:input path="year" type="number" min="1990" max="2017"/>
        <input type="submit" value="Search"/>
    </form:form>
<%@include file="/WEB-INF/common/footer.jspf"%>
