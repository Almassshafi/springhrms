<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Add New Employee</title>
    </head>
    <body>
        <div id="formdiv">
            <h1>Add New Employee</h1>
            <p>Use this form to manage your employees.</p>
            <form enctype="application/x-www-form-urlencoded" method="post" action="/index/new">
                <dl class="zend_form">
                    <dt id="employeeid-label">&#160;</dt>
                    <dd id="employeeid-element">
                        <input type="hidden" name="employeeid" value="" id="employeeid"></dd>
                    <dt id="FirstName-label"><label for="FirstName" class="required">First Name:</label></dt>
                    <dd id="FirstName-element">
                        <input type="text" name="FirstName" id="FirstName" value="">
                        <ul class="errors"><li>Value is required and can't be empty</li></ul></dd>
                    <dt id="LastName-label"><label for="LastName" class="required">Last Name:</label></dt>
                    <dd id="LastName-element">
                        <input type="text" name="LastName" id="LastName" value="">
                        <ul class="errors"><li>Value is required and can't be empty</li></ul></dd>
                    <dt id="email-label"><label for="email" class="required">Email address:</label></dt>
                    <dd id="email-element">
                        <input type="text" name="email" id="email" value="">
                        <ul class="errors"><li>Value is required and can't be empty</li></ul></dd>
                    <dt id="HireDate-label"><label for="HireDate" class="required">Hire Date:</label></dt>
                    <dd id="HireDate-element">
                        <input type="text" name="HireDate" id="HireDate" value="">
                        <ul class="errors"><li>Value is required and can't be empty</li></ul></dd>
                    <dt id="JobId-label"><label for="JobId" class="required">Job Title:</label></dt>
                    <dd id="JobId-element">
                        <select name="JobId" id="JobId">
                            <option value="AD_VP" selected="selected">Vice President</option>
                            <option value="AD_PRES">President</option>
                        </select></dd>
                    <dt id="submit-label">&#160;</dt><dd id="submit-element">
                        <input type="submit" name="submit" id="submit" value="Create Employee"></dd>
                    <dt id="cancel-label">&#160;</dt><dd id="cancel-element">
                        <button name="cancel" id="cancel" type="button" onclick="window.open( & #39; /employee&#39;,&#39;_self&#39;)">Cancel Action</button>
                    </dd>
                </dl>
            </form>
        </div>
    </body>
</html>
