<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head></head>
<body>
   <h1>Login</h1>
   <form name='f' action="<c:url value='j_spring_security_check' />" method='POST'>
      <table>
         <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
       <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
  </form>
</body>
</html>