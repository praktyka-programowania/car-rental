<%@ include file="/WEB-INF/common/header.jspf"%>

<form:form commandName="car" method="post">
    <fieldset>
        <form:label path="company">Company</form:label>
        <form:errors path="company" cssClass="text-warning"/>
        <form:input path="company" type="text" required="required"/>
    </fieldset>

    <fieldset>
        <form:label path="model">Model</form:label>
        <form:errors path="model" cssClass="text-warning"/>
        <form:input path="model" type="text" required="required"/>
    </fieldset>

    <fieldset>
        <form:label path="year">Year</form:label>
        <form:errors path="year" cssClass="text-warning"/>
        <form:input path="year" type="number" min="1995" required="required"/>
    </fieldset>

    <fieldset>
        <form:label path="price">Price</form:label>
        <form:errors path="price" cssClass="text-warning"/>
        <form:input path="price" type="number" min="0" required="required"/>
    </fieldset>

    <fieldset>
        <form:label path="url">Image</form:label>
        <form:errors path="url" cssClass="text-warning"/>
        <form:input path="url" type="text" required="required" readonly="true"/>
        <form:button value="Attach" name="attach"/>
    </fieldset>

    <input type="submit" value="Add">
</form:form>

<%@ include file="/WEB-INF/common/footer.jspf"%>